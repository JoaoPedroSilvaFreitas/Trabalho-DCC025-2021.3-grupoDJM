package ufjf.dcc025.grupodmj.obj;


public class Turma 
{
    //Atributos
    int id, Ano, IdProfessor;
    String Turno, Titulo, Horario;
    
    //Construtor
    Turma(int id, int Ano, int IdProfessor, String Turno, String Titulo, String Horario)
    {
        this.id = id;
        this.Ano = Ano;
        this.Turno = Turno;
        this.Titulo = Titulo;
        this.Horario = Horario;
        this.IdProfessor = IdProfessor;
    }
    
    //Adiciona alunos na turma
    void SetAlunos()
    {
        
    }
    
    //Edita Professor da turma
    void SetProfessor()
    {
        
    }
    
    //Adiciona disciplinas na turma
    void SetDisciplinas()
    {
        
    }
    
    //Setters
    void SetId(int id)
    {
        this.id = id;
    }
    
    void SetAno(int Ano)
    {
        this.Ano = Ano;
    }
    
    void SetProfessor(int IdProfessor)
    {
        this.IdProfessor = IdProfessor;
    }
    
    void SetTurno(String Turno)
    {
        this.Turno = Turno;
    }
    
    void SetTitulo(String Titulo)
    {
        this.Titulo = Titulo;
    }
    
    void SetHorario(String Horario)
    {
        this.Horario = Horario;
    }
    
    //Getters
    int GetId()
    {
        return this.id;
    }
    
    int GetAno()
    {
        return this.Ano;
    }
    
    int GetProfessor()
    {
        return this.IdProfessor;
    }
    
    String GetTurno()
    {
        return this.Turno;
    }
    
    String GetTitulo()
    {
        return this.Titulo;
    }
    
    String GetHorario()
    {
        return this.Horario;
    }
    
}
