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
    

    public Sencillo(String nombreSencillo)
    {    
        this.nombreSencillo = nombreSencillo;
    }

    public Sencillo(int idSencillo, String nombreSencillo)
    {
        this.idSencillo = idSencillo;
        this.nombreSencillo = nombreSencillo;
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

    public void setNombreSencillo(String nombreSencillo) {
        this.nombreSencillo = nombreSencillo;
    }

    
}