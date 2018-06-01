package modelo;

import BasesDeDatos.Conexion;
import Servicio.ServicioAlbumInterprete;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import vo.Album;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdministradorAlbum {

    private Album album;
    private static AdministradorAlbum administradorAlbum;
    private static ServicioAlbumInterprete servicioAlbumInterprete;
    private Connection conn;
    private Conexion conexion;
    private List<Album> albumes = new ArrayList<>();

    public AdministradorAlbum() {
        conexion = new Conexion();
    }

    public boolean eliminarAlbum(int idAlbum) {
        boolean isElimino = false;
        PreparedStatement ps = null;
        int rs = 0;
        
        try {
            conn = conexion.obtener();

            String sql = "DELETE FROM mundulery.cancion WHERE idAlbum = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idAlbum); // el primer valor se refiere al parámetro del interrogante. 
            ps.executeUpdate();
            //Falta revisar está línea del mysql.
            sql = "DELETE FROM mundulery.album WHERE idAlbum = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idAlbum); // el primer valor se refiere al parámetro del interrogante. 
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

    public int obtenerAlbumXnombre(String nombreAlbum) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        int idAlbum=0;
        try {
            conn = conexion.obtener();
            String sql = "SELECT idAlbum FROM album where nombreAlbum = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, nombreAlbum);
            rs = ps.executeQuery();

            while (rs.next()) {
                idAlbum =  rs.getInt(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AdministradorInterprete.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
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
                Logger.getLogger(AdministradorInterprete.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return idAlbum;
    }
    
    public List<Album> obtenerAlbumes() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = conexion.obtener();
            String sql = "SELECT idAlbum, nombreAlbum, idInterprete FROM album";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            Album album;

            while (rs.next()) {
                album = new Album(rs.getInt(1), rs.getString(2), rs.getInt(3));
                albumes.add(album);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdministradorAlbum.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
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
                Logger.getLogger(AdministradorAlbum.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return albumes;
    }

    public static void main(String... args) {
        AdministradorAlbum ad = new AdministradorAlbum();
        List<Album> albumes = ad.obtenerAlbumes();

        //System.out.println(ad.ingresarAlbum("Los villancicos"));
        for (Album miAlbum : albumes) {
            System.out.println(miAlbum.getNombreAlbum());
        }
    }

    public boolean ingresarAlbum(String nombreAlbum, int idInterprete) {
        //Un método que busque el idInterprete por el servicio. 

        boolean isInserto = false;
        PreparedStatement ps = null;
        int rs = 0;
        try {
            conn = conexion.obtener();

            String sql = "insert into mundulery.album (nombreAlbum, idInterprete) values (?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, nombreAlbum);
            ps.setInt(2, idInterprete);
            rs = ps.executeUpdate();

            if (rs > 0) {
                isInserto = true;
            }
            //Líneas de Prueba
            if(nombreAlbum.equals("") && idInterprete>0){
                isInserto = false;
            }
            //
        } catch (SQLException ex) {

            Logger.getLogger(AdministradorAlbum.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdministradorAlbum.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return isInserto;

    }

    public static AdministradorAlbum getInstance() {
        if (administradorAlbum == null) {
            return new AdministradorAlbum();
        }
        return administradorAlbum;
    }

    public List<Album> getAlbunes() {
        return albumes;
    }

    public void setAlbunes(List<Album> albumes) {
        this.albumes = albumes;
    }

}
