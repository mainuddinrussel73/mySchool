/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package something;
import java.sql.*;
/**
 *
 * @author Main
 */
public class LoginModel {
  
    
    Connection connection;
    public LoginModel(){
        connection = SqliteConnection.Connector();
        System.out.println("connection successful");
        if(connection == null){
            System.out.println("connection error!");
            System.exit(1);
        }
    }
    
    public boolean isDbConnected(){
        try {
            return !connection.isClosed();
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public boolean isLogin(String user,String pass) throws SQLException{
        PreparedStatement pst = null;
        ResultSet rs = null;
        String query = "select * from StudentInfoDb where Name = ? and password = ?";
        try{
            pst = connection.prepareCall(query);
            pst.setString(1,user);
            pst.setString(2,pass);
            rs = pst.executeQuery();
            if(rs.next())return true;
            else return false;
        }catch(Exception e){
            return false;
        }finally{
            pst.close();
            rs.close();
        }
    }
}