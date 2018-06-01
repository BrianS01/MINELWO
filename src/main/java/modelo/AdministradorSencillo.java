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
    
    public static void main(String[] args) {
        AdministradorSencillo ad=new AdministradorSencillo();
        List<Sencillo> listaDeSencillos = ad.obtenerSencillos();
        /*
        for (Sencillo misencillo : listaDeSencillos) {
            System.out.println(misencillo.getNombreSencillo());
        }*/
        
//        System.out.println(ad.ingresarSencillo("yo daria1"));
    }
    
    public List<Sencillo> obtenerSencillos(){
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            conn=conexion.obtener();
            String sql="SELECT idSencillo, nombreSencillo, idInterprete From sencillo";
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();
            
            Sencillo sencillo;
            
            while(rs.next()){
                sencillo=new Sencillo(rs.getInt(1), rs.getString(2),rs.getInt(3));
                sencillos.add(sencillo);
            }           
        } catch (SQLException ex) {
            Logger.getLogger(AdministradorSencillo.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
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
    
    public boolean eliminarSencillo(int idSencillo) {
        boolean isElimino = false;
        PreparedStatement ps = null;
        int rs = 0;
        String sql="";
        try {
            sql = "DELETE FROM mundulery.sencillo WHERE idSencillo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idSencillo); // el primer valor se refiere al parámetro del interrogante. 
            ps.executeUpdate();
            
            if (rs > 0) {
                isElimino = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdministradorInterprete.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }

                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdministradorInterprete.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return isElimino;
    }
    
    public boolean ingresarSencillo(String nombreSencillo, int idInterprete){
        boolean isInserto = false; 
        PreparedStatement ps=null;
        int rs= 0; 
        try {
            conn= conexion.obtener();
            String sql="INSERT INTO mundulery.sencillo (nombreSencillo, idInterprete) values(?,?)";
            ps= conn.prepareStatement(sql);
            ps.setString(1, nombreSencillo);
            ps.setInt(2, idInterprete);
            rs= ps.executeUpdate();
            
            if(rs>0){
                isInserto=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdministradorSencillo.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
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

    return isInserto;
    }
    
  
    public static AdministradorSencillo getInstance() {
        if (administradorSencillo == null) {
            return new AdministradorSencillo();
        }
        return administradorSencillo;
    }
    
    public List<Sencillo> getSencillos() {
        return sencillos;
    }
    
    public void setSencillos(List<Sencillo> sencillos){
       this.sencillos=sencillos;
    }
    
    
    
}