package ufjf.dcc025.grupodmj.obj;

import java.util.Scanner;

public class Professor extends Membro
{
    //Construtor
    public Professor(String Id, String Senha, String Nome, String DataDeNasc, String Filiacao, String Telefone, String Endereco)
    {
        this.Id = Id;
        this.Nome = Nome;
        this.Telefone = Telefone;
        this.Endereco = Endereco;
        this.Senha = Senha;
        this.DataDeNasc = DataDeNasc;
        this.Filiacao = Filiacao;
    }
    
    //Disciplina
    void CadastrarDisciplina()
    {
        String Id, Nome;
        Scanner sc = new Scanner(System.in);
        Disciplina disciplina;
        
        Id = sc.nextLine();
        Nome = sc.nextLine();
        
        disciplina = new Disciplina(Id, Nome);
        Turma.AddDisciplina(disciplina);
    }
    void RemoverDisciplina()
    {
        Scanner sc = new Scanner(System.in);
        String id;
        
        id = sc.nextLine();
        
        for(Disciplina disciplina : Turma.disciplinas)
        {
            if(disciplina.GetId().equals(id))
            {
                Turma.disciplinas.remove(disciplina);
                break;
            }
        }
    }
    void EditarDisciplina()
    {
        Scanner sc = new Scanner(System.in);
        char opt = 'D';
        String id, Aux;
        
        id = sc.nextLine();
        
        for(Disciplina disciplina : Turma.disciplinas)
        {
            if(disciplina.GetId().equals(id))
            {
                do{
                    System.out.println("------------Editar------------");
                    System.out.println("1-Id");
                    System.out.println("2-Nome");
                    System.out.println("0-Sair");
                    opt = sc.next().charAt(0);
                }while(opt != '0' && opt != '1' && opt != '2');
                
                if(opt == '0')
                {
                    break;
                }
                
                if(opt == '1')
                {
                    Aux = sc.nextLine();
                    disciplina.SetId(Aux);
                }
                
                if(opt == '2')
                {
                    Aux = sc.nextLine();
                    disciplina.SetNome(Aux);
                }
                
                break;
            }
        }
    }
    void DadosDisciplina()
    {
        Scanner sc = new Scanner(System.in);
        String id;
        
        id = sc.nextLine();
        
        for(Disciplina disciplina : Turma.disciplinas)
        {
            if(disciplina.GetId().equals(id))
            {
                System.out.println("Id:" + disciplina.GetId());
                System.out.println("Nome:" + disciplina.GetNome());
                break;
            }
        }
    }
    
    //toString
    @Override
    public String toString()
    {
        return this.Id + "  " + this.Nome + "   " + this.DataDeNasc + " " + this.Filiacao + "   " + this.Telefone + "   " + this.Endereco;
    }
    
}
