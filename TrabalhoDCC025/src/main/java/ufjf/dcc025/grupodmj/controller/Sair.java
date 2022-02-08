package ufjf.dcc025.grupodmj.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;

public class Sair implements ActionListener
{
    private Tela tela;
    private int TelaId;
    
    public Sair(Tela tela, int TelaId)
    {
        this.tela = tela;
        this.TelaId = TelaId;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(TelaId == 1)
        {
            tela.VisibilidadeTelaAdmin();
            tela.TelaPrincipal();
        }else
            {
                if(TelaId == 2)
                {
                   tela.VisibilidadeTelaProfessor();
                    tela.TelaPrincipal(); 
                }
            }
        
    }
}
