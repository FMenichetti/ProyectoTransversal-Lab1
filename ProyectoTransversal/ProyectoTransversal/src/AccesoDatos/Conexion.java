/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DELL
 */
public class Conexion {

    private String user;
    private String pass;
    private String url;
    Connection conexion = null;

    public Conexion(String user, String pass, String url) {
        this.user = user;
        this.pass = pass;
        this.url = url;
    }

    public Conexion() {
    }

    public Connection buscarConexion(){
        if ( conexion == null ) {
            try {
                //Cargamos clases de maria db que implementan JDBC
                Class.forName("org.mariadb.jdbc.Driver");
                conexion = DriverManager.getConnection(url, user, pass);
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println("No se puede conectar o no se puede cargar el driver");
            }
        } 
        return conexion;
    }
}
