package ufjf.dcc025.grupodmj.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;

public class Publicar implements ActionListener
{
    private Tela tela;
    private Professor professor;

    
    public Publicar(Tela tela, Professor professor)
    {
        this.tela = tela;
        this.professor = professor;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        int id = tela.GetDisciplinas().getSelectedIndex();

        if (id == -1) 
        {
            JOptionPane.showMessageDialog(tela, "ERRO:Selecione um mural de disciplina");
        } else
            {
                professor.GetTurma().GetDisciplinas().get(id).SetMural(tela.GetConteudoMural().getText());
            }
        
    }
}