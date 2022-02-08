package ufjf.dcc025.grupodmj.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;

public class ConfirmaEditaProfessor implements ActionListener 
{
    private Tela tela;
    
    public ConfirmaEditaProfessor(Tela tela)
    {
        this.tela = tela;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        int id = tela.GetProfessores().getSelectedIndex();

        if (id == -1) 
        {
            JOptionPane.showMessageDialog(tela, "ERRO:Selecione um professor para editar");
        } else 
            {
                DefaultListModel<Professor> model = (DefaultListModel<Professor>) tela.GetProfessores().getModel();
                DefaultListModel<Aluno> alunos = (DefaultListModel<Aluno>) tela.GetAlunos().getModel();
                Aluno aluno;
                Aluno Aluno = null;
                Professor prof;
                Professor professor = null;
                
                for(int i = 0; i < alunos.size(); i++)
                {
                    aluno = alunos.getElementAt(i);

                    if(aluno.GetId().equals(tela.GetCadastrarIdProfessor().getText()))
                    {
                        Aluno = aluno;
                    }
                }
                
                for(int i = 0; i < model.size(); i++)
                {
                    prof = model.getElementAt(i);
                    
                    if(prof.GetId().equals(tela.GetCadastrarIdProfessor().getText()) && !prof.GetId().equals(model.getElementAt(id).GetId()))
                    {
                        professor = prof;
                    }
                }
                
                if(Aluno != null || professor != null)
                {
                    JOptionPane.showMessageDialog(tela, "ERRO: id já registrado(Atenção:Alunos e professores não podem compartilhar Id)");
                }else
                    {
                        model.getElementAt(id).SetId(tela.GetCadastrarIdProfessor().getText());
                        model.getElementAt(id).SetNome(tela.GetCadastrarNomeProfessor().getText());
                        model.getElementAt(id).SetSenha(tela.GetCadastrarSenhaProfessor().getText());
                        model.getElementAt(id).SetDataDeNasc(tela.GetCadastrarDataProfessor().getText());
                        model.getElementAt(id).SetFiliacao(tela.GetCadastrarFiliacaoProfessor().getText());
                        model.getElementAt(id).SetTelefone(tela.GetCadastrarTelefoneProfessor().getText());
                        model.getElementAt(id).SetEndereco(tela.GetCadastrarEnderecoProfessor().getText());

                        tela.GetProfessores().setModel(model);

                        tela.repaint();
                        JOptionPane.showMessageDialog(tela, "Edição conluida");
                    }
            }
    }
}
