package ufjf.dcc025.grupodmj.controller;

import javax.swing.event.ListSelectionListener;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;

public class InfoListaAlunosTurma implements ListSelectionListener
{
    private Tela tela;
    private Professor professor;

    public InfoListaAlunosTurma(Tela tela, Professor professor) 
    {
        this.tela = tela;
        this.professor = professor;
    }
    
    public void valueChanged(ListSelectionEvent e) 
    {
    
        int id = tela.GetAlunosTurma().getSelectedIndex();
        
        if(id != -1)
        {
            Aluno aluno = tela.GetAlunosTurma().getModel().getElementAt(id);
            
            tela.GetNomeAluno().setText(aluno.GetNome());
            
            tela.SetLastId(id);
        }
    }
}
