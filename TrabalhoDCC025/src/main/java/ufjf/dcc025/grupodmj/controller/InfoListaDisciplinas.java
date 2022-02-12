package ufjf.dcc025.grupodmj.controller;

import javax.swing.event.ListSelectionListener;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;

public class InfoListaDisciplinas implements ListSelectionListener
{
    private Tela tela;
    private Professor professor;
    private Aluno aluno;
    private int i;

    public InfoListaDisciplinas(Tela tela, Professor professor, int i) 
    {
        this.tela = tela;
        this.professor = professor;
        this.i = i;
    }
    
    public InfoListaDisciplinas(Tela tela, Aluno aluno, int i) 
    {
        this.tela = tela;
        this.aluno = aluno;
        this.i = i;
    }
    
    public void valueChanged(ListSelectionEvent e) 
    {
    
        int id = tela.GetDisciplinas().getSelectedIndex();
        
        if(id != -1)
        {
            if(i == 0)
            {
                Disciplina disciplina = tela.GetDisciplinas().getModel().getElementAt(id);
                tela.GetConteudoMural().setText(disciplina.GetMural());
                tela.SetLastId(id);
            }
            
            if(i == 1)
            {
                Disciplina disciplina = tela.GetDisciplinas().getModel().getElementAt(id);
                tela.GetMuralAluno().setText(disciplina.GetMural());
                tela.SetLastId(id);
            }
        }
            
    }
}