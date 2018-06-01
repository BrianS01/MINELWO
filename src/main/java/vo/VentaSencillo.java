package vo;

import java.util.Date;

public class VentaSencillo
{   
    private int id;
    private int cantidad; 
    private Date fecha; 
    private int idSencillo; 

    public VentaSencillo(int cantidadVentas, Date fecha, int idSencillo) {
        this.cantidad = cantidad;
        this.fecha=fecha; 
        this.idSencillo=idSencillo;
    }

    public VentaSencillo(int id, int cantidadVentas, Date fecha, int idSencillo) {
        this.id = id;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.idSencillo=idSencillo;
    }

    public int getIdSencillo() {
        return idSencillo;
    }

    public void setIdSencillo(int idSencillo) {
        this.idSencillo = idSencillo;
    }
    
    

    public int getValorVenta() {
        return cantidad;
    }

    public void setValorVenta(int valorVenta) {
        this.cantidad = valorVenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
 
    
}