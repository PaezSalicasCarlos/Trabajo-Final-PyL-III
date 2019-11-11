/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unlar.TrabajoFinal.objetos.controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Hugo Chanampe
 */
public class Conexion {
    
   static final String JDBC_DRIVER = "org.postgresql.Driver";  
   static final String DB_URL = "jdbc:postgresql://localhost:5432/Escuela?currentschema=public";
    //static final String DB_URL = "jdbc:mysql://localhost:3306/sales_system";
    // static final String JDBC_DRIVER ="com.mysql.jdbc.Driver";
    //  Database credentials
   static final String USER = "postgres";
   static final String PASS = "19735024";
   
   private static Connection conn = null;
   
     
   public static Connection obtenerConexion() throws SQLException, ClassNotFoundException {
      if (conn == null) {
         try {
            Class.forName(JDBC_DRIVER);
             //STEP 3: Open a connection
      
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
         } catch (SQLException ex) {
            throw new SQLException(ex);
         } catch (ClassNotFoundException ex) {
            throw new ClassCastException(ex.getMessage());
         }
      }
      return conn;
   }
   
   public static void cerrar() throws SQLException {
      if (conn != null) {
         conn.close();
      }
   }
   
 
   
   
     
      
       
}
