package modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import vo.Interprete;
import vo.Sencillo;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cristian
 */
public class AdministradorSencilloTest {
    
    private static List<Sencillo> listaDeSencillos;
    private static AdministradorSencillo administradorSencillo;
    private static AdministradorInterprete administradorInterprete;
    private static List<ClaseDePruebaSencillo> listaDePruebaSencillos;
    private static List<Interprete> interpretes;
    private static List<String> nombresDeInterpretes;
    
    
    @BeforeClass
    public static void inicializar() {
        listaDeSencillos=new ArrayList<>();
        administradorSencillo=new AdministradorSencillo();
        listaDePruebaSencillos=new ArrayList<>();
        nombresDeInterpretes=new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            
        nombresDeInterpretes.add("Henry falcon");
            nombresDeInterpretes.add("Henry Steven");
            nombresDeInterpretes.add("Marta Stuart");
            nombresDeInterpretes.add("Sterling");
            nombresDeInterpretes.add("g001");
            nombresDeInterpretes.add("wisin");
            nombresDeInterpretes.add("yandel");
            nombresDeInterpretes.add("aquiles brinco");
        }
        for (int i = 0; i < 10; i++) {
            //listaDePruebaSencillos.add(0, "nena",administradorInterprete.getInterpretes().get(0).getNombreInterprete(), 5);
            
        }
    }
    
    @Test
    public void ingresarUnSencilloCaso1() {
        boolean valorEsperado=true;
        for (String nombre : nombresDeInterpretes ) {
            administradorInterprete.ingresarInterprete(nombre);
        }
        
   // administradorSencillo.ingresarSencillo(0, "nunca te volvere a ver",administradorInterprete.getInterpretes().get(0).getNombreInterprete(), 3);
      boolean ingresoSencillo=administradorSencillo.ingresarSencillo(0, "nena",administradorInterprete.getInterpretes().get(0).getNombreInterprete(), 5 );
      
      Assert.assertEquals(valorEsperado, ingresoSencillo);
    }
    
    public void ingresarVariosSencillosCaso2(){
        
        for (String nombre : nombresDeInterpretes ) {
            administradorInterprete.ingresarInterprete(nombre);
        }
        
        
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
