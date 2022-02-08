package ufjf.dcc025.grupodmj.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;

public class ConfirmaAddAlunoTurma implements ActionListener
{
    private Tela tela;
    
    public ConfirmaAddAlunoTurma(Tela tela)
    {
        this.tela = tela;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        int idTurma = tela.GetTurmas().getSelectedIndex();
        int idAluno = tela.GetAlunos().getSelectedIndex();

        if (idTurma == -1 || idAluno == -1) 
        {
            JOptionPane.showMessageDialog(tela, "ERRO:Selecione uma turma e um aluno para adicionar");
        } else 
            {
                DefaultListModel<Turma> modelTurma = (DefaultListModel<Turma>) tela.GetTurmas().getModel();
                DefaultListModel<Aluno> modelAluno = (DefaultListModel<Aluno>) tela.GetAlunos().getModel();
                
                modelTurma.getElementAt(idTurma).AddAluno( modelAluno.getElementAt(idAluno));
                
                tela.GetTurmas().setModel(modelTurma);
                tela.GetAlunos().setModel(modelAluno);
        
                tela.repaint();
                JOptionPane.showMessageDialog(tela, "Adicionando aluno " + modelAluno.getElementAt(idAluno).GetId() + " na turma " + modelTurma.getElementAt(idTurma).GetId());
            }
    }
}
