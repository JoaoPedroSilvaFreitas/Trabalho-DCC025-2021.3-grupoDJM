package ufjf.dcc025.grupodmj.controller.util;

import ufjf.dcc025.grupodmj.obj.*;
import com.google.gson.Gson;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class JSON 
{
    //Objetos
    public static String AlunoToJSON(Aluno aluno)
    {
        Gson gson = new Gson();
        String json = gson.toJson(aluno);
        return json;
    }
    
    public static String ProfessorToJSON(Professor professor)
    {
        Gson gson = new Gson();
        String json = gson.toJson(professor);
        return json;
    }
    
    public static String TurmaToJSON(Turma turma)
    {
        Gson gson = new Gson();
        String json = gson.toJson(turma);
        return json;
    }
    
    public static Aluno JSONtoAluno(String json)
    {
        Gson gson = new Gson();
        Aluno aluno = gson.fromJson(json, Aluno.class);
        return aluno;
    }
    
    public static Professor JSONtoProfessor(String json)
    {
        Gson gson = new Gson();
        Professor professor = gson.fromJson(json, Professor.class);
        return professor;
    }
    
    public static Turma JSONtoTurma(String json)
    {
        Gson gson = new Gson();
        Turma turma = gson.fromJson(json, Turma.class);
        return turma;
    }
    
    
    //Listas
    public static String AlunosToJSON(List<Aluno> alunos)
    {
        Gson gson = new Gson();
        String json = gson.toJson(alunos);
        return json;
    }
    
    public static String ProfessoresToJSON(List<Professor> professores)
    {
        Gson gson = new Gson();
        String json = gson.toJson(professores);
        return json;
    }
    
    public static String TurmasToJSON(List<Turma> turmas)
    {
        Gson gson = new Gson();
        String json = gson.toJson(turmas);
        return json;
    }
    
    public static List<Aluno> toAlunos(String json)
    {
        Gson gson = new Gson();
        Type alunosTipo = new TypeToken<ArrayList<Aluno>>(){}.getType();
        List<Aluno> alunos = gson.fromJson(json, alunosTipo);
        return alunos;
    }
    
    public static List<Professor> toProfessores(String json)
    {
        Gson gson = new Gson();
        Type professoresTipo = new TypeToken<ArrayList<Professor>>(){}.getType();
        List<Professor> professores = gson.fromJson(json, professoresTipo);
        return professores;
    }
    
    public static List<Turma> toTurmas(String json)
    {
        Gson gson = new Gson();
        Type turmasTipo = new TypeToken<ArrayList<Turma>>(){}.getType();
        List<Turma> turmas = gson.fromJson(json, turmasTipo);
        return turmas;
    }
    
}
