package vo;

public class Album
{
    private int idAlbum; 
    private String nombreAlbum; 
    

    public Album(int idAlbum, String nombreAlbum)
    {
        this.idAlbum = idAlbum;
        this.nombreAlbum = nombreAlbum;
    }
    
    
    public Album(String nombreAlbum)
    {
        this.nombreAlbum=nombreAlbum;
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
}