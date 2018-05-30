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

public class ServicioSencilloInterprete
{
    AdministradorInterprete administradorinterprete;
    AdministradorSencillo administradorSencillo;
      
    
    //idSencillo, nombreSencillo, List<Interprete> interpretes--> String nombreInterprete
    public void agregarInterpreteSencillo()
    {
        administradorSencillo.obtenerSencillos();
    }
}