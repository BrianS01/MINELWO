package modelo;

import java.util.ArrayList;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;
import vo.Interprete;

public class AdministradorInterpreteTest
{

    private static List<Interprete> interpretes;
    private static AdministradorInterprete administradorInterprete;
    private static List<String> nombresDeInterpretes;
   
    @BeforeClass
    public static void inicializar()
    {
        interpretes=new ArrayList<>();
        administradorInterprete=new AdministradorInterprete();
        nombresDeInterpretes=new ArrayList<>();
        
        for (int i = 0; i < 10; i++)
        {
            nombresDeInterpretes.add("Henry falcon");
            nombresDeInterpretes.add("Henry Steven");
            nombresDeInterpretes.add("Marta Stuart");
            nombresDeInterpretes.add("Sterling");
            nombresDeInterpretes.add("g001");
            nombresDeInterpretes.add("wisin");
            nombresDeInterpretes.add("yandel");
            nombresDeInterpretes.add("aquiles brinco");
        }
    }
    
    
    @Test
    public void ingresarInterpreteCaso1()
    {
        String nombreInterprete="Cristian Espinosa";
        administradorInterprete.ingresarInterprete(nombreInterprete);
        //Assert.assertEquals("Cristian Espinosa", administradorInterprete.getInterpretes().get(0).getNombreInterprete());
    }
    /*
    @Test
    public void ingresarVariosInterpretesCaso2(){
        
        int cantidadEsperada=81;//corregir error
        
        for(String nombre: nombresDeInterpretes){
            administradorInterprete.ingresarInterprete(nombre);
        }
        int cantidadInterpretes= administradorInterprete.getInterpretes().size();
        
        Assert.assertEquals(cantidadEsperada, cantidadInterpretes);
    }
    
    @Test
    public void eliminarUnInterpreteCaso3(){
        String nombreInterprete="Henry falcon";
        boolean valorEsperado=true;
        
        
        for(String nombre: nombresDeInterpretes){
            administradorInterprete.ingresarInterprete(nombre);
        }
        
        boolean valorObtenido=administradorInterprete.eliminarInterprete(nombreInterprete);
        
       // Assert.assertEquals(cantidadEsperada, cantidadInterpretes);
      Assert.assertEquals(valorEsperado, valorObtenido);
    }
    */
}