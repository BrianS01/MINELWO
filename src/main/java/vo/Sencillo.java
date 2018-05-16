
package vo;

import java.util.List;


public class Sencillo {
    private int idCancion; 
    private String nombreCancion; 
    private String nombreInterprete;

    public Sencillo(String nombreCancion, String nombreInterprete) {
        
        this.nombreCancion = nombreCancion;
        this.nombreInterprete=nombreInterprete;
    }

    public Sencillo(int idCancion, String nombreCancion, String nombreInterprete) {
        this.idCancion = idCancion;
        this.nombreCancion = nombreCancion;
        this.nombreInterprete = nombreInterprete;
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

    public String getNombreInterprete() {
        return nombreInterprete;
    }

    public void setNombreInterprete(String nombreInterprete) {
        this.nombreInterprete = nombreInterprete;
    }
}
