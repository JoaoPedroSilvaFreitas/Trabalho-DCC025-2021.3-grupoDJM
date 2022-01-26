package ufjf.dcc025.grupodmj.obj;


public class Aluno extends Membro
{
    //Construtor
    Aluno(int ID, String CPF, String Senha, String Nome, String DataDeNasc, String Filiacao, String Telefone, String Endereco, String Turma)
    {
        this.ID = ID;
        this.Senha = Senha;
        this.Nome = Nome;
        this.DataDeNasc = DataDeNasc;
        this.Filiacao = Filiacao;
        this.Telefone = Telefone;
        this.Endereco = Endereco;
        this.Turma = Turma;
    }
    
}
