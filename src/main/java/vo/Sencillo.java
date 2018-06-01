
package vo;

import java.util.List;

public class Sencillo
{
    private int idSencillo; 
    private String nombreSencillo; 
    private int idInterprete;

    public Sencillo(String nombreSencillo) {    
        this.nombreSencillo = nombreSencillo;
    }

    public Sencillo(int idSencillo, String nombreSencillo, int idInterprete) {
        this.idSencillo = idSencillo;
        this.nombreSencillo = nombreSencillo;
        this.idInterprete=idInterprete;
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

    public int getIdInterprete() {
        return idInterprete;
    }

    public void setIdInterprete(int idInterprete) {
        this.idInterprete = idInterprete;
    }
    

    
}
