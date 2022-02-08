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
                DefaultListModel<Professor> professores = (DefaultListModel<Professor>) tela.GetProfessores().getModel();
                Aluno aluno;
                Aluno Aluno = null;
                Professor prof;
                Professor professor = null;
                
                for(int i = 0; i < professores.size(); i++)
                {
                    prof = professores.getElementAt(i);

                    if(prof.GetId().equals(tela.GetCadastrarIdAluno().getText()))
                    {
                        professor = prof;
                    }
                }
                
                for(int i = 0; i < model.size(); i++)
                {
                    aluno = model.getElementAt(i);
                    
                    if(aluno.GetId().equals(tela.GetCadastrarIdAluno().getText()) && !aluno.GetId().equals(model.getElementAt(id).GetId()))
                    {
                        Aluno = aluno;
                    }
                }
                
                
                if(Aluno != null || professor != null)
                {
                    JOptionPane.showMessageDialog(tela, "ERRO: id já registrado(Atenção:Alunos e professores não podem compartilhar Id)");
                }else
                    {
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
}
