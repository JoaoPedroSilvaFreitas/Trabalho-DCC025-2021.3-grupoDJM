package ufjf.dcc025.grupodmj.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;

public class ConfirmaEditaTurma implements ActionListener
{
    private Tela tela;
    
    public ConfirmaEditaTurma(Tela tela)
    {
        this.tela = tela;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        int id = tela.GetTurmas().getSelectedIndex();

        if (id == -1) 
        {
            JOptionPane.showMessageDialog(tela, "ERRO:Selecione uma turma para editar");
        } else 
            {
                DefaultListModel<Turma> model = (DefaultListModel<Turma>) tela.GetTurmas().getModel();
                DefaultListModel<Professor> professores = (DefaultListModel<Professor>) tela.GetProfessores().getModel();
                Professor prof;
                Professor professor = null;
                Turma turma;
                Turma Turma = null;

                for(int i = 0; i < professores.size(); i++)
                {
                    prof = professores.getElementAt(i);

                    if(prof.GetId().equals(tela.GetCadastrarProfessorTurma().getText()))
                    {
                        professor = prof;
                    }
                }
                
                for(int i = 0; i < model.size(); i++)
                {
                    turma = model.getElementAt(i);
                    
                    if(turma.GetId().equals(tela.GetCadastrarIdTurma().getText()) && !turma.GetId().equals(model.getElementAt(id).GetId()))
                    {
                        Turma = turma;
                    }
                }
                
                if(Turma != null)
                {
                    JOptionPane.showMessageDialog(tela, "ERRO: Id já registrado");
                }else
                    {
                        if(professor == null)
                        {
                            JOptionPane.showMessageDialog(tela, "ERRO: professor inexistente");
                        }else
                            {
                                model.getElementAt(id).SetId(tela.GetCadastrarIdTurma().getText());
                                model.getElementAt(id).SetSerie(tela.GetCadastrarSerieTurma().getText());
                                model.getElementAt(id).SetTurno(tela.GetCadastrarTurnoTurma().getText());
                                model.getElementAt(id).SetProfessor(professor);

                                tela.GetTurmas().setModel(model);

                                tela.repaint();
                                JOptionPane.showMessageDialog(tela, "Edição conluida");
                            }
                    }
                
            }
    }
}
