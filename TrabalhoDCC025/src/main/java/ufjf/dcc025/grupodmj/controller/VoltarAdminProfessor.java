package ufjf.dcc025.grupodmj.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;


public class VoltarAdminProfessor implements ActionListener
{
    private Tela tela;
    int Ntela;
    
    public VoltarAdminProfessor(Tela tela, int Ntela)
    {
        this.tela = tela;
        this.Ntela = Ntela;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(Ntela == 1)
        {
            tela.VisibilidadeTelaCadastrarProfessor();
            tela.TelaAdmin(Login.admin);
            
        }else
            {
                if(Ntela == 2)
                {
                    tela.VisibilidadeTelaRemoverProfessor();
                    tela.TelaAdmin(Login.admin);
                }else
                    {
                        if(Ntela == 3)
                        {
                            tela.VisibilidadeTelaEditarProfessor();
                            tela.TelaAdmin(Login.admin);
                        }
                    }
            }
        
    }
}
