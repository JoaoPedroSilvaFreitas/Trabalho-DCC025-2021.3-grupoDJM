package ufjf.dcc025.grupodmj.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;

public class CadastrarDisciplina implements ActionListener
{
    private Tela tela;
    private Professor professor;
    
    public CadastrarDisciplina(Tela tela, Professor professor)
    {
        this.tela = tela;
        this.professor = professor;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        tela.TelaProfessorCadastrarDisciplina(professor);
    }
}
    
