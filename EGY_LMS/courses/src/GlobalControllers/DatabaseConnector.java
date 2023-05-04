package GlobalControllers;

import java.sql.*;
import javax.swing.*;


public class DatabaseConnector {
    private Connection connectToDatabase;
    private Statement DatabaseQuery_1;
    private Statement DatabaseQuery_2;
    private String querySQL;
    private String querySQL2;
    private ResultSet queryExecute;
    private PreparedStatement readyQuery;
    private static DatabaseConnector connector_instance = null ; 
    
    //iniotialize Database
    
  
    
    
    private DatabaseConnector(String databaseUserName, String databasePassword)
    {
        startsDatabaseConnection (databaseUserName,databasePassword);
    }
    
    public static DatabaseConnector getInstance(String databaseUserName, String databasePassword){
    if( connector_instance == null)
        connector_instance =
                new DatabaseConnector(databaseUserName,databasePassword);
    
    return connector_instance;
    }
    
    
    public void startsDatabaseConnection(String databaseUserName,String databasePassword)
    {
        try{    
            String databaseURL = "jdbc:mysql://localhost:3306/courses?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String databaseDriver = "com.mysql.cj.jdbc.Driver";
            String databasePass = databasePassword;
            String databaseUser = databaseUserName;
            String Defaultpassword = "";
            Class.forName(databaseDriver);
            connectToDatabase = (Connection) DriverManager.getConnection
                                    (databaseURL+databasePass, databaseUser, Defaultpassword);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    
    
    public ResultSet studentTableQuery()
    {
        try {
            DatabaseQuery_1 = (Statement) connectToDatabase.createStatement();
            querySQL = "select * from students_information";
            queryExecute = DatabaseQuery_1.executeQuery(querySQL);
            }catch(SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        return queryExecute;
    }
    
 
    
    public String getStudentString(ResultSet rs, String ColName)
    {
        try {
            return rs.getString(ColName);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return null;
    }
    
    public int getStudentGrades(ResultSet rs, String ColName)
    {
        try {
            return rs.getInt(ColName);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return 0;
    }
    
    public int getStudentID(ResultSet rs)
    {
        try {
            return rs.getInt("PHONE");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return 0;
    }
    
    public String getSubject(int id)
    {
        try {
            DatabaseQuery_1 = (Statement) connectToDatabase.createStatement();
            String sql = "select * from posts where ID = '"+id+"'";
            queryExecute = DatabaseQuery_1.executeQuery(sql);
            while(queryExecute.next()){
                return queryExecute.getString("subject");
            }
            }catch(SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        return null;
    }
    
    public String getcontent(int id)
    {
        try {
            DatabaseQuery_1 = (Statement) connectToDatabase.createStatement();
            String sql = "select * from posts where ID = '"+id+"'";
            ResultSet rs = DatabaseQuery_1.executeQuery(sql);
            while(rs.next()){
                return rs.getString("contetnt");
            }
            }catch(SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        return null;
    }
    
     
     
     
    ///////////////////////////////////////////////////////////////////////////////////
    public java.sql.Statement CreateConnection(String dbClassName , String dbURL 
            , String dbUserName ,String dbPass) throws ClassNotFoundException, SQLException{
        java.sql.Connection c = null ;
        try {
            Class.forName(dbClassName);
            c = DriverManager.getConnection(dbURL, dbUserName, dbPass);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return c.createStatement();
    }
    
   //stat, CoNa, Bran, Room, nosa, pric, Mnth
            public int InsertCourse(java.sql.Statement stat , String courseName, String courseBranch 
                    ,String courseRoom,String courseStudentsCount ,String coursePrice  )
                    throws SQLException{ 
            return stat.executeUpdate
        (
                "insert into courses_information (CourseName,Branch,Room,AllowedStudent,Price)"
                + "values('"+  courseName +"',"
                        + "'"+ courseBranch +"',"
                        + "'"+ courseRoom +"',"
                        + "'"+ courseStudentsCount +"',"
                        + "'"+ coursePrice +"')"
        ) ;
    }
    
    public int InsertUser(java.sql.Statement stat ,String Username ,String password ,String Type,String Path)
            throws SQLException{
        return stat.executeUpdate("insert into register(UserName,Password,Type,Path)values"
                        + "('" +Username+ "','"+password+"','"+Type+"','"+Path+"')") ;
    }
    /*================================ForAll===========================================*/
    public int UpdateWhere(java.sql.Statement stat, String tableName , String Column ,
            String NewValue , String where , String value) throws SQLException{
        String sqQl = "update "+tableName+" set "+Column+" = "+NewValue+" where " + where + " = " + value ;
        return stat.executeUpdate(sqQl);
    }
    
    public ResultSet SelectAll(String TableName , java.sql.Statement stat) throws SQLException{
    //Select all rows and columns from table name
        return stat.executeQuery("select *  from " + TableName) ;
    }
    
    public int Count (String tableName , java.sql.Statement stat){
        int count = 0 ;
        try {
          
            ResultSet rs = stat.executeQuery("select count(*) from " + tableName );
            rs.next();//what for
            count = rs.getInt(1) ;//what for 
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return count ;
    }
    
    public int deleteWhere(java.sql.Statement stat , String tableName , String Where , String Value) 
            throws SQLException{
        return stat.executeUpdate("Delete from "+tableName+" where "+Where+" = '"+ Value +"'") ;
    }
    
    public int insertAll(java.sql.Statement st , String tableName , String[] dbColumnName , 
            String[] dbValue) throws SQLException{
        String SQL = "insert into " + tableName +"( ";
        for(int i = 0 ; i < dbColumnName.length ; i++){
            if(i != dbColumnName.length-1){
                SQL += dbColumnName[i] + " , " ;
            }
            else{
                SQL += dbColumnName[i] + " )values( " ;
            }
        }
        for(int i = 0 ; i < dbValue.length ; i++){
            if(i != dbValue.length-1){
                SQL += "'"+ dbValue[i] +"' ," ;
            }
            else{
                SQL += "'"  + dbValue[i] +"' )" ;
            }
        }
        return st.executeUpdate(SQL);
    }
//    public ResultSet SelectColumnWhere(Statement st , String TableName , String Column 
//            , String Where , String Value) throws SQLException{
//        return st.executeQuery("select "+Column+" from "+TableName+" where "+Where+" = '" + Value + "'" );
//    }
//    public int UpdateMoreThanColumn(Statement stat , JTextField []jt) throws SQLException{
//        String sql = "Update students_information set (ADDRESS,PHONE,AGE,FULL_NAME) =( '"+jt[0].getText()+ "'" 
//                                                        + ",'" + jt[1].getText() + "'" 
//                                                        + ",'" + jt[2].getText() + "'" 
//                                                        + ",'" + jt[3].getText() + "')"
//                    + "where HOMEPHONE ='"+ jt[4].getText() +"'" ;
//            return stat.executeUpdate(sql);
//    }

     
}
