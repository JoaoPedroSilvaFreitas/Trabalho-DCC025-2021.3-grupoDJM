package ufjf.dcc025.grupodmj.controller;

import javax.swing.event.ListSelectionListener;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;

public class InfoListaDisciplina implements ListSelectionListener
{
    private Tela tela;
    private Professor professor;

    public InfoListaDisciplina(Tela tela, Professor professor) 
    {
        this.tela = tela;
        this.professor = professor;
    }
    
    public void valueChanged(ListSelectionEvent e) 
    {
    
        int id = tela.GetDisciplinas().getSelectedIndex();
        
        if(id != -1)
        {
            Disciplina disciplina = tela.GetDisciplinas().getModel().getElementAt(id);
            
            tela.GetCadastrarIdDisciplina().setText(disciplina.GetId());
            tela.GetCadastrarNomeDisciplina().setText(disciplina.GetNome());
            
            tela.SetLastId(id);
        }
    }
}
