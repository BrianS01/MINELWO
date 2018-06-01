/*
 *  PROYECTO TERCER CORTE
 *   co-Author ::: Cristian Espinosa
 *   co-Author ::: Brian Sterling
 *     Program ::: Ingenieria de Software II
 *  Credential ::: SIST0076-G01:SIVII
 */

package vo;

public class Album
{
    private int idAlbum; 
    private String nombreAlbum; 
    private int idInterprete;
    //Si yo tengo una lista de albumes, necesito el idInterprete para poder mostrarlo en la consulta
    //para traerlo manipularlo en java. 

    public Album(int idAlbum, String nombreAlbum, int idInterprete)
    {
        this.idAlbum = idAlbum;
        this.nombreAlbum = nombreAlbum;
        this.idInterprete = idInterprete;
    }
    
    
    public Album(String nombreAlbum,int idInterprete)
    {
        this.nombreAlbum=nombreAlbum;
        this.idInterprete=idInterprete;
    }

    
    public int getIdAlbum()
    {
        return idAlbum;
    }

    public int getIdInterprete() {
        return idInterprete;
    }

    public void setIdInterprete(int idInterprete) {
        this.idInterprete = idInterprete;
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
}