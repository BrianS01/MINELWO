/*
 *  PROYECTO TERCER CORTE
 *   co-Author ::: Cristian Espinosa
 *   co-Author ::: Brian Sterling
 *     Program ::: Ingenieria de Software II
 *  Credential ::: SIST0076-G01:SIVII
 */

package Servicio;

import java.util.List;
import modelo.AdministradorAlbum;
import modelo.AdministradorInterprete;
import modelo.AdministradorSencillo;
import vo.Interprete;

<<<<<<< HEAD
/**
 *
 * @author cristian
 */
public class ServicioAlbumInterprete {
    public static AdministradorAlbum administradorAlbum;
    
    public boolean ingresarAlbum(String nombreAlbum, int idInterprete){
        return administradorAlbum.ingresarAlbum(nombreAlbum, idInterprete);
    }
    
   
=======
public class ServicioAlbumInterprete
{
    public static AdministradorInterprete administradorInterprete;
    public static AdministradorSencillo administradorSencillo;
    
    
    public List<Interprete> obtenerInterprete()
    {
        //Traer la información de interprete.
        return administradorInterprete.obtenerInterpretes();//idInterprete, nombreInterprete
    }
>>>>>>> 8bcb80fa1ff5b4c302e1a9c048ba3beb77356f02
    
    
    private List<Interprete> obtenerIdInterprete ()
    {
        return administradorInterprete.obtenerIdInterprete();
    } 
}