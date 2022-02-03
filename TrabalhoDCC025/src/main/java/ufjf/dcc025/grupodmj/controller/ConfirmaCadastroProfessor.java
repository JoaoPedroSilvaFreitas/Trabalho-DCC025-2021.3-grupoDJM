package ufjf.dcc025.grupodmj.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;

public class ConfirmaCadastroProfessor implements ActionListener
{
    private Tela tela;
    
    public ConfirmaCadastroProfessor(Tela tela)
    {
        this.tela = tela;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        DefaultListModel<Professor> model = (DefaultListModel<Professor>) tela.GetProfessores().getModel();
        
        model.addElement(new Professor(tela.GetCadastrarIdProfessor().getText(), tela.GetCadastrarSenhaProfessor().getText(), tela.GetCadastrarNomeProfessor().getText(), tela.GetCadastrarDataProfessor().getText(), tela.GetCadastrarFiliacaoProfessor().getText(), tela.GetCadastrarTelefoneProfessor().getText(), tela.GetCadastrarEnderecoProfessor().getText()));
        
        tela.GetProfessores().setModel(model);
        
        tela.repaint();
        
        JOptionPane.showMessageDialog(tela, "Cadastro Concluido");
        //Adicionar aqui um Tratamento de excessão caso ocorra um erro de cadastro e exibir mensagem na tela
    }
}
