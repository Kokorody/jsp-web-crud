/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.sql.*;

/**
 *
 * @author kiddy
 */
public class DBConnection {
    public Connection open(){
        Connection con;
    
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/latihanjava";
            con = DriverManager.getConnection(url, "homestead", "secret");
            return con;
        }catch(Exception e){
           System.out.println(e);
           return null;
        }
    }
}
