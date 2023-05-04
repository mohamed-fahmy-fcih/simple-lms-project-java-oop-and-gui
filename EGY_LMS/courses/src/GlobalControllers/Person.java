
package GlobalControllers;

import javax.swing.JTextField;


public   class Person 
        implements Person_Details{
    private    String UserName ;
    private    String Password ;
    private    String Phone ;
    private    String HomePhone ;
    private    String Address ;
    private    String CourseName ;
    private    String Age ;
    private    String Type ;
    private    String Path ;
    public Person()
    {

    };

    
    @Override
    public  String getUserName() {
        return UserName;
    }

    @Override
    public   String getPassword() {
        return Password;
    }

    @Override
    public   String getAddress() {
        return Address;
    }

    @Override
    public  String getAge() {
        return Age;
    }

    @Override
    public  String getCourseName() {
        return CourseName;
    }



    @Override
    public  String getPhone(){
        return Phone;
    }



    public String getHomePhone(){
        return HomePhone;
    }

    public   String getPath() {
        return Path;
    }

    public   String getType() {
        return Type;
    }





    /*============================set================================*/

    @Override
    public   void setAddress(String address) {
         Address = address;
    }

    @Override
    public void setAge(String age) {
         Age = age;
    }

    @Override
    public  void setCourseName(String courseName) {
         CourseName = courseName;
    }

    @Override
    public  void setHomePhone(String homePhone) {
         HomePhone = homePhone;
    }

    @Override
    public  void setPhone(String phone) {
        Phone = phone;
    }

    @Override
    public  void setPassword(String password) {
        Password = password;
    }

    @Override
    public void setPath(String path) {
        Path = path;
    }

    @Override
    public  void setType(String type) {
        Type = type;
    }

    @Override
    public  void setUserName(String userName) {
        UserName = userName;
    }
    
    
     


}
