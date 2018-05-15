package vo;

/**
 *
 * @author cristian
 */
public class Venta {

    private int valorVenta; 
    private int dia; 
    private String mes; 
    private int year;
    private int posicionVenta; 
    private int posicionLista; 

    public Venta(int valorVenta, int dia, String mes, int year, int posicionVenta, int posicionLista) {
        this.valorVenta = valorVenta;
        this.dia = dia;
        this.mes = mes;
        this.year = year;
        this.posicionVenta = posicionVenta;
        this.posicionLista = posicionLista;
    }

    public int getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(int valorVenta) {
        this.valorVenta = valorVenta;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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
