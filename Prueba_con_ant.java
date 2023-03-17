/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_con_ant;

//import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.*;



/**
 *
 * @author Equipo 3
 */
public class Prueba_con_ant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aplicacion pantallaprueba = new Aplicacion();
        pantallaprueba.setVisible(true);
        pantallaprueba.setExtendedState(Aplicacion.MAXIMIZED_BOTH);
        
        
        //----Probando JDBC-----//
        try {Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");     
        System.out.println("Driver OK"); 
        } catch (ClassNotFoundException e) {
            System.out.println(e); }
        //-----Coneccion a SQL SERVER-----///   
        String connectionString = "jdbc:sqlserver://localhost:1434;databaseName:Reciclaje" 
                + "databaseName=Reciclaje;";
        try{
           try (Connection connection = DriverManager.getConnection(connectionString)){
           System.out.println("Conection established.");
           }
        } catch(SQLException e){
            System.out.println("Error connection to the database");
            e.printStackTrace();    
        }
    }
    
    
}
