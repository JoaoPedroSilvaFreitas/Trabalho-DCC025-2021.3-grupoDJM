package ufjf.dcc025.grupodmj.controller;

import javax.swing.event.ListSelectionListener;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;

public class InfoListaProfessor implements ListSelectionListener
{
    private Tela tela;

    public InfoListaProfessor(Tela tela) 
    {
        this.tela = tela;
    }
    
    public void valueChanged(ListSelectionEvent e) 
    {
    
        int id = tela.GetProfessores().getSelectedIndex();
        
        if(id != -1)
        {
            Professor professor = tela.GetProfessores().getModel().getElementAt(id);
            
            tela.GetCadastrarIdProfessor().setText(professor.GetId());
            tela.GetCadastrarNomeProfessor().setText(professor.GetNome());
            tela.GetCadastrarDataProfessor().setText(professor.GetDataDeNasc());
            tela.GetCadastrarFiliacaoProfessor().setText(professor.GetFiliacao());
            tela.GetCadastrarTelefoneProfessor().setText(professor.GetTelefone());
            tela.GetCadastrarEnderecoProfessor().setText(professor.GetEndereco());
            
            tela.SetLastId(id);
            
        }
    }
}
