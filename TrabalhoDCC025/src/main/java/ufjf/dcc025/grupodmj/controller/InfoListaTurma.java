package ufjf.dcc025.grupodmj.controller;

import javax.swing.event.ListSelectionListener;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;


public class InfoListaTurma implements ListSelectionListener
{
    private Tela tela;
    private int ListaId;

    public InfoListaTurma(Tela tela, int ListaId) 
    {
        this.tela = tela;
        this.ListaId = ListaId;
    }
    
    public void valueChanged(ListSelectionEvent e) 
    {
    
        int id = tela.GetTurmas().getSelectedIndex();
        
        if(id != -1)
        {
            if(ListaId == 0)
            {
                Turma turma = tela.GetTurmas().getModel().getElementAt(id);
            
                tela.GetCadastrarIdTurma().setText(turma.GetId());
                tela.GetCadastrarSerieTurma().setText(turma.GetSerie());
                tela.GetCadastrarTurnoTurma().setText(turma.GetTurno());
                tela.GetCadastrarProfessorTurma().setText(turma.GetProfessor().GetId());
            
                tela.SetLastId(id);
            }
            
            if(ListaId == 1)
            {
                Turma turma = tela.GetTurmas().getModel().getElementAt(id);
                tela.GetCadastrarIdTurma().setText(turma.GetId());
                
                tela.SetLastId(id);
            }
        }
    }
}
