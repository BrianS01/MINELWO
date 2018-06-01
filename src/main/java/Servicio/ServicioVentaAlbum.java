/*
 *  PROYECTO TERCER CORTE
 *   co-Author ::: Cristian Espinosa
 *   co-Author ::: Brian Sterling
 *     Program ::: Ingenieria de Software II
 *  Credential ::: SIST0076-G01:SIVII
 */

package Servicio;

<<<<<<< HEAD
import java.sql.Date;
import java.util.List;
import modelo.AdministradorVentaAlbum;
import vo.VentaAlbum;

/**
 *
 * @author cristian
 */
public class ServicioVentaAlbum {
    AdministradorVentaAlbum administradorVentaAlbum;
   
    public List<VentaAlbum> obtenerDatosVentaAlbum(){
        return administradorVentaAlbum.obtenerDatosVentaAlbum();
    }
    
    public boolean realizarVentaAlbum(Date fecha, int cantidad, int idAlbum){
        return administradorVentaAlbum.realizarVentaAlbum(fecha, cantidad, idAlbum);
    }
   
}
=======
public class ServicioVentaAlbum
{
}
>>>>>>> 8bcb80fa1ff5b4c302e1a9c048ba3beb77356f02
