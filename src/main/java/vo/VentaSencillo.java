/*
 *  PROYECTO TERCER CORTE
 *   co-Author ::: Cristian Espinosa
 *   co-Author ::: Brian Sterling
 *     Program ::: Ingenieria de Software II
 *  Credential ::: SIST0076-G01:SIVII
 */

package vo;

import java.util.Date;

public class VentaSencillo
{
    private int valorVenta; 
    private Date fecha; 
    private int posicionVenta; 
    private int posicionLista; 

    public VentaSencillo(int valorVenta, Date fecha, int posicionVenta, int posicionLista) {
        this.valorVenta = valorVenta;
        this.fecha=fecha; 
        this.posicionVenta = posicionVenta;
        this.posicionLista = posicionLista;
    }

    public int getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(int valorVenta) {
        this.valorVenta = valorVenta;
    }

    public int getPosicionVenta() {
        return posicionVenta;
    }

    public void setPosicionVenta(int posicionVenta) {
        this.posicionVenta = posicionVenta;
    }

    public int getPosicionLista() {
        return posicionLista;
    }

    public void setPosicionLista(int posicionLista) {
        this.posicionLista = posicionLista;
    }
    
    
}