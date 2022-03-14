/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema.empleadosDAL;


import java.SQLException;  

import java.sql.*;

import java.sql.PreparedStatement;

public class SQLiteJDBCDriverConnection {

public class conexion {
    String strConexionDB="Jdbc:sqlite:C:/Users/Bolivarense/Documents/DB/sistemaGEN.s3db";
    Connection conn=null;
    
    public conexion(){
        try{
            Class.forName("org.sqlite.JDBC");
            conn= DriverManager.getConnection(strConexionDB);
            
            System.out.println("Conexion establecida");
        } catch (Exception e) {
                    
                    System.out.println("Error de Conexion"+e);
                    
        }
    }

        public void ejecutarSentenciaSQL() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    public int ejecutarSentenciaSQL(String strSentenciaSQL) {
        try{
            PreparedStatement pstm conn.PreparedStatement(strSentenciaSQL);
            pstm.execute();
            return 1;
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }

}
