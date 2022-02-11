package ufjf.dcc025.grupodmj.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;

public class ConfirmaEditaDisciplina implements ActionListener 
{
    private Tela tela;
    private Professor professor;
    
    public ConfirmaEditaDisciplina(Tela tela, Professor professor)
    {
        this.tela = tela;
        this.professor = professor;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        int id = tela.GetDisciplinas().getSelectedIndex();

        if (id == -1) 
        {
            JOptionPane.showMessageDialog(tela, "ERRO:Selecione uma disciplina para editar");
        } else 
            {
                Disciplina disciplina = null;
                Turma turma = professor.GetTurma();


                for(Disciplina disc : turma.GetDisciplinas())
                {
                    if(disc.GetId().equals(tela.GetCadastrarIdDisciplina().getText()) && !disc.GetId().equals(professor.GetTurma().GetDisciplinas().get(id).GetId()))
                    {
                        disciplina = disc;
                    }
                }

                if(disciplina != null)
                {
                    JOptionPane.showMessageDialog(tela, "ERRO: id já registrado");
                }else
                    {
                        turma.GetDisciplinas().get(id).SetId(tela.GetCadastrarIdDisciplina().getText());
                        turma.GetDisciplinas().get(id).SetNome(tela.GetCadastrarNomeDisciplina().getText());
                        
                        
                        tela.repaint();
                        JOptionPane.showMessageDialog(tela, "Edição conluida");
                    }
            }    
       
    }
}