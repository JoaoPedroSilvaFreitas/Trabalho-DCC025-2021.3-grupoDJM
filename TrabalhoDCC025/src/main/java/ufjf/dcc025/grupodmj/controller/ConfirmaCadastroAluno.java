package ufjf.dcc025.grupodmj.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;

public class ConfirmaCadastroAluno implements ActionListener
{
    private Tela tela;
    
    public ConfirmaCadastroAluno(Tela tela)
    {
        this.tela = tela;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        DefaultListModel<Aluno> model = (DefaultListModel<Aluno>) tela.GetAlunos().getModel();
        DefaultListModel<Professor> professores = (DefaultListModel<Professor>) tela.GetProfessores().getModel();
        Aluno aluno;
        Aluno Aluno = null;
        Professor prof;
        Professor professor = null;
        
        
        for(int i = 0; i < model.size(); i++)
        {
            aluno = model.getElementAt(i);
            if(aluno.GetId().equals(tela.GetCadastrarIdAluno().getText()))
            {
                Aluno = aluno;
            }
        }
        
        for(int i = 0; i < professores.size(); i++)
        {
            prof = professores.getElementAt(i);
            if(prof.GetId().equals(tela.GetCadastrarIdAluno().getText()))
            {
                professor = prof;
            }
        }
        
        if(Aluno != null || professor != null)
        {
            JOptionPane.showMessageDialog(tela, "ERRO: id já registrado(Atenção:Alunos e professores não podem compartilhar Id)");
        }else
            {
                model.addElement(new Aluno(tela.GetCadastrarIdAluno().getText(), tela.GetCadastrarSenhaAluno().getText(), tela.GetCadastrarNomeAluno().getText(), tela.GetCadastrarDataAluno().getText(), tela.GetCadastrarFiliacaoAluno().getText(), tela.GetCadastrarTelefoneAluno().getText(), tela.GetCadastrarEnderecoAluno().getText()));

                tela.GetAlunos().setModel(model);

                tela.repaint();

                JOptionPane.showMessageDialog(tela, "Cadastro Concluido");
            }
    }
}
