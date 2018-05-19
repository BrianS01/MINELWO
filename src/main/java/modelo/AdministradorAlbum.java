package modelo;

import BasesDeDatos.Conexion;
import com.sun.istack.internal.logging.Logger;
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
    private Album miAlbum; 
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
        
      //  for (int i = 0; i < 10; i++) {
//            mialbum=new Album(i, nombreAlbum, misInterpretes.getInterpretes().get(i).getNombreInterprete());
            //misInterpretes.getInterpretes().get(i+1).getNombreInterprete()   
       // }
       // return listadeAlbunes.add(mialbum);
       return true; 
    }
    
    /*
    public static AdministradorAlbum getInstance(){
        if(administradorAlbum == null){
            return new AdministradorAlbum();
        }
        return administradorAlbum;
    }
    
    public boolean eliminarAlbum(String nombreAlbum){
        boolean eliminado=false; 
        for (int i = 0; i < listadeAlbunes.size(); i++) {
            if(nombreAlbum.equals(listadeAlbunes.get(i).getNombreAlbum())){
                listadeAlbunes.remove(i).getNombreAlbum();
                eliminado=true;
            }
            else{
                eliminado=false; 
            }
        }
    return eliminado;
    }
    
    public List<Album> getAlbunes(){
        return listadeAlbunes;
    }
    
    public void setAlbunes(List<Album> listadeAlbunes){
        this.listadeAlbunes=listadeAlbunes;
    }
    */
}