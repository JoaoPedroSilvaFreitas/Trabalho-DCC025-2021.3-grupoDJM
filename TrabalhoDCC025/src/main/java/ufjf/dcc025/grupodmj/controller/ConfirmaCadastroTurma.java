package ufjf.dcc025.grupodmj.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;

public class ConfirmaCadastroTurma implements ActionListener
{
    private Tela tela;
    
    public ConfirmaCadastroTurma(Tela tela)
    {
        this.tela = tela;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        DefaultListModel<Turma> model = (DefaultListModel<Turma>) tela.GetTurmas().getModel();
        DefaultListModel<Professor> professores = (DefaultListModel<Professor>) tela.GetProfessores().getModel();
        Professor prof;
        Professor professor = null;
        
        Turma turma;
        Turma Turma = null;
        
        for(int i = 0; i < model.size(); i++)
        {
            turma = model.getElementAt(i);
            
            if(turma.GetId().equals(tela.GetCadastrarIdTurma().getText()))
            {
                Turma = turma;
            }
        }
        
        for(int i = 0; i < professores.size(); i++)
        {
            prof = professores.getElementAt(i);
            
            if(prof.GetId().equals(tela.GetCadastrarProfessorTurma().getText()))
            {
                professor = prof;
            }
        }
        
        
        if(Turma != null)
        {
            JOptionPane.showMessageDialog(tela, "ERRO: Id já registrado");
        }else
            {
                if(professor == null)
                {
                    JOptionPane.showMessageDialog(tela, "ERRO: professor inexistente");
                }else
                    {
                        model.addElement(new Turma(tela.GetCadastrarIdTurma().getText(), tela.GetCadastrarSerieTurma().getText(), tela.GetCadastrarTurnoTurma().getText(), professor));

                        tela.GetTurmas().setModel(model);

                        tela.repaint();

                        JOptionPane.showMessageDialog(tela, "Cadastro Concluido");
                    }
            }
        

    }
}
