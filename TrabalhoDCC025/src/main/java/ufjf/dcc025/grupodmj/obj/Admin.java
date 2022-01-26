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
        Scanner sc = new Scanner(System.in);
        int ID;
        String Senha, Nome, DataDeNasc, Filiacao, Telefone, Endereco, Turma;
        Aluno aluno;
        
        Nome = sc.nextLine();
        DataDeNasc = sc.nextLine();
        
    }
    void RemoverAluno()
    {
        
    }
    void EditarAluno()
    {
        
    }
    void DadosAluno()
    {
        
    }
    
    //Professor
    void CadastrarProfessor()
    {
        
    }
    void RemoverProfessor()
    {
        
    }
    void EditarProfessor()
    {
        
    }
    void DadosProfessor()
    {
        
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
}
