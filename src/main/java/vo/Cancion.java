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

    
    public Cancion(int idCancion, String nombreCancion)
    {
        this.idCancion = idCancion;
        this.nombreCancion = nombreCancion;
    }

    
    public Cancion(String nombreCancion)
    {
        this.nombreCancion = nombreCancion;
    }

    
    public int getIdCancion()
    {
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