package ufjf.dcc025.grupodmj.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;


public class Login implements ActionListener
{
    private Tela tela;
    
    public Login(Tela tela)
    {
        this.tela = tela;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(tela.GetUsuario().getText().equals("Admin") && tela.GetSenha().getText().equals("Admin"))
        {
            tela.TelaAdmin();
        }
        
        //Aqui teria um if para ler no "banco de dados" um senha e usuario válido
        
    }
}