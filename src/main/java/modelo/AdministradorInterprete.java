package modelo;

import vo.Interprete;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cristian
 */
public class AdministradorInterprete {

    private Interprete interprete;
    private static AdministradorInterprete administradorInterprete;
    private List<Interprete> interpretes;
    private List<Integer> dia;
    private List<String> mes; 
    private List<Integer> year;  //El año ira desde 1979 hasta 2018.   
    private List<Interprete> fechas; 
    
    public AdministradorInterprete() {
        interpretes = new ArrayList<>();
        
        int year_temp=1979;
        //fechas.add(interprete.getDia(), interprete.getMes(), interprete.getYear());
        
        for (int i = 0; i < 30; i++) {
            dia.add(i+1);
        }
        mes.add("Enero");
        mes.add("Febrero");
        mes.add("Marzo");
        mes.add("Abril");
        mes.add("Mayo");
        mes.add("Junio");
        mes.add("Julio");
        mes.add("Agosto");
        mes.add("Septiembre");
        mes.add("Octubre");
        mes.add("Noviembre");
        mes.add("Diciembre");

        
        for (int i = 0; i < 38; i++) {
            year.add(year_temp+i);
            if(year_temp==2019){
                break;
            }
        }
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
