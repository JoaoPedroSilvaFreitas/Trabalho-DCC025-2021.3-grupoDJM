package ufjf.dcc025.grupodmj.controller;

import javax.swing.event.ListSelectionListener;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;


public class InfoListaAluno implements ListSelectionListener
{
    private Tela tela;
    private int ListaId;

    public InfoListaAluno(Tela tela,int ListaId) 
    {
        this.tela = tela;
        this.ListaId = ListaId;
    }
    
    public void valueChanged(ListSelectionEvent e) 
    {
    
        int id = tela.GetAlunos().getSelectedIndex();
        
        if(id != -1)
        {
            if(ListaId == 0)
            {
                Aluno aluno = tela.GetAlunos().getModel().getElementAt(id);
            
                tela.GetCadastrarIdAluno().setText(aluno.GetId());
                tela.GetCadastrarNomeAluno().setText(aluno.GetNome());
                tela.GetCadastrarDataAluno().setText(aluno.GetDataDeNasc());
                tela.GetCadastrarFiliacaoAluno().setText(aluno.GetFiliacao());
                tela.GetCadastrarTelefoneAluno().setText(aluno.GetTelefone());
                tela.GetCadastrarEnderecoAluno().setText(aluno.GetEndereco());
            
                tela.SetLastId(id);
            }
            
            if(ListaId == 1)
            {
                Aluno aluno = tela.GetAlunos().getModel().getElementAt(id);
                tela.GetCadastrarIdAluno().setText(aluno.GetId());
                tela.SetLastId(id);
            }
            
        }
    }
}
