package ufjf.dcc025.grupodmj.obj;

import java.util.List;


public class Aluno extends Membro
{
    List<Disciplina> disciplinas;
    //Construtor
    public Aluno(String Id, String Senha, String Nome, String DataDeNasc, String Filiacao, String Telefone, String Endereco)
    {
        this.Id = Id;
        this.Senha = Senha;
        this.Nome = Nome;
        this.DataDeNasc = DataDeNasc;
        this.Filiacao = Filiacao;
        this.Telefone = Telefone;
        this.Endereco = Endereco;
    }
    
    public List<Disciplina> GetDisciplinas()
    {
        return this.disciplinas;
    }
    
    public void SetDisciplinas(List<Disciplina> disciplinas)
    {
        disciplinas = Turma.GetDisciplinas();
    }
    
    //toString
    @Override
    public String toString()
    {
        return this.Id + "  " + this.Nome + "   " + this.DataDeNasc + " " + this.Filiacao + "   " + this.Telefone + "   " + this.Endereco;
    }
}
