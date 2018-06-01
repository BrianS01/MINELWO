
package Servicio;

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
