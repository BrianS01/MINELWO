package Servicio;

import modelo.AdministradorInterprete;
import modelo.AdministradorSencillo;

/**
 *
 * @author cristian
 */
public class ServicioSencilloInterprete {
    AdministradorInterprete administradorinterprete;
    AdministradorSencillo administradorSencillo;
      
    //idSencillo, nombreSencillo, List<Interprete> interpretes--> String nombreInterprete
    public void agregarInterpreteSencillo(){
        administradorSencillo.obtenerSencillos();
    }
}
