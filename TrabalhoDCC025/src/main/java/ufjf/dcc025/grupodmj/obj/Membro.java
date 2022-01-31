package ufjf.dcc025.grupodmj.obj;


abstract class Membro extends Usuario
{
    String Id, Nome, DataDeNasc, Filiacao, Telefone, Endereco;
    Turma Turma;
    
    //Getters
    String GetId()
    {
        return this.Id;
    }
    
    String GetNome()
    {
        return this.Nome;
    }
    
    String GetDataDeNasc()
    {
        return this.DataDeNasc;
    }
    
    String GetFiliacao()
    {
        return this.Filiacao;
    }
    
    String GetTelefone()
    {
        return this.Telefone;
    }
    
    String GetEndereco()
    {
        return this.Endereco;
    }
            
    Turma GetTurma()
    {
        return this.Turma;
    }
    
    //Setters
    void SetId(String Id)
    {
        this.Id = Id;
    }
    
    void SetNome(String Nome)
    {
        this.Nome = Nome;
    }
    
    void SetDataDeNasc(String DataDeNasc)
    {
        this.DataDeNasc = DataDeNasc;
    }
    
    void SetFiliacao(String Filiacao)
    {
        this.Filiacao = Filiacao;
    }
    
    void SetTelefone(String Telefone)
    {
        this.Telefone = Telefone;
    }
    
    void SetEndereco(String Endereco)
    {
        this.Endereco = Endereco;
    }
            
    void SetTurma(Turma Turma)
    {
        this.Turma = Turma;
    }
    
}
