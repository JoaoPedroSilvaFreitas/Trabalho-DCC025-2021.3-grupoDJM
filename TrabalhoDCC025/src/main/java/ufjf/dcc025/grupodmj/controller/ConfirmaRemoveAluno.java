package ufjf.dcc025.grupodmj.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;

public class ConfirmaRemoveAluno implements ActionListener
{
    private Tela tela;
    
    public ConfirmaRemoveAluno(Tela tela)
    {
        this.tela = tela;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        int id = tela.GetAlunos().getSelectedIndex();

        if (id == -1) 
        {
            JOptionPane.showMessageDialog(tela, "ERRO:Selecione um aluno para ser removido");
        } else 
            {
                DefaultListModel<Aluno> modelo = (DefaultListModel<Aluno>) tela.GetAlunos().getModel();
                modelo.removeElementAt(id);
                tela.GetAlunos().setModel(modelo);
                tela.repaint();
            }
    }
}
