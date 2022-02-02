package ufjf.dcc025.grupodmj.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;


public class VoltarAdminRemoverAluno implements ActionListener
{
    private Tela tela;
    
    public VoltarAdminRemoverAluno(Tela tela)
    {
        this.tela = tela;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        tela.VisibilidadeTelaRemoverAluno();
        tela.TelaAdmin(Login.admin);
    }
}
