
package modelo;

/**
 *
 * @author cristian
 * Esta clase es sólo para utilizarla en las pruebas de testing, no forma parte del programa en sí.
 * la letra p hace referencia a que la variables creadas son para una prueba.
 */
public class ClaseDePruebaSencillo {
    private int p_idInterprete;
    private String p_nombreCancion;
    private String p_nombreInterprete;
    private int p_duracion;

    public ClaseDePruebaSencillo(int p_idInterprete, String p_nombreCancion, String p_nombreInterprete, int p_duracion) {
        this.p_idInterprete = p_idInterprete;
        this.p_nombreCancion = p_nombreCancion;
        this.p_nombreInterprete = p_nombreInterprete;
        this.p_duracion = p_duracion;
    }

    public int getP_idInterprete() {
        return p_idInterprete;
    }

    public void setP_idInterprete(int p_idInterprete) {
        this.p_idInterprete = p_idInterprete;
    }

    public String getP_nombreCancion() {
        return p_nombreCancion;
    }

    public void setP_nombreCancion(String p_nombreCancion) {
        this.p_nombreCancion = p_nombreCancion;
    }

    public String getP_nombreInterprete() {
        return p_nombreInterprete;
    }

    public void setP_nombreInterprete(String p_nombreInterprete) {
        this.p_nombreInterprete = p_nombreInterprete;
    }

    public int getP_duracion() {
        return p_duracion;
    }

    public void setP_duracion(int p_duracion) {
        this.p_duracion = p_duracion;
    }
    
    
    
    
}
