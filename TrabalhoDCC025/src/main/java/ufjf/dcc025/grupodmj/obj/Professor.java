package ufjf.dcc025.grupodmj.obj;


public class Professor extends Membro
{
    //Construtor
    Professor(int ID, String CPF, String Senha, String Nome, String DataDeNasc, String Filiacao, String Telefone, String Endereco, String Turma)
    {
        this.ID = ID;
        this.Nome = Nome;
        this.CPF = CPF;
        this.Telefone = Telefone;
        this.Endereco = Endereco;
        this.Turma = Turma;
        this.Senha = Senha;
        this.DataDeNasc = DataDeNasc;
        this.Filiacao = Filiacao;
        
        
    }
    
     
}
