package modelo;

import vo.Interprete;
import vo.Sencillo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cristian
 */
public class AdministradorSencillo
{
    private AdministradorInterprete misInterpretes;
    private Sencillo miSencillo;
    private List<Sencillo> listaDeSencillos;
    private static AdministradorSencillo administradorSencillo;
    
    public AdministradorSencillo(){
        listaDeSencillos=new ArrayList<>();
        
    }
    
    public boolean ingresarSencillo(int idCancion, String nombreCancion, String nombreInterprete){
        for (int i = -1; i < 10; i++) {
            miSencillo=new Sencillo(i, nombreCancion, misInterpretes.getInterpretes().get(i).getNombreInterprete());//Hay que arreglar este pedazo
        }
       return listaDeSencillos.add(miSencillo);
    }
  
    public static AdministradorSencillo getInstance() {
        if (administradorSencillo == null) {
            return new AdministradorSencillo();
        }
        return administradorSencillo;
    }
    
    public boolean eliminarSencillo(String nombreCancion){
        boolean eliminado= false; 
        for (int i = 0; i < listaDeSencillos.size(); i++) {
            if(nombreCancion.equals(listaDeSencillos.get(i).getNombreCancion())){
                listaDeSencillos.remove(i).getNombreCancion();
                eliminado= true; 
            }
            else{
                eliminado=false; 
            }
        }
        return eliminado;
    }
    
    public List<Sencillo> getSencillos() {
        return listaDeSencillos;
    }
    
    public void setSencillos(List<Sencillo> listaDeSencillos){
       this.listaDeSencillos=listaDeSencillos;
    }
   // private String insertarSencillo()
    
}
