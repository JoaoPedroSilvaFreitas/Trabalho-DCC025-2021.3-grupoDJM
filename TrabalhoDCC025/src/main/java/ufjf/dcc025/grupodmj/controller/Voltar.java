package ufjf.dcc025.grupodmj.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ufjf.dcc025.grupodmj.view.*;
import ufjf.dcc025.grupodmj.obj.*;

public class Voltar implements ActionListener
{
    private Tela tela;
    int TelaId;
    
    public Voltar(Tela tela, int TelaId)
    {
        this.tela = tela;
        this.TelaId = TelaId;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(TelaId == 1)
        {
            tela.VisibilidadeTelaCadastrarProfessor();
            tela.TelaAdmin(Login.admin);
        }else
            {
                if(TelaId == 2)
                {
                    tela.VisibilidadeTelaRemoverProfessor();
                    tela.TelaAdmin(Login.admin);
                }else
                    {
                        if(TelaId == 3)
                        {
                            tela.VisibilidadeTelaEditarProfessor();
                            tela.TelaAdmin(Login.admin);
                        }else
                            {
                                if(TelaId == 4)
                                {
                                    tela.VisibilidadeTelaCadastrarAluno();
                                    tela.TelaAdmin(Login.admin);
                                }else
                                    {
                                        if(TelaId == 5)
                                        {
                                            tela.VisibilidadeTelaEditarAluno();
                                            tela.TelaAdmin(Login.admin);
                                        }else
                                            {
                                                if(TelaId == 6)
                                                {
                                                    tela.VisibilidadeTelaRemoverAluno();
                                                    tela.TelaAdmin(Login.admin);
                                                }else
                                                    {
                                                        if(TelaId == 7)
                                                        {
                                                            tela.VisibilidadeTelaCadastrarTurma();
                                                            tela.TelaAdmin(Login.admin);
                                                        }else
                                                            {
                                                                if(TelaId == 8)
                                                                {
                                                                    tela.VisibilidadeTelaRemoverTurma();
                                                                    tela.TelaAdmin(Login.admin);
                                                                }
                                                                else
                                                                    {
                                                                        if(TelaId == 9)
                                                                        {
                                                                            tela.VisibilidadeTelaAddAlunoTurma();
                                                                            tela.TelaAdminCadastrarTurma();
                                                                        }else
                                                                            {
                                                                                if(TelaId == 10)
                                                                                {
                                                                                    tela.VisibilidadeTelaEditarTurma();
                                                                                    tela.TelaAdmin(Login.admin);
                                                                                }else
                                                                                    {
                                                                                        if(TelaId == 11)
                                                                                        {
                                                                                            tela.VisibilidadeTelaAlteraSenha();
                                                                                            tela.TelaProfessor(Login.professor);
                                                                                        }else
                                                                                            {
                                                                                                if(TelaId == 12)
                                                                                                {
                                                                                                    tela.VisibilidadeTelaAlteraSenha();
                                                                                                    tela.TelaAluno(Login.aluno);
                                                                                                }else
                                                                                                    {
                                                                                                        if(TelaId == 13)
                                                                                                        {
                                                                                                            tela.VisibilidadeTelaMinhaTurma();
                                                                                                            tela.TelaProfessor(Login.professor);
                                                                                                        }else
                                                                                                            {
                                                                                                                if(TelaId == 14)
                                                                                                                {
                                                                                                                    tela.VisibilidadeTelaCadastrarDisciplina();
                                                                                                                    tela.TelaProfessor(Login.professor);
                                                                                                                }else
                                                                                                                    {
                                                                                                                        if(TelaId == 15)
                                                                                                                        {
                                                                                                                            tela.VisibilidadeTelaRemoverDisciplina();
                                                                                                                            tela.TelaProfessor(Login.professor);
                                                                                                                        }else
                                                                                                                            {
                                                                                                                                if(TelaId == 16)
                                                                                                                                {
                                                                                                                                    tela.VisibilidadeTelaEditarDisciplina();
                                                                                                                                    tela.TelaProfessor(Login.professor);
                                                                                                                                }
                                                                                                                            }
                                                                                                                    }
                                                                                                            }
                                                                                                    }
                                                                                            }
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
    }
}
