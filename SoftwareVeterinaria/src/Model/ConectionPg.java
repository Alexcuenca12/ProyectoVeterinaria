/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ConectionPg {

    Connection con;
    String url = "jdbc:postgresql://ec2-3-229-161-70.compute-1.amazonaws.com:5432/d6tokrmm9ujn1c";
    String user = "hhdlppcoboxzhp";
    String pass = "9d78e0749cb764207b9917c96c09f854d4cbdce79efb03c5840357ffe0819868";

    public ConectionPg() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConectionPg.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
            Logger.getLogger(ConectionPg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet consulta(String sql) {
        try {
            Statement st = con.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConectionPg.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean accion(String sql) {

        boolean resultado;
        try {
            Statement st = con.createStatement();
            st.execute(sql);
            st.close();
            resultado = true;

        } catch (SQLException ex) {
            Logger.getLogger(ConectionPg.class.getName()).log(Level.SEVERE, null, ex);
            resultado = false;
        }
        return resultado;
    }

    public Connection getCon() {
        return con;
    }

}
