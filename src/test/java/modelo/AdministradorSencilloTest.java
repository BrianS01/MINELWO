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
    
    
    
    
    @BeforeClass
    public static void inicializar() {
        listaDeSencillos=new ArrayList<>();
        administradorSencillo=new AdministradorSencillo();
        
       
      //Sencillo sencillo = new Sencillo("nENA","pablo");
      listaDeSencillos.add(new Sencillo("cancion", "Jose"));
      listaDeSencillos.add(new Sencillo("miVida", "Jorge"));  
       listaDeSencillos.add(new Sencillo("miVida1", "Jorgesito"));  
    }
    
    @Test
    public void ingresarUnSencilloCaso1() {        
       Assert.assertTrue(administradorSencillo.ingresarSencillo("nena","Pablo"));
    }
    
    @Test
    public void ingresarVariosSencillosCaso2(){
        for(Sencillo sencillo : listaDeSencillos){
            Assert.assertTrue(administradorSencillo.ingresarSencillo(sencillo.getNombreCancion(), sencillo.getNombreInterprete()));
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
