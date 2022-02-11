package ufjf.dcc025.grupodmj.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;

public class RemoverAlunoTurma implements ActionListener
{
    private Tela tela;
    private Professor professor;
    
    public RemoverAlunoTurma(Tela tela, Professor professor)
    {
        this.tela = tela;
        this.professor = professor;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        int id = tela.GetAlunosTurma().getSelectedIndex();

        if (id == -1) 
        {
            JOptionPane.showMessageDialog(tela, "ERRO:Selecione um aluno para ser removido");
        } else 
            {
                //tela.GetAlunosTurma().remove(id);
                professor.GetTurma().GetAlunos().remove(id);
                JOptionPane.showMessageDialog(tela, "Aluno removido");
                tela.repaint();
            }
        
    }
}
