package modelo;

import BasesDeDatos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import vo.Album;
import java.util.ArrayList;
import java.util.List;

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
            
        } catch (Exception e) {
        }
        
        
        return albumes;
    }
    /*
    public boolean ingresarAlbum(int idAlbum, String nombreAlbum, String nombreInterprete){
        for (int i = 0; i < 10; i++) {
//            mialbum=new Album(i, nombreAlbum, misInterpretes.getInterpretes().get(i).getNombreInterprete());
            //misInterpretes.getInterpretes().get(i+1).getNombreInterprete()   
        }
        return listadeAlbunes.add(mialbum);
    }
    
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