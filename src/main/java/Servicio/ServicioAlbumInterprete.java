/*
 *  PROYECTO TERCER CORTE
 *   co-Author ::: Cristian Espinosa
 *   co-Author ::: Brian Sterling
 *     Program ::: Ingenieria de Software II
 *  Credential ::: SIST0076-G01:SIVII
 */

package Servicio;

import java.util.List;
import modelo.AdministradorInterprete;
import modelo.AdministradorSencillo;
import vo.Interprete;

public class ServicioAlbumInterprete
{
    public static AdministradorInterprete administradorInterprete;
    public static AdministradorSencillo administradorSencillo;
    
    
    public List<Interprete> obtenerInterprete()
    {
        //Traer la información de interprete.
        return administradorInterprete.obtenerInterpretes();//idInterprete, nombreInterprete
    }
    
    
    private List<Interprete> obtenerIdInterprete ()
    {
        return administradorInterprete.obtenerIdInterprete();
    } 
}