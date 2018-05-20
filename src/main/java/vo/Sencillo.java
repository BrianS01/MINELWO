
package vo;

import java.util.List;

public class Sencillo
{
    private int idSencillo; 
    private String nombreSencillo; 
    

    public Sencillo(String nombreCancion) {    
        this.nombreSencillo = nombreCancion;
    }

    public Sencillo(int idSencillo, String nombreSencillo) {
        this.idSencillo = idSencillo;
        this.nombreSencillo = nombreSencillo;
    }

    public int getIdSencillo() {
        return idSencillo;
    }

    public void setIdSencillo(int idSencillo) {
        this.idSencillo = idSencillo;
    }

    public String getNombreSencillo() {
        return nombreSencillo;
    }

    public void setNombreSencillo(String nombreSencillo) {
        this.nombreSencillo = nombreSencillo;
    }

    
}
