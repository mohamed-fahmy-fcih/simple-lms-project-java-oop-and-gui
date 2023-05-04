 
package HomePages;

import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.JTextField;

 
public interface  UserOperations {
    
    
    public static int verification(JTextField userName,
                                   JTextField userPassword)throws ClassNotFoundException{
        return 0;
    };
    
    
    public static void createAccount
 ( JTable userDetails ,JTextField userName , JTextField userPass 
                            ,JTextField userAddress, JTextField userPhone )  
         throws ClassNotFoundException, SQLException{
 
 };
         
    public static void retrieveUserDetails(JTable userDetails)throws ClassNotFoundException{};
    
    public static  void deleteUserDetails(JTable userDetails)throws ClassNotFoundException, SQLException {};
    
}
