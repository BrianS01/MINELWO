/*
 *  PROYECTO TERCER CORTE
 *   co-Author ::: Cristian Espinosa
 *   co-Author ::: Brian Sterling
 *     Program ::: Ingenieria de Software II
 *  Credential ::: SIST0076-G01:SIVII
 */

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
    private static List<String> nombresDeSencillos;
    
    
    @BeforeClass
    public static void inicializar()
    {
        listaDeSencillos=new ArrayList<>();
        administradorSencillo=new AdministradorSencillo();
<<<<<<< HEAD
        nombresDeSencillos=new ArrayList<>();  
    }
    
=======
        //Sencillo sencillo = new Sencillo("nENA","pablo");
        listaDeSencillos.add(new Sencillo("cancion"));
        listaDeSencillos.add(new Sencillo("miVida"));  
        listaDeSencillos.add(new Sencillo("miVida1"));  
    }
    
    
    @Test
    public void ingresarUnSencilloCaso1()
    {
        Assert.assertTrue(administradorSencillo.ingresarSencillo("nena"));
    }
    
    
    @Test
    public void ingresarVariosSencillosCaso2()
    {
        for(Sencillo sencillo : listaDeSencillos)
        {
            //Assert.assertTrue(administradorSencillo.ingresarSencillo(sencillo.getNombreCancion()));
        }        
    }
>>>>>>> 8bcb80fa1ff5b4c302e1a9c048ba3beb77356f02
    
    
    @Before
    public void setUp()
    {
    }
    
    
    @After
    public void tearDown()
    {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}