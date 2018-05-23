
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