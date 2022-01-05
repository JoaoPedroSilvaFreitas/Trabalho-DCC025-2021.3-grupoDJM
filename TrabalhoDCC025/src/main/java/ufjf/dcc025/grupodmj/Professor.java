package ufjf.dcc025.grupodmj;


public class Professor 
{
    //Atributos
    int id;
    String Nome, CPF, Telefone, Endereco, Turma, Senha;
    
    //Construtor
    Professor(int id, String Nome, String CPF, String Telefone, String Endereco, String Turma)
    {
        this.id = id;
        this.Nome = Nome;
        this.CPF = CPF;
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
    
    void SetCPF(String CPF)
    {
        this.CPF = CPF;
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
    
    String GetNome()
    {
        return this.Nome;
    }
    
    String GetCPF()
    {
        return this.CPF;
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
    
    String GetSenha()
    {
        return this.Senha;
    }
    
    //Altera senha
    void SetSenha(String Senha)
    {
        this.Senha = Senha;
    }  
}
