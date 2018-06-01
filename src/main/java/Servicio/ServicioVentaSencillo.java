package Servicio;

import java.sql.Date;
import java.util.List;
import modelo.AdministradorVentaSencillo;
import vo.VentaSencillo;

/**
 *
 * @author cristian
 */
public class ServicioVentaSencillo {

   AdministradorVentaSencillo administradorVentaSencillo; 
   
   public List<VentaSencillo> obtenerDatosVentaSencillo(){
       return administradorVentaSencillo.obtenerDatosVentaSencillo();
   }
   
   public boolean realizarVentaSencillo(Date fecha, int cantidad, int idSencillo){
       return administradorVentaSencillo.realizarVentaSencillo(fecha, cantidad, idSencillo);
   }
}
