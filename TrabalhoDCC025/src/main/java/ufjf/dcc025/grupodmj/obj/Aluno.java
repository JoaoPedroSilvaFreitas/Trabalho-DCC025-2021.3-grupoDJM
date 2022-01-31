package ufjf.dcc025.grupodmj.obj;


public class Aluno extends Membro
{
    //Construtor
    Aluno(String Id, String Senha, String Nome, String DataDeNasc, String Filiacao, String Telefone, String Endereco)
    {
        this.Id = Id;
        this.Senha = Senha;
        this.Nome = Nome;
        this.DataDeNasc = DataDeNasc;
        this.Filiacao = Filiacao;
        this.Telefone = Telefone;
        this.Endereco = Endereco;
    }
    
}
