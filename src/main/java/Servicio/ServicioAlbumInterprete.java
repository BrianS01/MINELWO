
package Servicio;

import java.util.List;
import modelo.AdministradorAlbum;
import modelo.AdministradorInterprete;
import modelo.AdministradorSencillo;
import vo.Interprete;

/**
 *
 * @author cristian
 */
public class ServicioAlbumInterprete {
    public static AdministradorAlbum administradorAlbum;
    
    public boolean ingresarAlbum(String nombreAlbum, int idInterprete){
        return administradorAlbum.ingresarAlbum(nombreAlbum, idInterprete);
    }
    
   
    
}
