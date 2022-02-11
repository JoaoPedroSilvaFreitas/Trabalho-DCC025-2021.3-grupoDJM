package ufjf.dcc025.grupodmj.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;

public class ConfirmaRemoveDisciplina implements ActionListener
{
    private Tela tela;
    private Professor professor;
    
    public ConfirmaRemoveDisciplina(Tela tela, Professor professor)
    {
        this.tela = tela;
        this.professor = professor;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        int id = tela.GetDisciplinas().getSelectedIndex();

        if (id == -1) 
        {
            JOptionPane.showMessageDialog(tela, "ERRO:Selecione uma disciplina para remover");
        } else 
            {
                professor.GetTurma().GetDisciplinas().remove(id);
                JOptionPane.showMessageDialog(tela, "Disciplina Removida");
                tela.repaint();
            }
    }
}