package ufjf.dcc025.grupodmj;


public class Disciplina 
{
    //Atributos
    int id;
    String Nome;
    
    //Construtor
    Disciplina(int id, String Nome)
    {
        this.id = id;
        this.Nome = Nome;
    }
    
    //Setters
    void SetId(int id)
    {
        this.id = id;
    }
    
    void SetNome(String Nome)
    {
        this.Nome = Nome;
    }
    
    
    //Getters
    int GetId()
    {
        return this.id;
    }
    
    String GetNome()
    {
        return this.Nome;
    }
    
}
