package Servicio;

import modelo.AdministradorInterprete;
import modelo.AdministradorSencillo;

/**
 *
 * @author cristian
 */
public class ServicioSencilloInterprete {
    AdministradorSencillo administradorSencillo;
    
    public boolean ingresarSencillo(String nombreSencillo, int idInterprete){
        return administradorSencillo.ingresarSencillo(nombreSencillo, idInterprete);    
    }
}