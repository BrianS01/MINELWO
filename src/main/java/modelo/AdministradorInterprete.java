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

public class AdministradorInterprete {

    private Interprete interprete;
    private static AdministradorInterprete administradorInterprete;
    private Connection conn;
    private Conexion conexion;
    private List<Interprete> interpretes =new ArrayList<>();
    public AdministradorInterprete() {
        conexion = new Conexion();
    }

    public List<Interprete> obtenerInterpretes() {
        PreparedStatement ps = null;
        ResultSet rs = null;
       // List<Interprete> interpretes = new ArrayList<>();;
        try {
            conn = conexion.obtener();
            String sql = "SELECT nombreInterprete, idInterprete FROM interprete";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            Interprete interprete;

            while (rs.next()) {
                interprete = new Interprete(rs.getString(1), rs.getInt(2));
                interpretes.add(interprete);
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

        return interpretes;
    }
    
    //Este main es para hacer pruebas, comentaree la línea del método si va a borrar algo del main. 
    public static void main(String...args){
        AdministradorInterprete ad = new AdministradorInterprete();
        List<Interprete> interpretes = ad.obtenerInterpretes();
        for(Interprete miInterprete: interpretes){
            System.out.println(miInterprete.getNombreInterprete());
        }
        
    }

    public boolean ingresarInterprete(String nombreInterprete) {
        PreparedStatement ps =null;
        ResultSet rs = null;
        try {
            conn= conexion.obtener();
            String sql="insert into mundulery.interprete values(nombreInterprete)";
            ps =conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            Interprete interprete;
            
            while(rs.next()){
                interprete=new Interprete(nombreInterprete);
                  
             //   interpretes.add(interprete);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdministradorInterprete.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(AdministradorInterprete.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        /*  interprete = new Interprete(nombreInterprete);
        interpretes.add(interprete);*/
        
        return interpretes.add(interprete);
    }
    
    public static AdministradorInterprete getInstance() {
        if (administradorInterprete == null) {
            return new AdministradorInterprete();
        }
        return administradorInterprete;
    }

    //  private List<Interprete> eliminarInterprete(String nombreInterprete) {
    /*  for (Interprete interprete1 : interpretes) {
            if(nombreInterprete.equals(interprete1.getNombreInterprete())){
              
            }
        }*/
    
    //Falta revisar este método
    public boolean eliminarInterprete(String nombreInterprete) {
        boolean eliminado = false;
        PreparedStatement ps =null;
        ResultSet rs = null;
        try {
            conn=conexion.obtener();
            //Falta revisar está línea del mysql.
            String sql="DELETE FROM mundulery.interprete where nombreInterprete=(nombreInterprete)";
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next()){
          for (int i = 0; i < interpretes.size(); i++) {
            if(nombreInterprete.equals(interpretes.get(i).getNombreInterprete())){
                interpretes.remove(i).getNombreInterprete();
                eliminado=true;
            }
          }
         }
            
        } catch (SQLException ex) {
            Logger.getLogger(AdministradorInterprete.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(AdministradorInterprete.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return eliminado;
    }

}
