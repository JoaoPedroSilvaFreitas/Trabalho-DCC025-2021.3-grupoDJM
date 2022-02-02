package ufjf.dcc025.grupodmj.obj;


public class Disciplina 
{
    //Atributos
    int Horario;
    String id, Nome;
    
    //Construtor
    public Disciplina(String id, String Nome)
    {
        this.id = id;
        this.Nome = Nome;
    }
    
    //Setters
    void SetId(String id)
    {
        this.id = id;
    }
    
    void SetNome(String Nome)
    {
        this.Nome = Nome;
    }
    
    void SetHorario(int Horario)
    {
        //O horario é representado por um inteiro de 2 a 6 que representa os dias da semana entre segunda e sexta feira
        this.Horario = Horario;
    }
    
    //Getters
    String GetId()
    {
        return this.id;
    }
    
    String GetNome()
    {
        return this.Nome;
    }
    
    int GetHorario()
    {
        return this.Horario;
    }
    
}
