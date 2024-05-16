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

    private static String user = "root";
    private static String pass = "";
    private static String url = "jdbc:mariadb://localhost/ejemplo";
    private static String db = "universidadULP_grupo4";
    private static Connection conexion = null;

    
 //Constructor
    private Conexion() {
    }

    public static Connection getConexion(){
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
