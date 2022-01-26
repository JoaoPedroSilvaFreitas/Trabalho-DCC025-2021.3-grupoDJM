package ufjf.dcc025.grupodmj.obj;


abstract class Membro extends Usuario
{
    int ID;
    String Nome, DataDeNasc, CPF, Filiacao, Telefone, Endereco, Turma;
    
    //Getters
    int GetId()
    {
        return this.ID;
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
            
    String GetTurma()
    {
        return this.Turma;
    }
    
    String GetCPF()
    {
        return this.CPF;
    }
    
    //Setters
    void SetId(int ID)
    {
        this.ID = ID;
    }
    
    void SetNome(String Nome)
    {
        this.Nome = Nome;
    }
    
    void SetDataDeNasc(String DataDeNasc)
    {
        this.DataDeNasc = DataDeNasc;
    }
    
    void SetResponsavel(String Filiacao)
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
            
    void SetTurma(String Turma)
    {
        this.Turma = Turma;
    }
    
    void SetCPF(String CPF)
    {
        this.CPF = CPF;
    }
    
}
