/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoursePages;


import GlobalControllers.PageController;
import GlobalControllers.DatabaseConnector;
import AdminPages.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class CourseController  extends CourseDetails implements Course_CRUD_Database_operations {
//    courseTable ,JTextField courseName,JTextField courseBranch,
//            JTextField courseRoom, JTextField courseCountOfStudents ,
//                JTextField coursePrice
   
    private static DatabaseConnector DB =  DatabaseConnector.getInstance("root","");
    private static PageController f = new PageController(true);
    
    public CourseController(){}
    
    
    
    
    
    
    
    public static void RetriveCourse(JTable TABLEcourse  ){
        try {
            java.sql.Statement st = DB.CreateConnection("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306/courses", "root", "");
            ResultSet rs = DB.SelectAll("courses_information", st);
            int i = 0 ;
            DefaultTableModel model = (DefaultTableModel) TABLEcourse.getModel();
            while(rs.next()){
                Object obj [] = {
                    rs.getString("CourseName"),
                    rs.getString("Branch"),
                    rs.getString("Room"),
                    rs.getString("AllowedStudent"),
                    rs.getString("Price"),
             };
                model.addRow(obj);
                              }
        } catch ( Exception ex) {
            Logger.getLogger(AdminViewCreateAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
 
    public static void RetriveAllCourses
       (JTable allCoursesDefaultView ,JLabel courseCountOfStudents ,JLabel CountOfStudents ) 
               throws ClassNotFoundException{
        try{
            DefaultTableModel model1 = (DefaultTableModel) allCoursesDefaultView.getModel();
            Statement stat = DB.CreateConnection("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306/courses", "root", "") ;
            int count  = DB.Count("courses_information" , stat) ;
            
           
            ResultSet rs = DB.SelectAll("courses_information", stat);
            CourseController CI[] = new CourseController[count];
            for(int i = 0 ; i < count ; i++){
                CI[i] = new CourseController() ;
            }
            int h = 0 ;
            while(rs.next()){
                CI[h].setCourseName(rs.getString("CourseName")) ;
                CI[h].setBranch(rs.getString("Branch"));
                CI[h].setRoom(rs.getString("Room")) ;
                CI[h].setNumberOfStudentAllowd(rs.getString("AllowedStudent"));
                CI[h].setprice(rs.getString("Price"));
                h++;
            }
            for(int i = 0 ; i < count ; i++){
                
                Date date = new Date();
                java.text.SimpleDateFormat myF = new java.text.SimpleDateFormat("yyyy-MM-dd");
                String curTime = myF.format(date) ;
                Object obj[] = {
                        CI[i].getCourseName(),
                        CI[i].getnumberOfStudentAllowd(),
                     } ;
                    model1.addRow(obj);
                }
        } catch (SQLException ex) {
            
        }
    }
     
    public static void DeleteCourse(JTable TABLEcourse) throws ClassNotFoundException{
        DefaultTableModel model = (DefaultTableModel) TABLEcourse.getModel();
        int CurrentRow = model.getRowCount();
        int CurrentColumn = model.getColumnCount();
        int LENG = model.getRowCount() ;
        CurrentRow = -1 ;
        CurrentRow = TABLEcourse.getSelectedRow();
        if(CurrentRow == -1){
            JOptionPane.showMessageDialog(null, "Choose one row to delete it");
        }
        else{
            try {
                java.sql.Statement st = DB.CreateConnection("com.mysql.cj.jdbc.Driver","jdbc:mysql://localhost:3306/courses", "root", "");

                ResultSet rs =  DB.SelectAll("courses_information", st);
                String VALUE = (String) TABLEcourse.getValueAt(CurrentRow, 0);
                DB.deleteWhere(st,"courses_information" , "CourseName", VALUE);
                model.removeRow(CurrentRow);
            } catch (SQLException ex) {
                Logger.getLogger(CourseController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
     
    public static void UpdateCourse(JTable TABLEcourse , JTextField NEWVALUETXT ) throws ClassNotFoundException {
        DefaultTableModel model = (DefaultTableModel) TABLEcourse.getModel();
        int CurrentRow = TABLEcourse.getSelectedRow();
        int CurrentColumn = TABLEcourse.getSelectedColumn();
        if(NEWVALUETXT.getText().compareTo("") == 0){
            JOptionPane.showMessageDialog(null,"The faild cant be Empty");
        }
        else{
            try {
                java.sql.Statement st = DB.CreateConnection("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306/courses", "root", "");
                int count = DB.Count("courses_information", st);
                if(CurrentColumn == 0){
                    JOptionPane.showMessageDialog(null, "you cant edit this faild");
                }
                else if(CurrentColumn == 1){
                    DB.UpdateWhere(st, "courses_information", "Branch" , NEWVALUETXT.getText() , "CourseName" , TABLEcourse.getValueAt(CurrentRow, 0)+"");
                }
                else if(CurrentColumn == 2){
                    DB.UpdateWhere(st, "courses_information", "Room" , NEWVALUETXT.getText() , "CourseName" , TABLEcourse.getValueAt(CurrentRow, 0)+"");
                }
                else if(CurrentColumn == 3){
                    DB.UpdateWhere(st, "courses_information", "AllowedStudent" , NEWVALUETXT.getText() , "CourseName" , TABLEcourse.getValueAt(CurrentRow, 0)+"");
                }
                else if(CurrentColumn == 4){
                    DB.UpdateWhere(st, "courses_information", "Price" , NEWVALUETXT.getText() , "CourseName" , TABLEcourse.getValueAt(CurrentRow, 0)+"");
                }
                else if(CurrentColumn == 5){
                    DB.UpdateWhere(st, "courses_information", "period" , NEWVALUETXT.getText() , "CourseName" , TABLEcourse.getValueAt(CurrentRow, 0)+"");
                }
                
                
                if(CurrentColumn != 0){
                    model.setValueAt(NEWVALUETXT.getText(), CurrentRow , CurrentColumn );
                    NEWVALUETXT.setText("");
                }
            } catch (SQLException ex) {
                Logger.getLogger(CourseController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void CreateCourse(JTable courseTable ,JTextField courseName,JTextField courseBranch,
            JTextField courseRoom, JTextField courseCountOfStudents ,
                JTextField coursePrice )
                    {
                    try {
                    String courseN = courseName.getText();
                    String courseB = courseBranch.getText();
                    String courseR = courseRoom.getText();
                    String courseCount = courseCountOfStudents.getText();
                    String pric = coursePrice.getText();

                     DefaultTableModel model = (DefaultTableModel) courseTable.getModel();
                    Object obj[] = {
                        courseN,courseB,courseR,
                        courseCount,pric
                       } ;
                    model.addRow(obj);
                    JTextField[] jt={courseName, courseBranch, courseRoom,
                        courseCountOfStudents, coursePrice, 
                         };
                    f.deleteTextField(jt);
                    
                    java.sql.Statement stat = DB.CreateConnection("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306/courses", "root", "");
                    
                    if(DB.InsertCourse(stat, courseN, courseB, courseR, courseCount, pric) == 1){
                        JOptionPane.showMessageDialog(null, "Course Information Is Inserted");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Course Information Isn't Inserted");
                    }
                    
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(CourseController.class.getName()).log(Level.SEVERE,null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(CourseController.class.getName()).log(Level.SEVERE, null, ex);
                }
                 
            
        }
    

}
