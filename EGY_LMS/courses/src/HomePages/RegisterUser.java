package HomePages;
import AdminPages.*;
import AdminPages.AdminViewCreateAccount;
import GlobalControllers.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class RegisterUser extends GlobalControllers.Person implements UserOperations{
 
    //cons database for this class
    private static DatabaseConnector DB = DatabaseConnector.getInstance("root","");
    private static PageController f = new PageController(true);
    private static  String DBurl ="jdbc:mysql://localhost:3306/courses?zeroDateTimeBehavior=CONVERT_TO_NULL"; 
    private static String DBdriver ="com.mysql.cj.jdbc.Driver"; 
    static LoginUser sign = new LoginUser();

    //the constructor 
    public RegisterUser()
    {
        
    }
         

        
    public  static int verification(JTextField userName,
                                   JTextField userPassword) throws ClassNotFoundException{
        
        int goodAcess = 0  ;
            try {
                java.sql.Statement stat = DB.CreateConnection(DBdriver ,DBurl , "root", "");
                int tableRowsCount = DB.Count("register", stat) ;
                ResultSet rs = DB.SelectAll("register", stat);
               
                //Array of objects for this class 
                RegisterUser rj[] = new RegisterUser[tableRowsCount] ;
                //initialize those objects 
                for(int i = 0 ; i < tableRowsCount ; i++)
                {
                    rj[i] = new RegisterUser();//create //initail
                }
                int w = 0 ;
               //set the value in them as where as Database Table 
                while(rs.next())//while u have more in table DataBase 
                {
                    rj[w].setUserName(rs.getString("UserName"));
                    rj[w].setPassword(rs.getString("Password"));
                    rj[w].setType(rs.getString("Type"));
                    rj[w].setPath(rs.getString("Path"));
                    if(w!=tableRowsCount){w++ ;}
                }
                
                
                String UserName = userName.getText() ;
                String password = userPassword.getText() ;
                    //Check Verification
                for(int i = 0 ; i < tableRowsCount ;i++){
                    if(UserName.compareTo(rj[i].getUserName()) == 0 &&
                        password.compareTo(rj[i].getPassword()) == 0 &&
                        rj[i].getType().compareTo("Admin") == 0
                      )
                    {//do this if#1
                      new AdminViewHome().setVisible(true);
                      goodAcess=1;
                    }
                 }
            } catch (Exception ex) {
                Logger.getLogger(LoginUser.class.getName()).log(Level.SEVERE, null, ex);
            }
            return goodAcess ;
    }//end verification func
    
    
     
    public static void createAccount
 ( JTable userDetails ,JTextField userName , JTextField userPass ,JTextField userAddress, JTextField userPhone )
         throws ClassNotFoundException, SQLException{
        DatabaseConnector DB = DatabaseConnector.getInstance("root","");
        if(userName.getText().compareTo("") == 0 ||userPass.getText().compareTo("") == 0 ){
            JOptionPane.showMessageDialog(null, "This faild can't be empty");
        }
        else{
            String Username = userName.getText();
            String password = userPass.getText();
            String Type     = userAddress.getText();
            String Path     = userPhone.getText() ;
            java.sql.Statement stat =  DB.CreateConnection(DBdriver ,DBurl , "root", "");
            
            try {
                
                DefaultTableModel model = (DefaultTableModel) userDetails.getModel();
                int checkQuery = stat.executeUpdate("insert into register(UserName,Password,Type,Path)values"
                        + "('" +Username+ "','"+password+"','"+Type+"','"+Path+"')") ;
                
                if(checkQuery== 1){
                    //Create some array of rows
                    Object obj[] = {Username ,password ,Type ,Path};
                   //then  insert them in the table module
                   model.addRow(obj);
                }
          
            }
            catch (SQLException ex) 
            {
                if(String.valueOf(ex).contains("Duplicate entry"))
                {
                    JOptionPane.showMessageDialog(null, "UserName is alreay Exist");
                }
            } catch (Exception ex)
            {
                Logger.getLogger(AdminViewCreateAccount.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
     
    
     
    public static  void retrieveUserDetails(JTable userDetails) throws ClassNotFoundException{
        try {

            java.sql.Statement stat = DB.CreateConnection(DBdriver ,DBurl , "root", "");
            ResultSet rs = DB.SelectAll("register", stat) ;
            DefaultTableModel model = (DefaultTableModel) userDetails.getModel();
            while(rs.next()){
                Object obj [] = {
                    rs.getString("UserName") ,
                    rs.getString("Password") ,
                    rs.getString("Type") ,
                    rs.getString("Path")
                };
                model.addRow(obj);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    
    
    public static  void deleteUserDetails(JTable userDetails) throws ClassNotFoundException, SQLException{
        java.sql.Statement st =DB.CreateConnection(DBdriver ,DBurl , "root", "");
        DefaultTableModel model = (DefaultTableModel) userDetails.getModel();
        int rowUsed    = userDetails.getSelectedRow() ;
        if(DB.deleteWhere(st, "register", "UserName", userDetails.getValueAt(rowUsed, 0)+"") == 1){
            model.removeRow(rowUsed);
                }
            }
}

