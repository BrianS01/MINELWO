package modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import vo.Sencillo;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author cristian
 */
public class AdministradorSencilloTest
{
    
    private static List<Sencillo> listaDeSencillos;
    private static AdministradorSencillo administradorSencillo;
    private static AdministradorInterprete administradorInterprete;
    
    
    
    
    @BeforeClass
    public static void inicializar() {
        listaDeSencillos=new ArrayList<>();
        administradorSencillo=new AdministradorSencillo();
        
       
      //Sencillo sencillo = new Sencillo("nENA","pablo");
      listaDeSencillos.add(new Sencillo("cancion"));
      listaDeSencillos.add(new Sencillo("miVida"));  
       listaDeSencillos.add(new Sencillo("miVida1"));  
    }
    
    @Test
    public void ingresarUnSencilloCaso1() {        
       Assert.assertTrue(administradorSencillo.ingresarSencillo("nena"));
    }
    
    @Test
    public void ingresarVariosSencillosCaso2(){
        for(Sencillo sencillo : listaDeSencillos){
       //     Assert.assertTrue(administradorSencillo.ingresarSencillo(sencillo.getNombreCancion()));
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