/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import BasesDeDatos.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import vo.Interprete;
import vo.VentaSencillo;

/**
 *
 * @author cristian
 */
public class AdministradorVentaSencillo {
    
    
    private static AdministradorVentaSencillo administradorVentaSencillo;
    private Connection conn;
    private Conexion conexion;
    private List<VentaSencillo> ventaSencillos;

    public AdministradorVentaSencillo() {
        conexion = new Conexion();
    }

    public List<VentaSencillo> obtenerDatosVentaSencillo() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        ventaSencillos = new ArrayList<>();;
        try {
            conn = conexion.obtener();
            String sql = "SELECT idVentaSencillo, cantidad, fecha, idSencillo FROM ventaSencillo";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            VentaSencillo ventaSencillo;

            while (rs.next()) {
                ventaSencillo = new VentaSencillo(rs.getInt(1),rs.getInt(2), rs.getDate(3), rs.getInt(4));
                ventaSencillos.add(ventaSencillo);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AdministradorVentaSencillo.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(AdministradorVentaSencillo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return ventaSencillos;
    }
 
    /*
    public VentaSencillo obtenerInterpreteXnombre(String nombreInterprete) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        ventaSencillos = new ArrayList<>();
        VentaSencillo ventaSencillo = null;
        try {
            conn = conexion.obtener();
            String sql = "SELECT idInterprete FROM interprete where nombreInterprete = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, nombreInterprete);
            rs = ps.executeQuery();

            while (rs.next()) {
                ventaSencillo = new VentaSencillo(nombreInterprete, rs.getInt(1));
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
         List<Interprete> interpretes = ad.obtenerInterpretes();

     //   System.out.println(ad.ingresarInterprete("CARLOS1"));
        
        for (Interprete miInterprete : interpretes) {
            System.out.println(miInterprete.getNombreInterprete());
        }
    }

    public boolean realizarVentaSencillo(Date fecha, int cantidad, int idSencillo) {
        boolean isInserto = false;
        PreparedStatement ps = null;
        int rs = 0;
        try {
            conn = conexion.obtener();
            String sql = "insert into mundulery.ventasencillo (fecha, cantidad, idSencillo) values (?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setDate(1, fecha);
            ps.setInt(2, cantidad);
            ps.setInt(3, idSencillo);
            rs = ps.executeUpdate();

            if (rs > 0) {
                isInserto = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdministradorVentaSencillo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }

                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdministradorVentaSencillo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return isInserto;
    }

    public static AdministradorVentaSencillo getInstance() {
        if (administradorVentaSencillo == null) {
            return new AdministradorVentaSencillo();
        }
        return administradorVentaSencillo;
    }
    
}
