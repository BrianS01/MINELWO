/*
 *  PROYECTO TERCER CORTE
 *   co-Author ::: Cristian Espinosa
 *   co-Author ::: Brian Sterling
 *     Program ::: Ingenieria de Software II
 *  Credential ::: SIST0076-G01:SIVII
 */

package modelo;

import BasesDeDatos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import vo.Interprete;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

<<<<<<< HEAD
public class AdministradorInterprete {
    
=======
public class AdministradorInterprete
{
>>>>>>> 8bcb80fa1ff5b4c302e1a9c048ba3beb77356f02
    private static AdministradorInterprete administradorInterprete;
    private Connection conn;
    private Conexion conexion;
    private List<Interprete> interpretes;

    
    public AdministradorInterprete()
    {
        conexion = new Conexion();
    }

    public List<Interprete> obtenerInterpretes()
    {
        PreparedStatement ps = null;
        ResultSet rs = null;
        interpretes = new ArrayList<>();
<<<<<<< HEAD
        try {
=======
        
        try
        {
>>>>>>> 8bcb80fa1ff5b4c302e1a9c048ba3beb77356f02
            conn = conexion.obtener();
            String sql = "SELECT nombreInterprete, idInterprete FROM interprete";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            Interprete interprete;

            while (rs.next())
            {
                interprete = new Interprete(rs.getString(1), rs.getInt(2));
                interpretes.add(interprete);
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(AdministradorInterprete.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(AdministradorInterprete.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return interpretes;
    }
<<<<<<< HEAD
 
=======

    
    public List<Interprete> obtenerIdInterprete()
    {
        PreparedStatement ps = null;
        ResultSet rs = null;
        interpretes = new ArrayList<>();
        
        try
        {
            conn = conexion.obtener();
            String sql = "SELECT idInterprete FROM interprete";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            Interprete interprete;

            while (rs.next())
            {
                interprete = new Interprete(rs.getInt(2));
                interpretes.add(interprete);
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(AdministradorInterprete.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(AdministradorInterprete.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return interpretes;
    }
>>>>>>> 8bcb80fa1ff5b4c302e1a9c048ba3beb77356f02
    
    
    public Interprete obtenerInterpreteXnombre(String nombreInterprete)
    {
        PreparedStatement ps = null;
        ResultSet rs = null;
        interpretes = new ArrayList<>();
        Interprete interprete = null;
        
        try
        {
            conn = conexion.obtener();
            String sql = "SELECT idInterprete FROM interprete where nombreInterprete = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, nombreInterprete);
            rs = ps.executeQuery();

            while (rs.next())
            {
                interprete = new Interprete(nombreInterprete, rs.getInt(1));
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(AdministradorInterprete.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(AdministradorInterprete.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return interprete;
    }

    
    //Este main es para hacer pruebas, comentaree la línea del método si va a borrar algo del main. 
    public static void main(String... args)
    {
        AdministradorInterprete ad = new AdministradorInterprete();
<<<<<<< HEAD
         ad.eliminarInterprete("Pedro");

     //   System.out.println(ad.ingresarInterprete("CARLOS1"));
        
      /*  for (Interprete miInterprete : interpretes) {
=======
        List<Interprete> interpretes = ad.obtenerInterpretes();
        //System.out.println(ad.ingresarInterprete("CARLOS1"));
        
        for (Interprete miInterprete : interpretes)
        {
>>>>>>> 8bcb80fa1ff5b4c302e1a9c048ba3beb77356f02
            System.out.println(miInterprete.getNombreInterprete());
        }*/
    }

    public boolean ingresarInterprete(String nombreInterprete)
    {
        boolean isInserto = false;
        PreparedStatement ps = null;
        int rs = 0;
        
        try
        {
            conn = conexion.obtener();
            String sql = "insert into mundulery.interprete (nombreInterprete) values (?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, nombreInterprete);
            rs = ps.executeUpdate();

            if (rs > 0)
            {
                isInserto = true;
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(AdministradorInterprete.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try
            {
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
                Logger.getLogger(AdministradorInterprete.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return isInserto;
    }

    
    public static AdministradorInterprete getInstance()
    {
        if (administradorInterprete == null)
        {
            return new AdministradorInterprete();
        }
        
        return administradorInterprete;
    }

    //  private List<Interprete> eliminarInterprete(String nombreInterprete) {
    /*  for (Interprete interprete1 : interpretes) {
            if(nombreInterprete.equals(interprete1.getNombreInterprete())){
              
            }
        }*/
<<<<<<< HEAD
     
    public boolean eliminarInterprete(String nombreInterprete) {
=======
    //Este método no lo vamos a utilizar. 
    public boolean eliminarInterprete(String nombreInterprete)
    {
>>>>>>> 8bcb80fa1ff5b4c302e1a9c048ba3beb77356f02
        boolean isElimino = false;
        PreparedStatement ps = null;
        int rs = 0;

        try
        {
            Interprete interprete = obtenerInterpreteXnombre(nombreInterprete);//con este método llama al idInterprete.

            conn = conexion.obtener();
            //Falta revisar está línea del mysql.
            String sql = "DELETE FROM mundulery.album WHERE idInterprete = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, interprete.getId()); // el primer valor se refiere al parámetro del interrogante. 
            ps.executeUpdate();

            sql = "DELETE FROM mundulery.sencillo WHERE idInterprete = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, interprete.getId()); // el primer valor se refiere al parámetro del interrogante. 
            ps.executeUpdate();

            sql = "DELETE FROM mundulery.interprete  WHERE idInterprete = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, interprete.getId()); // el primer valor se refiere al parámetro del interrogante. 
            rs = ps.executeUpdate();

            if (rs > 0)
            {
                isElimino = true;
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(AdministradorInterprete.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try
            {
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
                Logger.getLogger(AdministradorInterprete.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return isElimino;
    }
}