package vo;

/**
 *
 * @author cristian
 */
public class Cancion {

    private int idCancion;
    private String nombreCancion; 
    private int idAlbum; 

    public Cancion(int idCancion, String nombreCancion, int idAlbum) {
        this.idCancion = idCancion;
        this.nombreCancion = nombreCancion;
        this.idAlbum=idAlbum;
    }

    public Cancion(String nombreCancion, int idAlbum) {
        this.nombreCancion = nombreCancion;
        this.idAlbum=idAlbum;
    }

    public int getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(int idAlbum) {
        this.idAlbum = idAlbum;
    }

    
    
    public int getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(int idCancion) {
        this.idCancion = idCancion;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    
    
    
}
