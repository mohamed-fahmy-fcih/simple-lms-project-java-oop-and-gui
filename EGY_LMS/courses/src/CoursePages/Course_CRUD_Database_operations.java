/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoursePages;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author HassanGomaa_personal
 */
public interface Course_CRUD_Database_operations {
    
    public static void RetriveCourse(JTable TABLEcourse  ){};

    public static void RetriveAllCourses
       (JTable allCoursesDefaultView ,JLabel courseCountOfStudents ,JLabel CountOfStudents ){};
   
       
       public static void DeleteCourse(JTable TABLEcourse){}; 
   
    
    
    public static void UpdateCourse(JTable TABLEcourse , JTextField NEWVALUETXT ){}; 
  
    
    
    public static void CreateCourse(JTable courseTable ,JTextField courseName,JTextField courseBranch,
            JTextField courseRoom, JTextField courseCountOfStudents ,
                JTextField coursePrice ){}
    
                    
    
}
