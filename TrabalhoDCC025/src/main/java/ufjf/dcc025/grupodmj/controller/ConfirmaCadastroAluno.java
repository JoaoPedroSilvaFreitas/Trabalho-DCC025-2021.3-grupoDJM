package ufjf.dcc025.grupodmj.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;

public class ConfirmaCadastroAluno implements ActionListener
{
    private Tela tela;
    
    public ConfirmaCadastroAluno(Tela tela)
    {
        this.tela = tela;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        DefaultListModel<Aluno> model = (DefaultListModel<Aluno>) tela.GetAlunos().getModel();
        
        model.addElement(new Aluno(tela.GetCadastrarIdAluno().getText(), tela.GetCadastrarSenhaAluno().getText(), tela.GetCadastrarNomeAluno().getText(), tela.GetCadastrarDataAluno().getText(), tela.GetCadastrarFiliacaoAluno().getText(), tela.GetCadastrarTelefoneAluno().getText(), tela.GetCadastrarEnderecoAluno().getText()));
        
        tela.GetAlunos().setModel(model);
        
        tela.repaint();
        
        JOptionPane.showMessageDialog(tela, "Cadastro Concluido");
        //Adicionar aqui um Tratamento de excessão caso ocorro um erro de cadastro e exibir mensagem na tela
    }
}
