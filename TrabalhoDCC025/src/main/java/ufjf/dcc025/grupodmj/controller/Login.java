package ufjf.dcc025.grupodmj.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;


public class Login implements ActionListener
{
    private Tela tela;
    public static Admin admin;
    public static Professor professor;
    public static Aluno aluno;
    
    public Login(Tela tela)
    {
        this.tela = tela;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        DefaultListModel<Professor> modelProfessor = (DefaultListModel<Professor>) tela.GetProfessores().getModel();
        DefaultListModel<Aluno> modelAluno = (DefaultListModel<Aluno>) tela.GetAlunos().getModel();
        boolean login = false;
        
        if(tela.GetUsuario().getText().equals("Admin") && tela.GetSenha().getText().equals("Admin"))
        {
            admin = new Admin();
            tela.TelaAdmin(admin);
            login = true;
        }
        
        for(int i = 0; i < modelProfessor.size(); i++)
        {
            if(tela.GetUsuario().getText().equals(modelProfessor.getElementAt(i).GetId()) && tela.GetSenha().getText().equals(modelProfessor.getElementAt(i).GetSenha()))
            {
                professor = modelProfessor.getElementAt(i);
                tela.TelaProfessor(professor);
                login = true;
            }
        }
        
        for(int i = 0; i < modelAluno.size(); i++)
        {
            if(tela.GetUsuario().getText().equals(modelAluno.getElementAt(i).GetId()) && tela.GetSenha().getText().equals(modelAluno.getElementAt(i).GetSenha()))
            {
                aluno = modelAluno.getElementAt(i);
                tela.TelaAluno(aluno);
                login = true;
            }
        }
        
        if(login == false)
        {
            JOptionPane.showMessageDialog(tela, "Usuário ou Senha inválidos");
        }
    }
}
