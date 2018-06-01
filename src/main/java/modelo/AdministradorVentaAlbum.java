package modelo;

import BasesDeDatos.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import vo.Interprete;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import vo.VentaAlbum;
/**
 *
 * @author cristian
 */
public class AdministradorVentaAlbum {
 
    private static AdministradorVentaAlbum administradorVentaAlbum;
    private Connection conn;
    private Conexion conexion;
    private List<VentaAlbum> ventaAlbumes;

    public AdministradorVentaAlbum() {
        conexion = new Conexion();
    }

    public List<VentaAlbum> obtenerDatosVentaAlbum() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        ventaAlbumes = new ArrayList<>();;
        try {
            conn = conexion.obtener();
            String sql = "SELECT idVentaAlbum, fecha, cantidad, idAlbum FROM ventaalbum";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            VentaAlbum ventaAlbum;

            while (rs.next()) {
                ventaAlbum = new VentaAlbum(rs.getInt(1), rs.getDate(2), rs.getInt(3), rs.getInt(4));
                ventaAlbumes.add(ventaAlbum);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AdministradorVentaAlbum.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(AdministradorVentaAlbum.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return ventaAlbumes;
    }
 
    /*
    public Interprete obtenerInterpreteXnombre(String nombreInterprete) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        ventaAlbumes = new ArrayList<>();
        VentaAlbum ventaAlbum = null;
        try {
            conn = conexion.obtener();
            String sql = "SELECT idVentaAlbum FROM ventaAlbum where nombreInterprete = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, nombreInterprete);
            rs = ps.executeQuery();

            while (rs.next()) {
                interprete = new Interprete(nombreInterprete, rs.getInt(1));
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

        return interprete;
    }
    */

    //Este main es para hacer pruebas, comentaree la línea del método si va a borrar algo del main. 
    public static void main(String... args) {
        AdministradorInterprete ad = new AdministradorInterprete();
         ad.eliminarInterprete("Pedro");

     //   System.out.println(ad.ingresarInterprete("CARLOS1"));
        
      /*  for (Interprete miInterprete : interpretes) {
            System.out.println(miInterprete.getNombreInterprete());
        }*/
    }

    public boolean realizarVentaAlbum(Date fecha, int cantidad, int idAlbum) {
        boolean isInserto = false;
        PreparedStatement ps = null;
        int rs = 0;
        try {
            conn = conexion.obtener();
            String sql = "insert into mundulery.ventaAlbum (fecha, cantidad, idAlbum) values (?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setDate(1, fecha);
            ps.setInt(2, cantidad);
            ps.setInt(3, idAlbum);
            rs = ps.executeUpdate();

            if (rs > 0) {
                isInserto = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdministradorVentaAlbum.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }

                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdministradorVentaAlbum.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return isInserto;
    }

    public static AdministradorVentaAlbum getInstance() {
        if (administradorVentaAlbum == null) {
            return new AdministradorVentaAlbum();
        }
        return administradorVentaAlbum;
    }
    
}
