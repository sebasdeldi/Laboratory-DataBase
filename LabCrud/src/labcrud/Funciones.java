/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;




/**
 *
 * @author CARITO
 */
public class Funciones {
    
    public static Connection conectarse() throws Exception {
        
        try{
            String driver = "com.mysql.jdbc.Driver";
            String urlDB = "jdbc:mysql://localhost/mydb"; 
            String username = "root";
            String password = "";
            Class.forName(driver);
            Connection coneccion = DriverManager.getConnection(urlDB,username,password);
            System.out.println("Conectado a la base de datos");
            return coneccion;
        }
        
        catch(Exception e){
            
            System.out.println("Error" + e);
        }
        
        
        return null;
    }
    
    public static String agregarComillas (String a){
        
        String aux = "'"+a+"'";
        return aux;
    }
    
    
    public void eliminar(int id, String tabla, String nombreIdEnLaTabla){
        
        try{
            Connection coneccion = conectarse();
            PreparedStatement agregacion = coneccion.prepareStatement("delete from "+ tabla +" \n" +
            "where "+ nombreIdEnLaTabla +" = " +id+"\n" +
            "limit 1;");
            agregacion.executeUpdate();
            System.out.println("eliminado satisfactoriamente");
            
            
        }

        catch(Exception e){
            System.out.println ("Error :"+ e);
        }
        
    }
    
    //este funciona para el inventario, sobrecarcar metodo para otros casos
    public void agregar(int id, int cantidad, String nombre, String tabla  ){
        
        try{
         Connection coneccion = conectarse();
         PreparedStatement agregacion = coneccion.prepareStatement("INSERT INTO "+ tabla+ " \n" +
         "VALUES ("+id+","+cantidad+","+ agregarComillas(nombre)+")");

         agregacion.executeUpdate();
         System.out.println("agregado satisfactoriamente");


         String select = "SELECT * FROM "+ tabla +";";
         poblarTabla(select,Inventario.getTabla());
         System.out.println("actualizado satisfactoriamente");

        }

        catch(Exception e){
            System.out.println ("Error :"+ e);
        }
    }
  
     //sobrecargado para que funcione para agregar usuario   
    public void agregar(int id, String nombre, String apellido, int telefono, String direccion,String correo, String tabla){
        
        try{
         Connection coneccion = conectarse();
         PreparedStatement agregacion = coneccion.prepareStatement("INSERT INTO "+ tabla+ " \n" +
         "VALUES ("+id+","+agregarComillas(nombre)+","+ agregarComillas(apellido)+","+telefono+","+agregarComillas(direccion)+","+agregarComillas(direccion)+")");

         agregacion.executeUpdate();
         System.out.println("agregado satisfactoriamente");


         String select = "SELECT * FROM "+ tabla +";";
         poblarTabla(select,Inventario.getTabla());
         System.out.println("actualizado satisfactoriamente");

        }

        catch(Exception e){
            System.out.println ("Error :"+ e);
        }
    }
    
    
    //sobrecargado para que funcione para agregar solicitud
     public void agregar(String insertCode,String tabla){
        
        try{
         Connection coneccion = conectarse();
         PreparedStatement agregacion = coneccion.prepareStatement(insertCode);

         agregacion.executeUpdate();
         System.out.println("agregado satisfactoriamente");


         String select = "SELECT * FROM "+ tabla +";";
         poblarTabla(select,Solicitudes.getTabla());
         System.out.println("actualizado satisfactoriamente");

        }

        catch(Exception e){
            System.out.println ("Error :"+ e);
        }
    }
    
    
    public void editar(String update, String tabla){
        
          try{
            Connection coneccion = conectarse();
            PreparedStatement agregacion = coneccion.prepareStatement(update);

            agregacion.executeUpdate();
            System.out.println("actualizado satisfactoriamente");

        }

        catch(Exception e){
            System.out.println ("Error :"+ e);
        }
    }
    
    
  
    
    
    public void poblarTabla (String select, javax.swing.JTable tabla){
        
        
        try {
            // TODO add your handling code here:
            Connection coneccion = conectarse();
            Statement consulta = coneccion.createStatement();
            ResultSet result = consulta.executeQuery(select);
            ResultSetMetaData metaData = result.getMetaData();
            
            int numeroColumnas = metaData.getColumnCount();
            
            DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);
            
            //añade los titulos
            for (int i = 1; i <= numeroColumnas; i++){
                
                modelo.addColumn(metaData.getColumnLabel(i));
            }
            
            //añade los registros
            while (result.next()){
                
                Object[] fila = new Object[numeroColumnas];
                
                for (int j = 0; j < numeroColumnas; j++){
                    
                    fila[j] = result.getObject(j+1);
                }
                
                modelo.addRow(fila);
            }
        }
        
        catch(Exception e){
            
        }
    }
    
   
}
