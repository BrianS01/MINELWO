/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.List;
import modelo.AdministradorAlbum;
import modelo.AdministradorCancion;
import modelo.AdministradorInterprete;
import modelo.AdministradorSencillo;
import vo.Album;
import vo.Cancion;
import vo.Interprete;
import vo.Sencillo;

/**
 *
 * @author cristian
 */
public class ServicioNuevosIngresos {

    AdministradorInterprete administradorInterprete;
    AdministradorAlbum administradorAlbum;
    AdministradorCancion administradorCancion;
    AdministradorSencillo administradorSencillo; 

    public ServicioNuevosIngresos() {
        administradorInterprete = new AdministradorInterprete();
        administradorAlbum = new AdministradorAlbum();
        administradorCancion = new AdministradorCancion();
        administradorSencillo=new AdministradorSencillo();
    }

    public void ingresarInterprete(String nombreInterprete) {
        administradorInterprete.ingresarInterprete(nombreInterprete);
    }

    public List<Interprete> obtenerInterpretes() {
        return administradorInterprete.obtenerInterpretes();
    }

    public void ingresarAlbum(String nombreAlbum, String nombreInterprete) {
        Interprete idInterprete = administradorInterprete.obtenerInterpreteXnombre(nombreInterprete);
        administradorAlbum.ingresarAlbum(nombreAlbum, idInterprete.getId());
    }

    public List<Cancion> obtenerCanciones() {
        return administradorCancion.obtenerCanciones();
    }
    
      public List<Album> obtenerAlbum() {
        return administradorAlbum.obtenerAlbumes();
    }
     
    public void ingresarCancion(String nombreCancion, String nombreAlbum){
        int idAlbum = administradorAlbum.obtenerAlbumXnombre(nombreAlbum);
       administradorCancion.ingresarCancion(nombreCancion, idAlbum);
    }
    
    public List<Sencillo> obtenerSencillo(){
        return administradorSencillo.obtenerSencillos();
    }
    
    public void ingresarSencillo(String nombreSencillo, String nombreInterprete){
        Interprete idInterprete = administradorInterprete.obtenerInterpreteXnombre(nombreInterprete);
        administradorSencillo.ingresarSencillo(nombreSencillo, idInterprete.getId());
    } 
}
