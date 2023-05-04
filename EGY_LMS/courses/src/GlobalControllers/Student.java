
package GlobalControllers;

import AdminPages.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Student extends Person  {
        private static DatabaseConnector DB =  DatabaseConnector.getInstance("root","");
        private static PageController f = new PageController(true);
        static  java.sql.Statement sqlStatement;

                
    public Student(){try {
        this.sqlStatement =
                DB.CreateConnection("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306/courses", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
}
 
    
  
   
    public  void createStudent(
            
            JComboBox courseList , JTable allStudentsView , JTextField takeStudentAddress ,
            JTextField takeStudentPhone ,JTextField takeStudentAge,
            JTextField takeStudentFirstName,JTextField takeStudentLastName,JTextField takeStudentMiddileName){
        DefaultTableModel model = (DefaultTableModel) allStudentsView.getModel();
         
            try {
                setUserName( takeStudentFirstName.getText() + 
                        takeStudentMiddileName.getText() + takeStudentLastName.getText()) ;
                setAge( takeStudentAge.getText() );
                setPhone( takeStudentPhone.getText() );
                setAddress( takeStudentAddress.getText() );
                setCourseName(  (String) courseList.getSelectedItem() );
                Object obj[] = {getUserName() 
                        , getAge()  , getPhone()  , getAddress() , getCourseName() };
                
                String []dbColumnName = {"FULL_NAME","AGE","HOMEPHONE","ADDRESS","COURS"} ;
                String []dbValues = {getUserName() 
                        , getAge()  , getPhone()  , getAddress() , getCourseName() } ;
                if(DB.insertAll(sqlStatement, "students_information", dbColumnName, dbValues)==1){
                    model.addRow(obj);
                    JOptionPane.showMessageDialog(null, "Student Created .");
                }
                JTextField [] collectDetails = {takeStudentLastName , takeStudentMiddileName
                        , takeStudentFirstName ,takeStudentFirstName , takeStudentMiddileName 
                        , takeStudentLastName , takeStudentAge  , takeStudentPhone,takeStudentAddress };
                f.deleteTextField(collectDetails);
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    
    public static void deleteingStudent(JTable studentsDetails){
        DefaultTableModel model = (DefaultTableModel) studentsDetails.getModel();
        int CurrentRow = -1 ;
        CurrentRow = studentsDetails.getSelectedRow();
        if(CurrentRow == -1){
            JOptionPane.showMessageDialog(null, "Choose one row to delete it");
        }
        else{
            try{
                java.sql.Statement stat = DB.CreateConnection("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306/courses", "root", "") ;
                int selectedRow = studentsDetails.getSelectedRow() ;
                DB.deleteWhere(stat, "students_information", "FULL_NAME", studentsDetails.getValueAt(CurrentRow, 0)+"");
                model.removeRow(CurrentRow);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }
    
    public static void getStudent(JComboBox courseNameList , JTable studentDetails){
        try{
            int count = DB.Count("students_information", sqlStatement) ;
            ResultSet rs = DB.SelectAll("students_information", sqlStatement);
            DefaultTableModel model = (DefaultTableModel) studentDetails.getModel();
            while(rs.next()){
                Object []obj = {
                    rs.getString("FULL_NAME"),
                    rs.getString("AGE"),
                    rs.getString("HOMEPHONE"),
                    rs.getString("ADDRESS"),
                    rs.getString("COURS") ,
                };
                model.addRow(obj);
            }
            rs = DB.SelectAll("courses_information", sqlStatement) ;
            while(rs.next()){
                courseNameList.addItem(rs.getString("CourseName"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminViewStudentEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     
}
