package ufjf.dcc025.grupodmj.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;

public class ConfirmaCadastroDisciplina implements ActionListener
{
    private Tela tela;
    private Professor professor;
    
    public ConfirmaCadastroDisciplina(Tela tela,Professor professor)
    {
        this.tela = tela;
        this.professor = professor;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        Disciplina disciplina = null;
        Turma turma = professor.GetTurma();
        
        
        for(Disciplina disc : turma.GetDisciplinas())
        {
            if(disc.GetId().equals(tela.GetCadastrarIdDisciplina().getText()))
            {
                disciplina = disc;
            }
        }
        
        if(disciplina != null)
        {
            JOptionPane.showMessageDialog(tela, "ERRO: id já registrado");
        }else
            {
                turma.GetDisciplinas().add(new Disciplina(tela.GetCadastrarIdDisciplina().getText(), tela.GetCadastrarNomeDisciplina().getText()));
                tela.repaint();

                JOptionPane.showMessageDialog(tela, "Cadastro Concluido");
            }

    }
}
