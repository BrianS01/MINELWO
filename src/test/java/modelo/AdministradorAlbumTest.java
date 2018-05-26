/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import vo.Album;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class AdministradorAlbumTest
{
    private static List<Album> listaDeAlbunes;
    private static AdministradorAlbum administradorAlbum;
    private static List<ClaseDePruebaAlbum> listaDePruebaAlbum;
    
    
    @BeforeClass
    public static void inicializar()
    {
    listaDeAlbunes=new ArrayList<>();
    administradorAlbum=new AdministradorAlbum();
    listaDePruebaAlbum=new ArrayList<>();
    
        for (int i = 0; i < 10; i++)
        {
            //listaDePruebaAlbum.add(e)
        }
    }
    
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    
    @Before
    public void setUp()
    {
    }
    
    
    @After
    public void tearDown()
    {
    }
}