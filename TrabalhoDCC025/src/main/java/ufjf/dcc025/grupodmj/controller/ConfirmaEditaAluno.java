package ufjf.dcc025.grupodmj.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;

public class ConfirmaEditaAluno implements ActionListener 
{
     private Tela tela;
    
    public ConfirmaEditaAluno(Tela tela)
    {
        this.tela = tela;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        int id = tela.GetAlunos().getSelectedIndex();

        if (id == -1) 
        {
            JOptionPane.showMessageDialog(tela, "ERRO:Selecione um aluno para editar");
        } else 
            {
                DefaultListModel<Aluno> model = (DefaultListModel<Aluno>) tela.GetAlunos().getModel();
                model.getElementAt(id).SetId(tela.GetCadastrarIdAluno().getText());
                model.getElementAt(id).SetNome(tela.GetCadastrarNomeAluno().getText());
                model.getElementAt(id).SetSenha(tela.GetCadastrarSenhaAluno().getText());
                model.getElementAt(id).SetDataDeNasc(tela.GetCadastrarDataAluno().getText());
                model.getElementAt(id).SetFiliacao(tela.GetCadastrarFiliacaoAluno().getText());
                model.getElementAt(id).SetTelefone(tela.GetCadastrarTelefoneAluno().getText());
                model.getElementAt(id).SetEndereco(tela.GetCadastrarEnderecoAluno().getText());
                
                tela.GetAlunos().setModel(model);
        
                tela.repaint();
                JOptionPane.showMessageDialog(tela, "Edição conluida");
            }
    }
}
