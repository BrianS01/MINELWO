package vo;

public class Interprete
{
    private int id;
    private String nombreInterprete;
     

    public Interprete(String nombreInterprete, int id)
    {
        this.nombreInterprete = nombreInterprete;
        this.id = id;
    }

    
    public Interprete(String nombreInterprete)
    {
        this.nombreInterprete = nombreInterprete;
    }

    
    public Interprete(int id)
    {
        this.id = id;
    }

    
    public String getNombreInterprete()
    {
        return nombreInterprete;
    }

    
    public void setNombreInterprete(String nombreInterprete)
    {
        this.nombreInterprete = nombreInterprete;
    }
    
    
    public int getId()
    {
        return id;
    }

    
    public void setId(int id)
    {
        this.id = id;
    }
}