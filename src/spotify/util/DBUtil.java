/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spotify.util;

import com.sun.rowset.CachedRowSetImpl;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Michal
 */
public class DBUtil {
    
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    
    private static Connection connection = null;
    
    private static final String connStr = "jdbc:mysql://localhost/spotify";
    
    public static void dbConnect() throws SQLException, ClassNotFoundException {
        try {
            Class.forName(JDBC_DRIVER);
        }
        catch(ClassNotFoundException e) {
          System.out.println("Where is your MysSQL JDBC Driver"); 
          e.printStackTrace();
          throw e;
        }
        
        System.out.println("JDBC Driver has been registered");
        
        try {
            connection = DriverManager.getConnection(connStr, "root", "");
        }
        catch(SQLException e) {
            System.out.println("Connection Failed! Check output console " + e);
            throw e;
        }
    }
    
    public static void dbDisconnect() throws SQLException {
        try {
            if(connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        catch(Exception e) {
            throw e;
        }
    }
    
    public static void dbExecuteQuery(String sqlStmt) throws SQLException, ClassNotFoundException {
        Statement stmt = null;
        try {
            dbConnect();
            stmt = connection.createStatement();
            stmt.executeUpdate(sqlStmt);
        }
        catch(SQLException e) {
            System.out.println("Problem occured at dbExecuteQuery operation " + e);
            throw e;
        }
        finally {
            if(stmt != null) {
                stmt.close();
            }
            dbDisconnect();
        }
    }
    
    public static ResultSet dbExecute(String sqlQuery) throws ClassNotFoundException, SQLException {
        Statement stmt = null;
        ResultSet rs = null;
        CachedRowSetImpl crs = null;
        
        try {
            dbConnect();
            stmt = connection.createStatement();
            rs = stmt.executeQuery(sqlQuery);
            crs = new CachedRowSetImpl();
            crs.populate(rs);
        }
        catch(SQLException e) {
            System.out.println("Error occured in dbExecute operation " + e);
            throw e;
        }
        finally {
            if(rs != null) {
                rs.close();
            }
            if(stmt != null) {
                stmt.close();
            }
            dbDisconnect();
        }
        return crs;
    }
}
