package vo;

import java.awt.List;
import java.util.Date;

/**
 *
 * @author cristian
 */
public class Interprete {

    private String nombreInterprete;
    private Date fecha; 
    

    public Interprete(String nombreInterprete) {
        this.nombreInterprete = nombreInterprete;
    }

    public Interprete(String nombreInterprete, Date fecha) {
        this.nombreInterprete = nombreInterprete;
        this.fecha = fecha;
    }

    public String getNombreInterprete() {
        return nombreInterprete;
    }

    public void setNombreInterprete(String nombreInterprete) {
        this.nombreInterprete = nombreInterprete;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
}
