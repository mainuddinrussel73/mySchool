/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package something;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Main
 */
class SqliteConnection {
    public static Connection Connector(){
        try{
            Connection conn = null;
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:StudentInfo.sqlite");
            return conn;
        }catch(ClassNotFoundException | SQLException e){
            return null;
        }
    }
}
