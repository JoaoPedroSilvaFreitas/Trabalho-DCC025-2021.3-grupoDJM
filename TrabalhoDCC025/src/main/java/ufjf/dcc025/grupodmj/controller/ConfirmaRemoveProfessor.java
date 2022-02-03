package ufjf.dcc025.grupodmj.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;

public class ConfirmaRemoveProfessor implements ActionListener
{
    private Tela tela;
    
    public ConfirmaRemoveProfessor(Tela tela)
    {
        this.tela = tela;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        int id = tela.GetProfessores().getSelectedIndex();

        if (id == -1) 
        {
            JOptionPane.showMessageDialog(tela, "ERRO:Selecione um professor para ser removido");
        } else 
            {
                DefaultListModel<Professor> modelo = (DefaultListModel<Professor>) tela.GetProfessores().getModel();
                modelo.removeElementAt(id);
                tela.GetProfessores().setModel(modelo);
                tela.repaint();
            }
    }
}
