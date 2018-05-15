
package vo;

import java.util.List;


public class Sencillo {
    private int idCancion; 
    private String nombreCancion; 
    private String nombreInterprete;
    private int duracion;

    public Sencillo(int idCancion, String nombreCancion, String nombreInterprete, int duracion) {
        this.idCancion = idCancion;
        this.nombreCancion = nombreCancion;
        this.nombreInterprete=nombreInterprete;
        this.duracion=duracion;
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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    
}
