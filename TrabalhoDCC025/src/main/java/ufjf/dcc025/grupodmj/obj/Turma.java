package ufjf.dcc025.grupodmj.obj;

import java.util.*;
import java.util.Scanner;

public class Turma 
{
    //Atributos
    List<Disciplina> disciplinas = new ArrayList<>();
    List<Aluno> alunos = new ArrayList<>();
    String id, Titulo, Horario; //PROVAVELMENTE PRECISAREI ALTERAR NO FUTURO
    Professor professor;
    int Serie;
    Boolean Turno;
    
    //Construtor
    Turma(String id, int Serie, Professor professor, Boolean Turno)
    {
        this.id = id;
        this.Serie = Serie;
        this.Turno = Turno;
        this.professor = professor;
    }
    
    //Adiciona alunos na turma
    void AddAluno(Aluno aluno)
    {
        alunos.add(aluno);
    }
    
    //Adiciona disciplinas na turma
    void AddDisciplina(Disciplina disciplina)
    {
        disciplinas.add(disciplina);
    }
    
    //retorna aluno da turma
    Aluno GetAluno(String Id)
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
    
    //Edita Professor da turma
    void SetProfessor(Professor professor)
    {
        this.professor = professor;
    }
    
    //Setters
    void SetId(String id)
    {
        this.id = id;
    }
    
    void SetSerie(int Serie)
    {
        this.Serie = Serie;
    }
    
    void SetTurno(Boolean Turno)
    {
        this.Turno = Turno;
    }
    
    void SetHorario(String Horario)
    {
        this.Horario = Horario;
    }
    
    //Getters
    String GetId()
    {
        return this.id;
    }
    
    int GetSerie()
    {
        return this.Serie;
    }
    
    Professor GetProfessor()
    {
        return this.professor;
    }
    
    String GetTurno()
    {
        if(Turno == true)
        {
            return "Matutino";
        }
        else
            {
                return "Vespertino";
            } 
    }
    
    String GetHorario()
    {
        return this.Horario;
    }
    
}
