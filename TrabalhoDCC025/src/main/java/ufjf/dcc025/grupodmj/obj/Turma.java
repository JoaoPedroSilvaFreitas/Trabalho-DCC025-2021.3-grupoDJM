package ufjf.dcc025.grupodmj.obj;

import java.util.*;
import java.util.Scanner;

public class Turma 
{
    //Atributos
    List<Disciplina> disciplinas = new ArrayList<>();
    List<Aluno> alunos = new ArrayList<>();
    String id, Serie, Turno;
    Professor professor;
    
    //Construtor
    public Turma(String id, String Serie, String Turno,Professor professor )
    {
        this.id = id;
        this.Serie = Serie;
        this.Turno = Turno;
        this.professor = professor;
    }
    
    //Adiciona alunos na turma
    public void AddAluno(Aluno aluno)
    {
        alunos.add(aluno);
    }
    
    //Adiciona disciplinas na turma
    public void AddDisciplina(Disciplina disciplina)
    {
        disciplinas.add(disciplina);
    }
    
    //retorna aluno da turma
    public Aluno GetAluno(String Id)
    {
        for(Aluno aluno : alunos)
        {
            if(aluno.GetId().equals(Id))
            {
                return aluno;
            }
        }
        return null;
    }
    
    
    public List<Aluno> GetAlunos()
    {
        return this.alunos;
    }
    
    public List<Disciplina> GetDisciplinas()
    {
        return this.disciplinas;
    }
    
    //Edita Professor da turma
    public void SetProfessor(Professor professor)
    {
        this.professor = professor;
    }
    
    //Setters
    public void SetId(String id)
    {
        this.id = id;
    }
    
    public void SetSerie(String Serie)
    {
        this.Serie = Serie;
    }
    
    public void SetTurno(String Turno)
    {
        this.Turno = Turno;
    }
    
    //Getters
    public String GetId()
    {
        return this.id;
    }
    
    public String GetSerie()
    {
        return this.Serie;
    }
    
    public Professor GetProfessor()
    {
        return this.professor;
    }
    
    public String GetTurno()
    {
        return this.Turno;
    }
    
    public String toString()
    {
        return this.id + "  " + this.Serie + "   " + this.Turno + "   " + this.professor.GetNome();
    }
}
