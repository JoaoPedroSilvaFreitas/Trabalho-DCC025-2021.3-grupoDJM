package ufjf.dcc025.grupodmj.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;

public class ConfirmaCadastroProfessor implements ActionListener
{
    private Tela tela;
    
    public ConfirmaCadastroProfessor(Tela tela)
    {
        this.tela = tela;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        DefaultListModel<Professor> model = (DefaultListModel<Professor>) tela.GetProfessores().getModel();
        DefaultListModel<Aluno> alunos = (DefaultListModel<Aluno>) tela.GetAlunos().getModel();
        Professor prof;
        Professor professor = null;
        Aluno aluno;
        Aluno Aluno = null;
        
        for(int i = 0; i < model.size(); i++)
        {
            prof = model.getElementAt(i);
            if(prof.GetId().equals(tela.GetCadastrarIdProfessor().getText()))
            {
                professor = prof;
            }
        }
        
        for(int i = 0; i < alunos.size(); i++)
        {
            aluno = alunos.getElementAt(i);
            if(aluno.GetId().equals(tela.GetCadastrarIdProfessor().getText()))
            {
                Aluno = aluno;
            }
        }
        
        if(professor != null || Aluno != null)
        {
            JOptionPane.showMessageDialog(tela, "ERRO: id já registrado(Atenção:Alunos e professores não podem compartilhar Id)");
        }else
            {
                model.addElement(new Professor(tela.GetCadastrarIdProfessor().getText(), tela.GetCadastrarSenhaProfessor().getText(), tela.GetCadastrarNomeProfessor().getText(), tela.GetCadastrarDataProfessor().getText(), tela.GetCadastrarFiliacaoProfessor().getText(), tela.GetCadastrarTelefoneProfessor().getText(), tela.GetCadastrarEnderecoProfessor().getText()));

                tela.GetProfessores().setModel(model);

                tela.repaint();

                JOptionPane.showMessageDialog(tela, "Cadastro Concluido");
            }
    }
}
