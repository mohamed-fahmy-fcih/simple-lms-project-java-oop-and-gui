
package CoursePages;


public class CourseDetails {
    private String courseName ;
    private String courseBranch ;
    private String courseRoom ;
    private String courseCountOfStudents ;
    private String coursePrice ;
    /*=====================set=====================*/
    void setCourseName(String Value){courseName = Value ;}
    
    void setBranch(String Value){courseBranch = Value ;}
    
    void setRoom(String Value){courseRoom = Value ;}
    
    void setNumberOfStudentAllowd(String Value){courseCountOfStudents = Value ;}
    
    void setprice(String Value){coursePrice = Value ;}
       
     /*=====================get=====================*/
    String getCourseName(){return courseName ;}
    
    String getBranch(){return courseBranch ;}
    
    String getRoom(){return courseRoom ;}
    
    String getnumberOfStudentAllowd(){return courseCountOfStudents ;}
    
    String getPrice(){return coursePrice ;}
    
     /*=================================================*/
}
