package modelo;

import BasesDeDatos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import vo.Sencillo;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdministradorSencillo
{
    private Sencillo sencillo;
    private static AdministradorSencillo administradorSencillo;
    private Connection conn;
    private Conexion conexion;
    private List<Sencillo> sencillos=new ArrayList<>();
    
    public AdministradorSencillo(){
    conexion= new Conexion();
    }
    
    public List<Sencillo> obtenerSencillos()
    {
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        try
        {
            conn=conexion.obtener();
            String sql="SELECT idSencillo, nombreSencillo From sencillo";
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();
            Sencillo sencillo;
            
            while(rs.next())
            {
                sencillo=new Sencillo(rs.getInt(1), rs.getString(2));
                sencillos.add(sencillo);
            }           
        }
        catch (SQLException ex)
        {
            Logger.getLogger(AdministradorSencillo.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try
            {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
              Logger.getLogger(AdministradorSencillo.class.getName()).log(Level.SEVERE, null, ex);  
            }
        }
        
        return sencillos;
    }
    
    
    public boolean ingresarSencillo(String nombreSencillo)
    {
        PreparedStatement ps=null;
        ResultSet rs= null; 
        
        try
        {
            conn= conexion.obtener();
            String sql="INSERT INTO mundulery.sencillo VALUES(nombreSencillo)";
            ps= conn.prepareStatement(sql);
            Sencillo sencillo; 
            
            while(rs.next())
            {
                sencillo=new Sencillo(nombreSencillo);
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(AdministradorSencillo.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try
            {
               if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                } 
            } catch (SQLException ex) {
                Logger.getLogger(AdministradorSencillo.class.getName()).log(Level.SEVERE, null, ex);
            }
 
        }
   //         miSencillo=new Sencillo(nombreCancion);       
    //   return listaDeSencillos.add(miSencillo);
    return sencillos.add(sencillo); 
    }
    
  
    public static AdministradorSencillo getInstance() {
        if (administradorSencillo == null) {
            return new AdministradorSencillo();
        }
        return administradorSencillo;
    }
    
    public boolean eliminarSencillo(String nombreSencillo){
        boolean eliminado=false; 
        PreparedStatement ps= null; 
        ResultSet rs=null; 
        
        try {
            conn=conexion.obtener();
            String sql="DELETE FROM mundulery.sencillo where nombreSencillo=(nombreSencillo)";
            ps= conn.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next()){
              for (int i = 0; i < sencillos.size(); i++) {
            if(nombreSencillo.equals(sencillos.get(i).getNombreSencillo())){
                sencillos.remove(i).getNombreSencillo();
                eliminado= true; 
            }
            else{
                eliminado=false; 
            }
        }  
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(AdministradorSencillo.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try
            {
                if (rs != null)
                {
                    rs.close();
                }
                
                if (ps != null)
                {
                    ps.close();
                }
                
                if (conn != null)
                {
                    conn.close();
                }
            }
            catch (SQLException ex)
            {
                Logger.getLogger(AdministradorSencillo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return eliminado;
    }
    
    public List<Sencillo> getSencillos()
    {
        return sencillos;
    }
    
    
    public void setSencillos(List<Sencillo> sencillos)
    {
       this.sencillos=sencillos;
    }
}