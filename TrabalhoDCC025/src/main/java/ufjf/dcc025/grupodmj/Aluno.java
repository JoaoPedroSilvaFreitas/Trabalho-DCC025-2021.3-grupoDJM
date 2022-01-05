package ufjf.dcc025.grupodmj;


public class Aluno 
{
    //Atributos
    int id;
    String Senha, Nome, DataDeNasc, Responsavel, Telefone, Endereco, Turma;
    
    //Construtor
    Aluno(int id, String Senha, String Nome, String DataDeNasc, String Responsavel, String Telefone, String Endereco, String Turma)
    {
        this.id = id;
        this.Senha = Senha;
        this.Nome = Nome;
        this.DataDeNasc = DataDeNasc;
        this.Responsavel = Responsavel;
        this.Telefone = Telefone;
        this.Endereco = Endereco;
        this.Turma = Turma;
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
    
    void SetDataDeNasc(String DataDeNasc)
    {
        this.DataDeNasc = DataDeNasc;
    }
    
    void SetResponsavel(String Responsavel)
    {
        this.Responsavel = Responsavel;
    }
    
    void SetTelefone(String Telefone)
    {
        this.Telefone = Telefone;
    }
    
    void SetEndereco(String Endereco)
    {
        this.Endereco = Endereco;
    }
            
    void SetTurma(String Turma)
    {
        this.Turma = Turma;
    }
    
    //Getters
    int GetId()
    {
        return this.id;
    }
    
    String GetSenha()
    {
        return this.Senha;
    }
    
    String GetNome()
    {
        return this.Nome;
    }
    
    String GetDataDeNasc()
    {
        return this.DataDeNasc;
    }
    
    String GetResponsavel()
    {
        return this.Responsavel;
    }
    
    String GetTelefone()
    {
        return this.Telefone;
    }
    
    String GetEndereco()
    {
        return this.Endereco;
    }
            
    String GetTurma()
    {
        return this.Turma;
    }
    
    //Altera senha
    void SetSenha(String Senha)
    {
        this.Senha = Senha;
    }

    
}
