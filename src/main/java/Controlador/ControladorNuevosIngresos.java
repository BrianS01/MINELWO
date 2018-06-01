/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Servicio.ServicioNuevosIngresos;
import java.util.List;
import vo.Album;
import vo.Cancion;
import vo.Interprete;
import vo.Sencillo;

/**
 *
 * @author cristian
 */
public class ControladorNuevosIngresos {
    
    ServicioNuevosIngresos servicioNuevosIngresos;
    
    
    public ControladorNuevosIngresos(){
        servicioNuevosIngresos =new ServicioNuevosIngresos();
    }
    
    public void ingresarInterprete(String nombreInterprete){
        servicioNuevosIngresos.ingresarInterprete(nombreInterprete);
    }
    
    public void ingresarAlbum(String nombreAlbum, String nombreInterprete){
        servicioNuevosIngresos.ingresarAlbum(nombreAlbum, nombreInterprete);
    }
    
    public List<Interprete> obtenerInterpretes(){
        return servicioNuevosIngresos.obtenerInterpretes();
    }
      public List<Cancion> obtenerCanciones(){
        return servicioNuevosIngresos.obtenerCanciones();
    }
      public List<Album> obtenerAlbumes(){
        return servicioNuevosIngresos.obtenerAlbum();
    }

    public void ingresarCancion(String nombreCancion, String nombreAlbum) {
        servicioNuevosIngresos.ingresarCancion(nombreCancion, nombreAlbum);
    }
    public List<Sencillo> obtenerSencillos(){
        return servicioNuevosIngresos.obtenerSencillo();
    }
    public void ingresarSencillos(String nombreSencillo, String nombreInterprete){
        servicioNuevosIngresos.ingresarSencillo(nombreSencillo, nombreInterprete);
    }
}
