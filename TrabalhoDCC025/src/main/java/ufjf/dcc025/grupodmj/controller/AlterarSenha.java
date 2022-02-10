package ufjf.dcc025.grupodmj.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;

public class AlterarSenha implements ActionListener
{
    private Tela tela;
    private Professor professor;
    private Aluno aluno;
    private boolean AouP;
    
    public AlterarSenha(Tela tela, Professor professor)
    {
        this.tela = tela;
        this.professor = professor;
        AouP = true;
    }
    
    public AlterarSenha(Tela tela, Aluno aluno)
    {
        this.tela = tela;
        this.aluno = aluno;
        AouP = false;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(AouP == true)
        {
            tela.TelaAlteraSenha(professor); 
        }
        if(AouP == false)
        {
           tela.TelaAlteraSenha(aluno); 
        }
        
    }
}
