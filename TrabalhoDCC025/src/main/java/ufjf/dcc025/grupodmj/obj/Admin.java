package ufjf.dcc025.grupodmj.obj;

import java.util.Scanner;
import java.util.*;

public class Admin extends Usuario
{   
    List<Aluno> alunos = new ArrayList<>();
    List<Professor> professores = new ArrayList<>();
    
    Admin()
    {
        this.Usuario = "Admin";
        this.Senha = "Admin";
    }
    
    //Aluno
    void CadastrarAluno()
    {
        String senha, Nome, DataDeNasc, Filiacao, Telefone, Endereco, Turma, CPF;
        Scanner sc = new Scanner(System.in);
        Aluno aluno;
        int ID;
        
        ID = sc.nextInt();
        Nome = sc.nextLine();
        senha = sc.nextLine();
        CPF = sc.nextLine();
        DataDeNasc = sc.nextLine();
        Filiacao = sc.nextLine();
        Telefone = sc.nextLine();
        Endereco = sc.nextLine();
        Turma = sc.nextLine();
        
        aluno = new Aluno(ID, CPF, senha, Nome, DataDeNasc, Filiacao, Telefone, Endereco, Turma);
        alunos.add(aluno);
    }
    void RemoverAluno()
    {
        Scanner sc = new Scanner(System.in);
        int id;
        
        id = sc.nextInt();
        
        for(Aluno aluno : alunos)
        {
            if(aluno.GetId() == id)
            {
                alunos.remove(aluno);
                break;
            }
        }
    }
    void EditarAluno()
    {
        Scanner sc = new Scanner(System.in);
        String Aux;
        char opt = 'D';
        int id, idaux;
        
        id = sc.nextInt();
        
        for(Aluno aluno : alunos)
        {
            if(aluno.GetId() == id)
            {
                do{
                    opt = MenuEditar();
                }while(opt != '0' && opt != '1' && opt != '2' && opt != '3' && opt != '4' && opt != '5' && opt != '6' && opt != '7' && opt != '8');
                
                if(opt == '0')
                {
                    break;
                }
                
                if(opt == '1')
                {
                    System.out.println("Novo ID:");
                    idaux = sc.nextInt();
                    aluno.SetId(idaux);
                }
                
                if(opt == '2')
                {
                    System.out.println("Nova turma:");
                    Aux = sc.nextLine();
                    aluno.SetTurma(Aux);
                }
                
                if(opt == '3')
                {
                    System.out.println("Novo nome:");
                    Aux = sc.nextLine();
                    aluno.SetNome(Aux);
                }
                
                if(opt == '4')
                {
                    System.out.println("Novo CPF:");
                    Aux = sc.nextLine();
                    aluno.SetCPF(Aux);
                }
                
                if(opt == '5')
                {
                    System.out.println("Nova data de nascimento:");
                    Aux = sc.nextLine();
                    aluno.SetDataDeNasc(Aux);
                }
                
                if(opt == '6')
                {
                    System.out.println("Novo responsável:");
                    Aux = sc.nextLine();
                    aluno.SetFiliacao(Aux);
                }
                
                if(opt == '7')
                {
                    System.out.println("Novo telefone:");
                    Aux = sc.nextLine();
                    aluno.SetTelefone(Aux);
                }
                
                if(opt == '8')
                {
                    System.out.println("Novo endereço:");
                    Aux = sc.nextLine();
                    aluno.SetEndereco(Aux);
                }
                
                break;
            }
        }
    }
    void DadosAluno()
    {
        Scanner sc = new Scanner(System.in);
        int id;
        
        id = sc.nextInt();
        
        for(Aluno aluno : alunos)
        {
            if(aluno.GetId() == id)
            {
                System.out.println("Id: " + aluno.GetId());
                System.out.println("Turma: " + aluno.GetTurma());
                System.out.println("Nome: " + aluno.GetNome());
                System.out.println("CPF: " + aluno.GetCPF());
                System.out.println("Data de Nascimento: " + aluno.GetDataDeNasc());
                System.out.println("Responsável: " + aluno.GetFiliacao());
                System.out.println("Telefone: " + aluno.GetTelefone());
                System.out.println("Endereço: " + aluno.GetEndereco());
                break;
            }
        }
    }
    
    //Professor
    void CadastrarProfessor()
    {
        String senha, Nome, DataDeNasc, Filiacao, Telefone, Endereco, Turma, CPF;
        Scanner sc = new Scanner(System.in);
        Professor professor;
        int ID;
        
        ID = sc.nextInt();
        Nome = sc.nextLine();
        senha = sc.nextLine();
        CPF = sc.nextLine();
        DataDeNasc = sc.nextLine();
        Filiacao = sc.nextLine();
        Telefone = sc.nextLine();
        Endereco = sc.nextLine();
        Turma = sc.nextLine();
        
        professor = new Professor(ID, CPF, senha, Nome, DataDeNasc, Filiacao, Telefone, Endereco, Turma);
        professores.add(professor);
    }
    void RemoverProfessor()
    {
        Scanner sc = new Scanner(System.in);
        int id;
        
        id = sc.nextInt();
        
        for(Professor professor : professores)
        {
            if(professor.GetId() == id)
            {
                professores.remove(professor);
                break;
            }
        }
    }
    void EditarProfessor()
    {
        Scanner sc = new Scanner(System.in);
        String Aux;
        char opt = 'D';
        int id, idaux;
        
        id = sc.nextInt();
        
        for(Professor professor : professores)
        {
            if(professor.GetId() == id)
            {
                do{
                    opt = MenuEditar();
                }while(opt != '0' && opt != '1' && opt != '2' && opt != '3' && opt != '4' && opt != '5' && opt != '6' && opt != '7' && opt != '8');
                
                if(opt == '0')
                {
                    break;
                }
                
                if(opt == '1')
                {
                    System.out.println("Novo ID:");
                    idaux = sc.nextInt();
                    professor.SetId(idaux);
                }
                
                if(opt == '2')
                {
                    System.out.println("Nova turma:");
                    Aux = sc.nextLine();
                    professor.SetTurma(Aux);
                }
                
                if(opt == '3')
                {
                    System.out.println("Novo nome:");
                    Aux = sc.nextLine();
                    professor.SetNome(Aux);
                }
                
                if(opt == '4')
                {
                    System.out.println("Novo CPF:");
                    Aux = sc.nextLine();
                    professor.SetCPF(Aux);
                }
                
                if(opt == '5')
                {
                    System.out.println("Nova data de nascimento:");
                    Aux = sc.nextLine();
                    professor.SetDataDeNasc(Aux);
                }
                
                if(opt == '6')
                {
                    System.out.println("Nova filiação:");
                    Aux = sc.nextLine();
                    professor.SetFiliacao(Aux);
                }
                
                if(opt == '7')
                {
                    System.out.println("Novo telefone:");
                    Aux = sc.nextLine();
                    professor.SetTelefone(Aux);
                }
                
                if(opt == '8')
                {
                    System.out.println("Novo endereço:");
                    Aux = sc.nextLine();
                    professor.SetEndereco(Aux);
                }
                
                break;
            }
        }
    }
    void DadosProfessor()
    {
        Scanner sc = new Scanner(System.in);
        int id;
        
        id = sc.nextInt();
        
        for(Professor professor : professores)
        {
            if(professor.GetId() == id)
            {
                System.out.println("Id: " + professor.GetId());
                System.out.println("Turma: " + professor.GetTurma());
                System.out.println("Nome: " + professor.GetNome());
                System.out.println("CPF: " + professor.GetCPF());
                System.out.println("Data de Nascimento: " + professor.GetDataDeNasc());
                System.out.println("Filiação: " + professor.GetFiliacao());
                System.out.println("Telefone: " + professor.GetTelefone());
                System.out.println("Endereço: " + professor.GetEndereco());
                break;
            }
        }
    }
    
    //Turma
    void CadastrarTurma()
    {
        
    }
    void RemoverTurma()
    {
        
    }
    void EditarTurma()
    {
        
    }
    void DadosTurma()
    {
        
    }
    
    //Disciplina
    void CadastrarDisciplina()
    {
        
    }
    void RemoverDisciplina()
    {
        
    }
    void EditarDisciplina()
    {
        
    }
    void DadosDisciplina()
    {
        
    }
    
    //Outros
    char MenuEditar()
    {
        Scanner sc = new Scanner(System.in);
        char opt = 'D';
        System.out.println("------------Editar------------");
        System.out.println("1-Id");
        System.out.println("2-Turma");
        System.out.println("3-Nome");
        System.out.println("4-CPF");
        System.out.println("5-Data de Nascimento");
        System.out.println("6-Responsável");
        System.out.println("7-Telefone");
        System.out.println("8-Endereço");
        System.out.println("0-Sair");
        opt = sc.next().charAt(0);
        return opt;
    }
    
    
    
    
}
