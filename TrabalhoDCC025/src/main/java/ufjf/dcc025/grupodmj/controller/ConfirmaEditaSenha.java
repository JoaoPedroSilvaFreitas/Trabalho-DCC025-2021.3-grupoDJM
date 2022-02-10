package ufjf.dcc025.grupodmj.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;

public class ConfirmaEditaSenha implements ActionListener 
{
    private Aluno aluno;
    private Professor professor;
    private Tela tela;
    boolean AouP;
    
    public ConfirmaEditaSenha(Tela tela, Professor professor)
    {
        this.tela = tela;
        this.professor = professor;
        AouP = true;
    }
    
    public ConfirmaEditaSenha(Tela tela, Aluno aluno)
    {
        this.tela = tela;
        this.aluno = aluno;
        AouP = false;
    }
    
    public void actionPerformed(ActionEvent e) 
    {
        if(AouP == true)
        {
            professor.SetSenha(tela.GetEditaSenha().getText());
            JOptionPane.showMessageDialog(tela, "Senha Alterada");
        }
        if(AouP == false)
        {
            aluno.SetSenha(tela.GetEditaSenha().getText());
            JOptionPane.showMessageDialog(tela, "Senha Alterada");
        }
    }
    
}