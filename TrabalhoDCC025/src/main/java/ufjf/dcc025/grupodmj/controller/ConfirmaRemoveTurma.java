package ufjf.dcc025.grupodmj.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;

public class ConfirmaRemoveTurma implements ActionListener
{
    private Tela tela;
    
    public ConfirmaRemoveTurma(Tela tela)
    {
        this.tela = tela;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        int id = tela.GetTurmas().getSelectedIndex();

        if (id == -1) 
        {
            JOptionPane.showMessageDialog(tela, "ERRO:Selecione uma turma para ser removida");
        } else 
            {
                DefaultListModel<Turma> modelo = (DefaultListModel<Turma>) tela.GetTurmas().getModel();
                modelo.removeElementAt(id);
                tela.GetTurmas().setModel(modelo);
                tela.repaint();
            }
    }
}
