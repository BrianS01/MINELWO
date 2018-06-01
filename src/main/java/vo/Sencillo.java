/*
 *  PROYECTO TERCER CORTE
 *   co-Author ::: Cristian Espinosa
 *   co-Author ::: Brian Sterling
 *     Program ::: Ingenieria de Software II
 *  Credential ::: SIST0076-G01:SIVII
 */

package vo;

public class Sencillo
{
    private int idSencillo; 
    private String nombreSencillo; 
    private int idInterprete;

    public Sencillo(String nombreSencillo)
    {    
        this.nombreSencillo = nombreSencillo;
    }

<<<<<<< HEAD
    public Sencillo(int idSencillo, String nombreSencillo, int idInterprete) {
=======
    public Sencillo(int idSencillo, String nombreSencillo)
    {
>>>>>>> 8bcb80fa1ff5b4c302e1a9c048ba3beb77356f02
        this.idSencillo = idSencillo;
        this.nombreSencillo = nombreSencillo;
        this.idInterprete=idInterprete;
    }

    
    public int getIdSencillo()
    {
        return idSencillo;
    }

    
    public void setIdSencillo(int idSencillo)
    {
        this.idSencillo = idSencillo;
    }

    
    public String getNombreSencillo()
    {
        return nombreSencillo;
    }

<<<<<<< HEAD
    public void setNombreSencillo(String nombreSencillo) {
        this.nombreSencillo = nombreSencillo;
    }

    public int getIdInterprete() {
        return idInterprete;
    }

    public void setIdInterprete(int idInterprete) {
        this.idInterprete = idInterprete;
    }
    

=======
>>>>>>> 8bcb80fa1ff5b4c302e1a9c048ba3beb77356f02
    
    public void setNombreSencillo(String nombreSencillo)
    {
        this.nombreSencillo = nombreSencillo;
    } 
}