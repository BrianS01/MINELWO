
package modelo;

import BasesDeDatos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import vo.Cancion;
import vo.Interprete;

/**
 *
 * @author cristian
 */
public class AdministradorCancion {
    
    private static AdministradorCancion administradorCancion;
    private Connection conn;
    private Conexion conexion;
    private List<Cancion> canciones;

    public AdministradorCancion() {
        conexion = new Conexion();
    }

    public boolean eliminarInterprete(int idCancion) {
        boolean isElimino = false;
        PreparedStatement ps = null;
        int rs = 0;

        try{
            conn = conexion.obtener();


            String sql = "DELETE FROM mundulery.cancion WHERE idCancion = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idCancion); // el primer valor se refiere al parámetro del interrogante. 
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
    
    public List<Cancion> obtenerCanciones() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        canciones = new ArrayList<>();;
        try {
            conn = conexion.obtener();
            String sql = "SELECT idCancion, nombreCancion, idAlbum FROM cancion";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            Cancion cancion;

            while (rs.next()) {
                cancion = new Cancion(rs.getInt(1), rs.getString(2), rs.getInt(3));
                canciones.add(cancion);
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

        return canciones;
    }
 
    
    public Interprete obtenerInterpreteXnombre(String nombreInterprete) {
        PreparedStatement ps = null;
        ResultSet rs = null;
    //    interpretes = new ArrayList<>();
        Interprete interprete = null;
        try {
            conn = conexion.obtener();
            String sql = "SELECT idInterprete FROM interprete where nombreInterprete = ?";
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

    //Este main es para hacer pruebas, comentaree la línea del método si va a borrar algo del main. 
    public static void main(String... args) {
        AdministradorInterprete ad = new AdministradorInterprete();
         List<Interprete> interpretes = ad.obtenerInterpretes();

     //   System.out.println(ad.ingresarInterprete("CARLOS1"));
        
        for (Interprete miInterprete : interpretes) {
            System.out.println(miInterprete.getNombreInterprete());
        }
    }

    public boolean ingresarCancion(String nombreCancion, int idAlbum) {
        boolean isInserto = false;
        PreparedStatement ps = null;
        int rs = 0;
        try {
            conn = conexion.obtener();
            String sql = "insert into mundulery.cancion (nombreCancion, idAlbum) values (?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, nombreCancion);
            ps.setInt(2, idAlbum);
            rs = ps.executeUpdate();

            if (rs > 0) {
                isInserto = true;
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
        return isInserto;
    }

    public static AdministradorCancion getInstance() {
        if (administradorCancion == null) {
            return new AdministradorCancion();
        }
        return administradorCancion;
    }
}
