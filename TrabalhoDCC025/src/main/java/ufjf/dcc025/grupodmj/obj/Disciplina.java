package ufjf.dcc025.grupodmj.obj;


public class Disciplina 
{
    //Atributos
    String id, Nome;
    String mural;
    
    //Construtor
    public Disciplina(String id, String Nome)
    {
        this.id = id;
        this.Nome = Nome;
    }
    
    //Setters
    public void SetId(String id)
    {
        this.id = id;
    }
    
    public void SetNome(String Nome)
    {
        this.Nome = Nome;
    }
    
    public void SetMural(String mural)
    {
        this.mural = mural;
    }
    
    
    //Getters
    public String GetId()
    {
        return this.id;
    }
    
    public String GetNome()
    {
        return this.Nome;
    }
    
    public String GetMural()
    {
        return this.mural;
    }
    
    //toString
    @Override
    public String toString()
    {
        return this.id + "  " + this.Nome;
    }
    
}
