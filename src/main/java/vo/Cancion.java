/*
 *  PROYECTO TERCER CORTE
 *   co-Author ::: Cristian Espinosa
 *   co-Author ::: Brian Sterling
 *     Program ::: Ingenieria de Software II
 *  Credential ::: SIST0076-G01:SIVII
 */

package vo;

public class Cancion
{
    private int idCancion;
    private String nombreCancion; 
    private int idAlbum; 

<<<<<<< HEAD
    public Cancion(int idCancion, String nombreCancion, int idAlbum) {
=======
    
    public Cancion(int idCancion, String nombreCancion)
    {
>>>>>>> 8bcb80fa1ff5b4c302e1a9c048ba3beb77356f02
        this.idCancion = idCancion;
        this.nombreCancion = nombreCancion;
        this.idAlbum=idAlbum;
    }

<<<<<<< HEAD
    public Cancion(String nombreCancion, int idAlbum) {
=======
    
    public Cancion(String nombreCancion)
    {
>>>>>>> 8bcb80fa1ff5b4c302e1a9c048ba3beb77356f02
        this.nombreCancion = nombreCancion;
        this.idAlbum=idAlbum;
    }

<<<<<<< HEAD
    public int getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(int idAlbum) {
        this.idAlbum = idAlbum;
    }

    
    
    public int getIdCancion() {
=======
    
    public int getIdCancion()
    {
>>>>>>> 8bcb80fa1ff5b4c302e1a9c048ba3beb77356f02
        return idCancion;
    }

    
    public void setIdCancion(int idCancion)
    {
        this.idCancion = idCancion;
    }

    
    public String getNombreCancion()
    {
        return nombreCancion;
    }

    
    public void setNombreCancion(String nombreCancion)
    {
        this.nombreCancion = nombreCancion;
    }
}