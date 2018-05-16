package modelo;

import vo.Interprete;
import java.util.ArrayList;
import java.util.List;

public class AdministradorInterprete {

    private Interprete interprete;
    private static AdministradorInterprete administradorInterprete;
    private List<Interprete> interpretes;   
    private List<Interprete> fechas; 
    
    public AdministradorInterprete() {
        interpretes = new ArrayList<>();      
    }

    public boolean ingresarInterprete(String nombreInterprete) {
        
        interprete = new Interprete(nombreInterprete);
        return interpretes.add(interprete);
    }
    
    public void seleccionarFecha(int dia, String mes, int year){
     //   interprete = new Interprete(dia, mes, year);
       
    }

    public static AdministradorInterprete getInstance() {
        if (administradorInterprete == null) {
            return new AdministradorInterprete();
        }
        return administradorInterprete;
    }

  //  private List<Interprete> eliminarInterprete(String nombreInterprete) {
    /*  for (Interprete interprete1 : interpretes) {
            if(nombreInterprete.equals(interprete1.getNombreInterprete())){
              
            }
        }*/
      public boolean eliminarInterprete(String nombreInterprete){    
        boolean eliminado=false;
          for (int i = 0; i < interpretes.size(); i++) {
            if(nombreInterprete.equals(interpretes.get(i).getNombreInterprete())){
                interpretes.remove(i).getNombreInterprete();
                eliminado=true;
            }
            else{
                eliminado=false;
            }
        }
        return eliminado;
    }

    public List<Interprete> getInterpretes() {
        return interpretes;
    }

    public void setInterpretes(List<Interprete> interpretes) {
        this.interpretes = interpretes;
    }
   
}