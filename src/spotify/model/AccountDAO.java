/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spotify.model;

import com.sun.rowset.CachedRowSetImpl;
import java.sql.ResultSet;
import java.sql.SQLException;
import spotify.util.DBUtil;

/**
 *
 * @author Michal
 */
public class AccountDAO {
    
     public static void insertNewAccount(String LOGIN, String PASSWORD, String EMAIL) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO users VALUES(null, '" + LOGIN + "', '" + PASSWORD + "', '" + EMAIL + "' )";
        try {
            DBUtil.dbExecuteQuery(sql);
        }
        catch(SQLException e) {
            System.out.println("Exception occured while inserting the data " + e);
            e.printStackTrace();
            throw e;
        }
    }
     //dokonczyc sprawdzanie hashow
     public static boolean checkAccount(String LOGIN, String PASSWORD) throws SQLException, ClassNotFoundException {
         String sql = "SELECT * FROM users WHERE USE_Login = '" + LOGIN + "'";
         
         System.out.println(sql);
         try {
             ResultSet rs = DBUtil.dbExecute(sql);
             Account acc = new Account();
             if (rs.next()){
                 acc.setAccountLogin(rs.getString("USE_Login"));
                 acc.setAccountPassword(rs.getString("USE_Password"));
                 if (acc.getAccountPassword() == PASSWORD) {
                     System.out.println("Logging succesful!");
                     return true;
                 }
             } else {
                 System.out.println("There is no such user");
                 return false;
             }
             
         } catch (SQLException e) {
             System.out.println("Error occured while validating Logging data" + e);
             e.printStackTrace();
             throw e;
         }
         return true;
     }
    
}
