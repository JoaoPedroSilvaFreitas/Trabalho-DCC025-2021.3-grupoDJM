package ufjf.dcc025.grupodmj.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;

public class Mural implements ActionListener
{
    private Tela tela;
    private Professor professor;
    private Aluno aluno;
    private int id;
    
    public Mural(Tela tela, Professor professor, int id)
    {
        this.tela = tela;
        this.professor = professor;
        this.id = id;
    }
    
    public Mural(Tela tela, Aluno aluno, int id)
    {
        this.tela = tela;
        this.aluno = aluno;
        this.id = id;
    }
    
    public void actionPerformed(ActionEvent e)
    {

        if(id == 0)
        {
            tela.TelaMural(professor);
        }
        
        if(id == 1)
        {
            tela.TelaMural(aluno);
        }
        
        
    }
}
