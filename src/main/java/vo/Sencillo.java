
package vo;

import java.util.List;

public class Sencillo
{
    private int idCancion; 
    private String nombreCancion; 
    private String nombreInterprete;

    public Sencillo(String nombreCancion) {
        
        this.nombreCancion = nombreCancion;
        
    }

    public Sencillo(int idCancion, String nombreCancion) {
        this.idCancion = idCancion;
        this.nombreCancion = nombreCancion;
        
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
