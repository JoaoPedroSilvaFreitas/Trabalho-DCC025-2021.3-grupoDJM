package ufjf.dcc025.grupodmj.controller;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import ufjf.dcc025.grupodmj.controller.util.*;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;



public class AtualizaDados implements WindowListener
{
    private static final String CAMINHOalunos = "dadosAlunos.json";
    private static final String CAMINHOprofessores = "dadosProfessores.json";
    private static final String CAMINHOturmas = "dadosTurmas.json";
    private Tela tela;

    public AtualizaDados(Tela tela)
    {
        this.tela = tela;
    }
    
    @Override
    public void windowOpened(WindowEvent e) 
    {
        try 
        {
            String alunos = Arquivo.lerArquivo(CAMINHOalunos);
            List<Aluno> Alunos = JSON.toAlunos(alunos);
            
            String professores = Arquivo.lerArquivo(CAMINHOprofessores);
            List<Professor> Professores = JSON.toProfessores(professores);
            
            String turmas = Arquivo.lerArquivo(CAMINHOturmas);
            List<Turma> Turmas = JSON.toTurmas(turmas);

            DefaultListModel<Aluno> modelAlunos = new DefaultListModel<>();
            DefaultListModel<Professor> modelProfessores = new DefaultListModel<>();
            DefaultListModel<Turma> modelTurmas = new DefaultListModel<>();

            for (Aluno aluno : Alunos) 
            {
                modelAlunos.addElement(aluno);
            }
            
            for (Professor professor : Professores) 
            {
                modelProfessores.addElement(professor);
            }
            
            for (Turma turma : Turmas) 
            {
                modelTurmas.addElement(turma);
            }
            
            tela.GetAlunos().setModel(modelAlunos);
            tela.GetProfessores().setModel(modelProfessores);
            tela.GetTurmas().setModel(modelTurmas);
            
            tela.repaint();
            
        }catch (FileNotFoundException ex) 
            {
                JOptionPane.showMessageDialog(tela, "ERRO: Não foi possível carregar os dados");
            }
    }

    @Override
    public void windowClosing(WindowEvent e)
    {
        try 
        {
            ListModel<Aluno> modelAluno = tela.GetAlunos().getModel();
            List<Aluno> alunos = new ArrayList<>();
            
            ListModel<Professor> modelProfessor = tela.GetProfessores().getModel();
            List<Professor> professores = new ArrayList<>();
            
            ListModel<Turma> modelTurma = tela.GetTurmas().getModel();
            List<Turma> turmas = new ArrayList<>();
            
            for (int i = 0; i < modelAluno.getSize(); i++) 
            {
                alunos.add(modelAluno.getElementAt(i));
            }
            
            for (int i = 0; i < modelProfessor.getSize(); i++) 
            {
                professores.add(modelProfessor.getElementAt(i));
            }
            
            for (int i = 0; i < modelTurma.getSize(); i++) 
            {
                turmas.add(modelTurma.getElementAt(i));
            }
            
            String AlunosToJSON = JSON.AlunosToJSON(alunos);
            String ProfessoresToJSON = JSON.ProfessoresToJSON(professores);
            String TurmasToJSON = JSON.TurmasToJSON(turmas);
            
            Arquivo.escreverArquivo(CAMINHOalunos, AlunosToJSON);
            Arquivo.escreverArquivo(CAMINHOprofessores, ProfessoresToJSON);
            Arquivo.escreverArquivo(CAMINHOturmas, TurmasToJSON);
            
        }catch (IOException ex) 
            {
                JOptionPane.showMessageDialog(tela, "ERRO: Não foi possivel salvar os dados");
            }
    }

    @Override
    public void windowClosed(WindowEvent e) 
    {
        
    }

    @Override
    public void windowIconified(WindowEvent e) 
    {

    }

    @Override
    public void windowDeiconified(WindowEvent e) 
    {
        
    }

    @Override
    public void windowActivated(WindowEvent e) 
    {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) 
    {
        
    }
    
}
