/*
 *  PROYECTO TERCER CORTE
 *   co-Author ::: Cristian Espinosa
 *   co-Author ::: Brian Sterling
 *     Program ::: Ingenieria de Software II
 *  Credential ::: SIST0076-G01:SIVII
 */

package modelo;

public class ClaseDePruebaAlbum
{
    
    private int idAlbum; 
    private String nombreAlbum; 
    private String nombreInterprete;

    public ClaseDePruebaAlbum(int idAlbum, String nombreAlbum, String nombreInterprete)
    {
        this.idAlbum = idAlbum;
        this.nombreAlbum = nombreAlbum;
        this.nombreInterprete = nombreInterprete;
    }
    

    public int getIdAlbum()
    {
        return idAlbum;
    }

    public void setIdAlbum(int idAlbum)
    {
        this.idAlbum = idAlbum;
    }

    public String getNombreAlbum()
    {
        return nombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum)
    {
        this.nombreAlbum = nombreAlbum;
    }

    public String getNombreInterprete()
    {
        return nombreInterprete;
    }

    public void setNombreInterprete(String nombreInterprete)
    {
        this.nombreInterprete = nombreInterprete;
    }
    
    
    
}