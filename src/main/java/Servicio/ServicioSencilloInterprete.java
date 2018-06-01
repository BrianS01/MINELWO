/*
 *  PROYECTO TERCER CORTE
 *   co-Author ::: Cristian Espinosa
 *   co-Author ::: Brian Sterling
 *     Program ::: Ingenieria de Software II
 *  Credential ::: SIST0076-G01:SIVII
 */

package Servicio;

import modelo.AdministradorInterprete;
import modelo.AdministradorSencillo;

<<<<<<< HEAD
/**
 *
 * @author cristian
 */
public class ServicioSencilloInterprete {
    AdministradorSencillo administradorSencillo;
    
    public boolean ingresarSencillo(String nombreSencillo, int idInterprete){
        return administradorSencillo.ingresarSencillo(nombreSencillo, idInterprete);    
=======
public class ServicioSencilloInterprete
{
    AdministradorInterprete administradorinterprete;
    AdministradorSencillo administradorSencillo;
      
    
    //idSencillo, nombreSencillo, List<Interprete> interpretes--> String nombreInterprete
    public void agregarInterpreteSencillo()
    {
        administradorSencillo.obtenerSencillos();
>>>>>>> 8bcb80fa1ff5b4c302e1a9c048ba3beb77356f02
    }
}