package ufjf.dcc025.grupodmj.obj;


abstract class Membro extends Usuario
{
    String Id, Nome, DataDeNasc, Filiacao, Telefone, Endereco;
    Turma Turma;
    
    //Getters
    public String GetId()
    {
        return this.Id;
    }
    
    public String GetNome()
    {
        return this.Nome;
    }
    
    public String GetDataDeNasc()
    {
        return this.DataDeNasc;
    }
    
    public String GetFiliacao()
    {
        return this.Filiacao;
    }
    
    public String GetTelefone()
    {
        return this.Telefone;
    }
    
    public String GetEndereco()
    {
        return this.Endereco;
    }
            
    public Turma GetTurma()
    {
        return this.Turma;
    }
    
    //Setters
    public void SetId(String Id)
    {
        this.Id = Id;
    }
    
    public void SetNome(String Nome)
    {
        this.Nome = Nome;
    }
    
    public void SetDataDeNasc(String DataDeNasc)
    {
        this.DataDeNasc = DataDeNasc;
    }
    
    public void SetFiliacao(String Filiacao)
    {
        this.Filiacao = Filiacao;
    }
    
    public void SetTelefone(String Telefone)
    {
        this.Telefone = Telefone;
    }
    
    public void SetEndereco(String Endereco)
    {
        this.Endereco = Endereco;
    }
            
    public void SetTurma(Turma Turma)
    {
        this.Turma = Turma;
    }
    
}
