package vo;

import java.awt.List;
import java.util.Date;

/**
 *
 * @author cristian
 */
public class Interprete {

    private String nombreInterprete;
    private int dia; 
    private String mes;
    private int year; 
    

    public Interprete(String nombreInterprete) {
        this.nombreInterprete = nombreInterprete;
    }

    public Interprete(int dia, String mes, int year) {
        this.dia=dia;
        this.mes=mes;
        this.year=year;
    }

    public String getNombreInterprete() {
        return nombreInterprete;
    }

    public void setNombreInterprete(String nombreInterprete) {
        this.nombreInterprete = nombreInterprete;
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

    

}
