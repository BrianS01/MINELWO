package modelo;

import BasesDeDatos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import vo.Album;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class AdministradorAlbum
{
    private Album album; 
    private static AdministradorAlbum administradorAlbum; 
    private Connection conn;
    private Conexion conexion;
    private List<Album> albumes=new ArrayList<>();
    
    
    public AdministradorAlbum(){
        conexion = new Conexion();
    }
    
    public List<Album> obtenerAlbumes(){
        PreparedStatement ps=null; 
        ResultSet rs=null;
        try {
            conn= conexion.obtener();
            String sql="SELECT idAlbum, nombreAlbum FROM album";
            ps = conn.prepareStatement(sql);
            rs= ps.executeQuery();
            
            Album album;
            
            while(rs.next()){
                album=new Album(rs.getInt(1), rs.getString(2));
                albumes.add(album);
            }
        } catch (SQLException ex) {
            //Logger.getLogger(AdministradorInterprete.class.getName()).log(Level.SEVERE, null, ex);
            
          //  Logger.getLogger(AdministradorAlbum.class.getName().log(Level.SEVERE, null, ex));
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
       //         Logger.getLogger(AdministradorAlbum.class.getName()).log(Level.SEVERE, null, ex);
            }
    
        }
        
        return albumes;
    }
    
    public boolean ingresarAlbum(String nombreAlbum){
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            conn=conexion.obtener();
            String sql="INSERT INTO mundulery.album VALUES (nombreAlbum)";
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();
            
            //Preguntar Album album?
            while(rs.next()){
                album =new Album(nombreAlbum);
            }
        } catch (SQLException e) {
            //Falta arreglar
    //       Logger.getLogger(AdministradorAlbum.class.getName()).log(Level.SEVERE, null, ex);
     
        }finally{
            try{ 
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
            //    Logger.getLogger(AdministradorInterprete.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
     return albumes.add(album);
     
    }
    
    
    public static AdministradorAlbum getInstance(){
        if(administradorAlbum == null){
            return new AdministradorAlbum();
        }
        return administradorAlbum;
    }
    
    public boolean eliminarAlbum(String nombreAlbum){
        boolean eliminado=false;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            conn=conexion.obtener();
            //Falta revisar sql.
            String sql="DELETE FROM mundulery.album where nombreAlbum=(nombreAlbum)";
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();
            
            //Falta revisar este método
            while(rs.next()){
                for (int i = 0; i < albumes.size(); i++) {
                if(nombreAlbum.equals(albumes.get(i).getNombreAlbum())){
                albumes.remove(i).getNombreAlbum();
                eliminado=true;
            }
            else{
                eliminado=false; 
            }    
                }
    
            }
        } catch (SQLException e) {
            //Preguntar
        //    Logger.getLogger(AdministradorAlbum.class.getName()).log(Level.SEVERE, null, ex);
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
               //Falta revisar 
    //    Logger.getLogger(AdministradorAlbum.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        
        return eliminado;
    }
    
    public List<Album> getAlbunes(){
        return albumes;
    }
    
    public void setAlbunes(List<Album> albumes){
        this.albumes=albumes;
    }
    
}