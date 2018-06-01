/*
 *  PROYECTO TERCER CORTE
 *   co-Author ::: Cristian Espinosa
 *   co-Author ::: Brian Sterling
 *     Program ::: Ingenieria de Software II
 *  Credential ::: SIST0076-G01:SIVII
 */

package vo;

import java.util.Date;

/**
 *
 * @author cristian
 */
public class VentaAlbum {
    private int id;
    private int cantidad; 
    private Date fecha; 
    private int idAlbum; 

    public VentaAlbum(int id, Date fecha, int cantidad, int idAlbum) {
        this.id = id;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.idAlbum=idAlbum; 
    }

    public VentaAlbum(Date fecha, int cantidad, int idAlbum) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.idAlbum=idAlbum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(int idAlbum) {
        this.idAlbum = idAlbum;
    }

    
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
    
}
