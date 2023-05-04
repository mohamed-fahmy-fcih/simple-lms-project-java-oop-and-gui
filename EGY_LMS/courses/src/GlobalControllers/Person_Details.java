/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalControllers;

import javax.swing.JTextField;

 
public interface Person_Details {
    
        public  String getUserName()  ;

        public   String getPassword()  ;

        public   String getAddress() ;

        public  String getAge() ;

        public  String getCourseName();
        public  String getPhone();
        public String getHomePhone();

        public   String getPath() ;

        public   String getType() ;





    /*============================set================================*/

        public   void setAddress(String Address) ;


        public   void setAge(String Age);


        public  void setCourseName(String CourseName) ;

        public  void setHomePhone(String HomePhone) ;

        public  void setPhone(String Phone1);

        public  void setPassword(String password1) ;
        public void setPath(String path1);

        public  void setType(String Type1);

        public  void setUserName(String userName1);


        
}
