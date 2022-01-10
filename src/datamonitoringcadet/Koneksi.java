/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamonitoringcadet;
import java.sql.*;
/**
 *
 * @author Administrator
 */
public class Koneksi {
    private final String url = "jdbc:mysql://localhost/db_datamonitoringpraktek";
    
    public Connection getKoneksi(){
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, "root","");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
}
