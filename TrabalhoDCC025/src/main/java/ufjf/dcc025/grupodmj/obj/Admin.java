package ufjf.dcc025.grupodmj.obj;

import java.util.Scanner;
import java.util.*;

public class Admin extends Usuario
{   
    List<Aluno> alunos = new ArrayList<>();
    List<Professor> professores = new ArrayList<>();
    List<Turma> turmas = new ArrayList<>();
    
    public Admin()
    {
        this.Usuario = "Admin";
        this.Senha = "Admin";
    }
    
    public List<Aluno> GetAlunos()
    {
        return this.alunos;
    }
    
    public List<Professor> GetProfessores()
    {
        return this.professores;
    }
    
    public List<Turma> GetTurmas()
    {
        return this.turmas;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //DAQUI PRA BAIXO O CODIGO É IRRELEVANTE E PROVAVELMENTE SERÁ APAGADO NO FUTURO
    
    //Aluno
    public void CadastrarAluno()
    {
        String Id, senha, Nome, DataDeNasc, Filiacao, Telefone, Endereco;
        Scanner sc = new Scanner(System.in);
        Aluno aluno;
        
        Id = sc.nextLine();
        Nome = sc.nextLine();
        senha = sc.nextLine();
        DataDeNasc = sc.nextLine();
        Filiacao = sc.nextLine();
        Telefone = sc.nextLine();
        Endereco = sc.nextLine();
        
        aluno = new Aluno(Id, senha, Nome, DataDeNasc, Filiacao, Telefone, Endereco);
        alunos.add(aluno);
    }
    public void RemoverAluno()
    {
        Scanner sc = new Scanner(System.in);
        String id;
        
        id = sc.nextLine();
        
        for(Aluno aluno : alunos)
        {
            if(aluno.GetId().equals(id))
            {
                alunos.remove(aluno);
                break;
            }
        }
    }
    public void EditarAluno()
    {
        Scanner sc = new Scanner(System.in);
        String Aux, id, idaux;
        char opt = 'D';
        
        id = sc.nextLine();
        
        for(Aluno aluno : alunos)
        {
            if(aluno.GetId().equals(id))
            {
                do{
                    opt = MenuEditarAlunoProf();
                }while(opt != '0' && opt != '1' && opt != '2' && opt != '3' && opt != '4' && opt != '5' && opt != '6');
                
                if(opt == '0')
                {
                    break;
                }
                
                if(opt == '1')
                {
                    System.out.println("Novo ID:");
                    idaux = sc.nextLine();
                    aluno.SetId(idaux);
                }
                
                if(opt == '2')
                {
                    System.out.println("Novo nome:");
                    Aux = sc.nextLine();
                    aluno.SetNome(Aux);
                }
                
                if(opt == '3')
                {
                    System.out.println("Nova data de nascimento:");
                    Aux = sc.nextLine();
                    aluno.SetDataDeNasc(Aux);
                }
                
                if(opt == '4')
                {
                    System.out.println("Novo responsável:");
                    Aux = sc.nextLine();
                    aluno.SetFiliacao(Aux);
                }
                
                if(opt == '5')
                {
                    System.out.println("Novo telefone:");
                    Aux = sc.nextLine();
                    aluno.SetTelefone(Aux);
                }
                
                if(opt == '6')
                {
                    System.out.println("Novo endereço:");
                    Aux = sc.nextLine();
                    aluno.SetEndereco(Aux);
                }
                
                break;
            }
        }
    }
    public void DadosAluno()
    {
        Scanner sc = new Scanner(System.in);
        String id;
        
        id = sc.nextLine();
        
        for(Aluno aluno : alunos)
        {
            if(aluno.GetId().equals(id))
            {
                System.out.println("Id: " + aluno.GetId());
                System.out.println("Turma: " + aluno.GetTurma());
                System.out.println("Nome: " + aluno.GetNome());
                System.out.println("Data de Nascimento: " + aluno.GetDataDeNasc());
                System.out.println("Responsável: " + aluno.GetFiliacao());
                System.out.println("Telefone: " + aluno.GetTelefone());
                System.out.println("Endereço: " + aluno.GetEndereco());
                break;
            }
        }
    }
    
    //Professor
    public void CadastrarProfessor()
    {
        String Id, senha, Nome, DataDeNasc, Filiacao, Telefone, Endereco;
        Scanner sc = new Scanner(System.in);
        Professor professor;
        
        Id = sc.nextLine();
        Nome = sc.nextLine();
        senha = sc.nextLine();
        DataDeNasc = sc.nextLine();
        Filiacao = sc.nextLine();
        Telefone = sc.nextLine();
        Endereco = sc.nextLine();
        
        professor = new Professor(Id, senha, Nome, DataDeNasc, Filiacao, Telefone, Endereco);
        professores.add(professor);
    }
    public void RemoverProfessor()
    {
        Scanner sc = new Scanner(System.in);
        String id;
        
        id = sc.nextLine();
        
        for(Professor professor : professores)
        {
            if(professor.GetId().equals(id))
            {
                professores.remove(professor);
                break;
            }
        }
    }
    public void EditarProfessor()
    {
        Scanner sc = new Scanner(System.in);
        String Aux, id, idaux;
        char opt = 'D';
        
        id = sc.nextLine();
        
        for(Professor professor : professores)
        {
            if(professor.GetId().equals(id))
            {
                do{
                    opt = MenuEditarAlunoProf();
                }while(opt != '0' && opt != '1' && opt != '2' && opt != '3' && opt != '4' && opt != '5' && opt != '6');
                
                if(opt == '0')
                {
                    break;
                }
                
                if(opt == '1')
                {
                    System.out.println("Novo ID:");
                    idaux = sc.nextLine();
                    professor.SetId(idaux);
                }
                
                if(opt == '2')
                {
                    System.out.println("Novo nome:");
                    Aux = sc.nextLine();
                    professor.SetNome(Aux);
                }
                
                if(opt == '3')
                {
                    System.out.println("Nova data de nascimento:");
                    Aux = sc.nextLine();
                    professor.SetDataDeNasc(Aux);
                }
                
                if(opt == '4')
                {
                    System.out.println("Nova filiação:");
                    Aux = sc.nextLine();
                    professor.SetFiliacao(Aux);
                }
                
                if(opt == '5')
                {
                    System.out.println("Novo telefone:");
                    Aux = sc.nextLine();
                    professor.SetTelefone(Aux);
                }
                
                if(opt == '6')
                {
                    System.out.println("Novo endereço:");
                    Aux = sc.nextLine();
                    professor.SetEndereco(Aux);
                }
                
                break;
            }
        }
    }
    public void DadosProfessor()
    {
        Scanner sc = new Scanner(System.in);
        String id;
        
        id = sc.nextLine();
        
        for(Professor professor : professores)
        {
            if(professor.GetId().equals(id))
            {
                System.out.println("Id: " + professor.GetId());
                System.out.println("Turma: " + professor.GetTurma());
                System.out.println("Nome: " + professor.GetNome());
                System.out.println("Data de Nascimento: " + professor.GetDataDeNasc());
                System.out.println("Filiação: " + professor.GetFiliacao());
                System.out.println("Telefone: " + professor.GetTelefone());
                System.out.println("Endereço: " + professor.GetEndereco());
                break;
            }
        }
    }
    
    //Turma
    public void CadastrarTurma()
    {
        Scanner sc = new Scanner(System.in);
        Professor professor = null;
        String Serie;
        String ID, id;
        String Turno;
        Turma turma;
        
        ID = sc.nextLine();
        Serie = sc.nextLine();
        Turno = sc.nextLine();
        id = sc.nextLine();
        
        for(Professor prof : professores)
        {
            if(prof.GetId().equals(id))
            {
                professor = prof;
                break;
            }
        }
        
        turma = new Turma(ID, Serie,Turno,  professor);
        turmas.add(turma);
        professor.SetTurma(turma);
        
        //Adicionando alunos na turma
        boolean continuar = true;
        do
        {
            continuar = sc.nextBoolean();
            id = sc.nextLine();

            for(Aluno aluno : alunos)
            {
                if(aluno.GetId().equals(id))
                {
                    turma.alunos.add(aluno);
                    break;
                }
            }
        }while(continuar == true);
        
    }
    public void RemoverTurma()
    {
        Scanner sc = new Scanner(System.in);
        String id;
        
        id = sc.nextLine();
        
        for(Turma turma : turmas)
        {
            if(turma.GetId().equals(id))
            {
                turmas.remove(turma);
                break;
            }
        }
    }
    public void EditarTurma()
    {
        Scanner sc = new Scanner(System.in);
        char opt = 'D';
        String id, Aux;
        String turno;
        String Serie;
        
        id = sc.nextLine();
        
        for(Turma turma : turmas)
        {
            if(turma.GetId().equals(id))
            {
                do{
                    System.out.println("------------Editar------------");
                    System.out.println("1-Id");
                    System.out.println("2-Serie");
                    System.out.println("3-Professor");
                    System.out.println("4-Turno");
                    System.out.println("0-Sair");
                    opt = sc.next().charAt(0);
                }while(opt != '0' && opt != '1' && opt != '2' && opt != '3' && opt != '4');
                
                if(opt == '0')
                {
                    break;
                }
                
                if(opt == '1')
                {
                    System.out.println("Novo ID:");
                    Aux = sc.nextLine();
                    turma.SetId(Aux);
                }
                
                if(opt == '2')
                {
                    System.out.println("Nova Série:");
                    Serie = sc.nextLine();
                    turma.SetSerie(Serie);
                }
                
                if(opt == '3')
                {
                    System.out.println("Novo professor:");
                    Aux = sc.nextLine();
                    for(Professor professor : professores)
                    {
                        if(professor.GetId().equals(Aux))
                        {
                            turma.SetProfessor(professor);
                            break;
                        }
                    }
                }
                
                if(opt == '4')
                {
                    System.out.println("Novo Turno:");
                    turno = sc.nextLine();
                    turma.SetTurno(turno);
                }
                
                break;
            }
        }
    }
    public void DadosTurma()
    {
        Scanner sc = new Scanner(System.in);
        int id;
        
        id = sc.nextInt();
        
        for(Turma turma : turmas)
        {
            if(turma.GetId().equals(id))
            {
                System.out.println("Id:" + turma.GetId());
                System.out.println("Serie:" + turma.GetSerie());
                System.out.println("Professor:" + turma.GetProfessor());
                System.out.println("Turno:" + turma.GetTurno());
                break;
            }
        }
    }
    
    //Outros
    private char MenuEditarAlunoProf()
    {
        Scanner sc = new Scanner(System.in);
        char opt = 'D';
        System.out.println("------------Editar------------");
        System.out.println("1-Id");
        System.out.println("2-Nome");
        System.out.println("3-Data de Nascimento");
        System.out.println("4-Responsável");
        System.out.println("5-Telefone");
        System.out.println("6-Endereço");
        System.out.println("0-Sair");
        opt = sc.next().charAt(0);
        return opt;
    }
}
