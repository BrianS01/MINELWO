package vo;

import java.util.Date;

/**
 *
 * @author cristian
 */
public class VentaAlbum {
    private int idVentaSencillo;
    private int cantidad; 
    private Date fecha; 

    public VentaAlbum(int idVentaSencillo, int cantidad, Date fecha) {
        this.idVentaSencillo = idVentaSencillo;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public VentaAlbum(int cantidad, Date fecha) {
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public int getIdVentaSencillo() {
        return idVentaSencillo;
    }

    public void setIdVentaSencillo(int idVentaSencillo) {
        this.idVentaSencillo = idVentaSencillo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
    
}
