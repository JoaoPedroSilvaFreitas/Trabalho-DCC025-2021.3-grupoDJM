package ufjf.dcc025.grupodmj.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;

public class EditarDisciplina implements ActionListener
{
    private Tela tela;
    private Professor professor;
    
    public EditarDisciplina(Tela tela, Professor professor)
    {
        this.tela = tela;
        this.professor = professor;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        tela.TelaProfessorEditarDisciplina(professor);
    }
}
