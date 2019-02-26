/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrera.coordinador;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos Carrera
 */
public class Conexion {
    Connection connection;
    public Connection conex(){
        try {
           Class.forName("com.mysql.jdbc.Driver");
           String server = "jdbc:mysql://localhost:3306/sistema";
           String user = "root";
           String pass = "";
           connection = DriverManager.getConnection(server,user,pass);
           JOptionPane.showMessageDialog(null, "Conexion Exitosa");
           return connection;
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return connection;
    }
    
    Statement crateStatement(){
        throw new UnsupportedOperationException("No existe");
    }
    
}
