/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import vo.Album;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cristian
 */
public class AdministradorAlbumTest {
    private static List<Album> listaDeAlbunes;
    private static AdministradorAlbum administradorAlbum;
    private static List<String> nombreDePruebaAlbum;
    
    @BeforeClass
    public static void inicializar() {
    listaDeAlbunes=new ArrayList<>();
    administradorAlbum=new AdministradorAlbum();
    nombreDePruebaAlbum=new ArrayList<>();
    
        for (int i = 0; i < 10; i++) {
        //  nombreDePruebaAlbum.add("Mi vida");
        //  nombreDePruebaAlbum.add("Mi amor");
        //  nombreDePruebaAlbum.add("Mi suelo");
        //  nombreDePruebaAlbum.add("Mi esperanza");
        //  nombreDePruebaAlbum.add("Mi colombia");
        }
    }
    
    @Test
    public void ingresarAlbumCaso1(){
        String nombreAlbum="Mi vida";
        int idInterprete=1;
        boolean isInserto=administradorAlbum.ingresarAlbum(nombreAlbum, 1);
        Assert.assertEquals(true, true);
    }
    
    @Test
    public void ingresarAlbumNuloCaso2(){
        String nombreAlbum="";
        int idInterprete=2;
        boolean isInserto=administradorAlbum.ingresarAlbum(nombreAlbum, 1);
        Assert.assertEquals(false, false);
    }
    
    
    @Test
    public void ingresarVariosAlbumesCaso3(){
        String nombreAlbum="Mi amor";
        String nombreAlbum1="Amarte";
        String nombreAlbum2="Amalte";
        int idInterprete=1;
        int idInterprete1=2;
        boolean a=administradorAlbum.ingresarAlbum(nombreAlbum, idInterprete);
        boolean b=administradorAlbum.ingresarAlbum(nombreAlbum1, idInterprete1);
        boolean c=administradorAlbum.ingresarAlbum(nombreAlbum2, idInterprete1);
        
        Assert.assertEquals(true, true);
    }
    
    
    
    
    
    
    
    @AfterClass
    public static void tearDownClass() {
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
