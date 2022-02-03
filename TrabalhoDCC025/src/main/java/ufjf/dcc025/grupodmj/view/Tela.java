package ufjf.dcc025.grupodmj.view;

import javax.swing.*;
import java.awt.*;
import ufjf.dcc025.grupodmj.obj.*;
import ufjf.dcc025.grupodmj.controller.*;

public class Tela extends JFrame
{
    private JPanel painelPrincipal;
    private JPanel painelAdmin;
    private JPanel painelLogin;
    
    
    private JPanel painelCadastrarAluno;
    private JPanel painelRemoverAluno;
    private JPanel painelEditarAluno;
    private JTextField CadastrarIdAluno;
    private JTextField CadastrarNomeAluno;
    private JTextField CadastrarSenhaAluno;
    private JTextField CadastrarDataAluno;
    private JTextField CadastrarFiliacaoAluno;
    private JTextField CadastrarTelefoneAluno;
    private JTextField CadastrarEnderecoAluno;
    
    private JPanel painelCadastrarProfessor;
    private JPanel painelRemoverProfessor;
    private JPanel painelEditarProfessor;
    private JTextField CadastrarIdProfessor;
    private JTextField CadastrarNomeProfessor;
    private JTextField CadastrarSenhaProfessor;
    private JTextField CadastrarDataProfessor;
    private JTextField CadastrarFiliacaoProfessor;
    private JTextField CadastrarTelefoneProfessor;
    private JTextField CadastrarEnderecoProfessor;
    
    private JPanel painelCadastrarTurma;
    private JPanel painelRemoverTurma;
    private JPanel painelEditarTurma;
    
    
    private JTextField usuario;
    private JPasswordField senha;
    
    private JList<Aluno> Alunos;
    private JList<Professor> Professores;
    private JList<Turma> Turmas;
    
    private int LastId;
    
    Tela()
    {
        super("Sistema de controle escolar");
        DefaultListModel<Aluno> modelAluno = new DefaultListModel<>();
        Alunos = new JList<>(modelAluno);
        DefaultListModel<Professor> modelProfessor = new DefaultListModel<>();
        Professores = new JList<>(modelProfessor);
        DefaultListModel<Turma> modelTurma = new DefaultListModel<>();
        Turmas = new JList<>(modelTurma);
        
    }
    
    public void TelaPrincipal()
    {
        this.setSize(1280,720);
        this.setVisible(true);
        
        this.painelPrincipal = new JPanel();
        this.painelPrincipal.setLayout(new BorderLayout());
        this.painelPrincipal.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));
        
        
        
        TelaLogin();
        
        
        this.add(this.painelPrincipal);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.repaint();
    }
    
    private void TelaLogin()
    {
        JLabel preencheEspaco0 = new JLabel();
        JLabel preencheEspaco1 = new JLabel();
        JLabel preencheEspaco2 = new JLabel();
        JLabel preencheEspaco3 = new JLabel();
        JLabel preencheEspaco4 = new JLabel();
        JLabel preencheEspaco5 = new JLabel();
        JLabel preencheEspaco6 = new JLabel();
        
        this.painelLogin = new JPanel();
        this.painelLogin.setLayout(new BorderLayout());
        this.painelLogin.setLayout(new GridLayout(0, 3));
        this.painelLogin.setPreferredSize(new Dimension(1280, 720));
        
        JLabel loginTitulo = new JLabel("LOGIN", SwingConstants.CENTER);
        loginTitulo.setFont(new Font("Arial", Font.PLAIN, 120));
        this.painelLogin.add(loginTitulo, BorderLayout.NORTH);
        this.painelLogin.add(preencheEspaco0);
        this.painelLogin.add(preencheEspaco1);
        
        JLabel Usuario = new JLabel("Usuario:", SwingConstants.CENTER);
        Usuario.setFont(new Font("Arial", Font.PLAIN, 80));
        usuario = new JTextField(100);
        usuario.setFont(new Font("Arial", Font.PLAIN, 95));
        this.painelLogin.add(Usuario);
        this.painelLogin.add(usuario);
        this.painelLogin.add(preencheEspaco2);
        
        JLabel Senha = new JLabel("Senha:", SwingConstants.CENTER);
        Senha.setFont(new Font("Arial", Font.PLAIN, 80));
        senha = new JPasswordField(100);
        senha.setFont(new Font("Arial", Font.PLAIN, 95));
        this.painelLogin.add(Senha);
        this.painelLogin.add(senha);
        this.painelLogin.add(preencheEspaco3);
        
        this.painelLogin.add(preencheEspaco4);
        
        JButton loginBtn = new JButton("Entrar");
        loginBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        loginBtn.addActionListener(new Login(this));
        this.painelLogin.add(loginBtn);
        this.painelLogin.add(preencheEspaco5);
        this.painelLogin.add(preencheEspaco6);
        
        this.painelPrincipal.add(painelLogin, BorderLayout.CENTER);
    }
    
    //Admin
    public void TelaAdmin(Admin admin)
    {
        painelPrincipal.setVisible(false);
        this.setSize(1280,720);
        this.setVisible(true);
        
        this.painelAdmin = new JPanel();
        this.painelAdmin.setLayout(new BorderLayout());
        this.painelAdmin.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));
        
        TelaAdminAux();
        
        this.add(this.painelAdmin );
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.repaint();
    }
    
    private void TelaAdminAux()
    {
        JLabel preencheEspaco0 = new JLabel();
        JLabel preencheEspaco1 = new JLabel();
        JLabel preencheEspaco2 = new JLabel();
        JLabel preencheEspaco3 = new JLabel();
        JLabel preencheEspaco4 = new JLabel();
        JLabel preencheEspaco5 = new JLabel();
        JLabel preencheEspaco6 = new JLabel();
        JLabel preencheEspaco7 = new JLabel();
        JLabel preencheEspaco8 = new JLabel();
        JLabel preencheEspaco9 = new JLabel();
        JLabel preencheEspaco10 = new JLabel();
        JLabel preencheEspaco11 = new JLabel();
        
        JButton SairBtn;
        SairBtn = new JButton("Sair");
        SairBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        SairBtn.addActionListener(new Sair(this));
        this.painelAdmin.add(SairBtn,BorderLayout.SOUTH);
        
        JLabel adminTitulo = new JLabel("ADMIN", SwingConstants.CENTER);
        adminTitulo.setFont(new Font("Arial", Font.PLAIN, 120));
        this.painelAdmin.add(adminTitulo, BorderLayout.NORTH);
        
        JPanel painelFuncoes;
        painelFuncoes = new JPanel();
        painelFuncoes.setLayout(new GridLayout(0,3));
        //painelFuncoes.setPreferredSize(new Dimension(1280, 720));
        painelFuncoes.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        
        painelFuncoes.add(preencheEspaco0);
        painelFuncoes.add(preencheEspaco1);
        painelFuncoes.add(preencheEspaco2);
        
        //Botões Aluno
        JButton CadastrarAlunoBtn;
        CadastrarAlunoBtn = new JButton("Cadastrar Aluno");
        CadastrarAlunoBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        CadastrarAlunoBtn.addActionListener(new CadastrarAluno(this));
        painelFuncoes.add(CadastrarAlunoBtn);
        
        JButton RemoverAlunoBtn;
        RemoverAlunoBtn = new JButton("Remover Aluno");
        RemoverAlunoBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        RemoverAlunoBtn.addActionListener(new RemoverAluno(this));
        painelFuncoes.add(RemoverAlunoBtn);
        
        JButton EditarAlunoBtn;
        EditarAlunoBtn = new JButton("Editar Aluno");
        EditarAlunoBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        EditarAlunoBtn.addActionListener(new EditarAluno(this));
        painelFuncoes.add(EditarAlunoBtn);
        
        painelFuncoes.add(preencheEspaco3);
        painelFuncoes.add(preencheEspaco4);
        painelFuncoes.add(preencheEspaco5);
        
        //Botões Professor
        JButton CadastrarProfessorBtn;
        CadastrarProfessorBtn = new JButton("Cadastrar Professor");
        CadastrarProfessorBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        CadastrarProfessorBtn.addActionListener(new CadastrarProfessor(this));
        painelFuncoes.add(CadastrarProfessorBtn);
        
        JButton RemoverProfessorBtn;
        RemoverProfessorBtn = new JButton("Remover Professor");
        RemoverProfessorBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        RemoverProfessorBtn.addActionListener(new RemoverProfessor(this));
        painelFuncoes.add(RemoverProfessorBtn);
        
        JButton EditarProfessorBtn;
        EditarProfessorBtn = new JButton("Editar Professor");
        EditarProfessorBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        EditarProfessorBtn.addActionListener(new EditarProfessor(this));
        painelFuncoes.add(EditarProfessorBtn);
        
        painelFuncoes.add(preencheEspaco6);
        painelFuncoes.add(preencheEspaco7);
        painelFuncoes.add(preencheEspaco8);
        
        //Botões Turma
        JButton CadastrarTurmaBtn;
        CadastrarTurmaBtn = new JButton("Cadastrar Turma");
        CadastrarTurmaBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        CadastrarTurmaBtn.addActionListener(new CadastrarTurma(this));
        painelFuncoes.add(CadastrarTurmaBtn);
        
        JButton RemoverTurmaBtn;
        RemoverTurmaBtn = new JButton("Remover Turma");
        RemoverTurmaBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        RemoverTurmaBtn.addActionListener(new RemoverTurma(this));
        painelFuncoes.add(RemoverTurmaBtn);
        
        JButton EditarTurmaBtn;
        EditarTurmaBtn = new JButton("Editar Turma");
        EditarTurmaBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        EditarTurmaBtn.addActionListener(new EditarTurma(this));
        painelFuncoes.add(EditarTurmaBtn);
        
        painelFuncoes.add(preencheEspaco9);
        painelFuncoes.add(preencheEspaco10);
        painelFuncoes.add(preencheEspaco11);
        
        this.painelAdmin.add(painelFuncoes, BorderLayout.CENTER);
    }
    
    
    //Admin -> ALuno
    public void TelaAdminCadastrarAluno()
    {
        VisibilidadeTelaAdmin();
        this.setSize(1280,720);
        this.setVisible(true);
        
        this.painelCadastrarAluno = new JPanel();
        this.painelCadastrarAluno.setLayout(new BorderLayout());
        this.painelCadastrarAluno.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));
        
        TelaAdminCadastrarAlunoAux();
        
        this.add(this.painelCadastrarAluno);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.repaint();
    }
    
    private void TelaAdminCadastrarAlunoAux()
    {
        JLabel Titulo = new JLabel("CADASTRAR ALUNO", SwingConstants.CENTER);
        Titulo.setFont(new Font("Arial", Font.PLAIN, 120));
        this.painelCadastrarAluno.add(Titulo, BorderLayout.NORTH);
        
        JButton VoltarBtn;
        VoltarBtn = new JButton("Voltar");
        VoltarBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        VoltarBtn.addActionListener(new VoltarAdminCadastraAluno(this));
        this.painelCadastrarAluno.add(VoltarBtn,BorderLayout.SOUTH);
        
        JPanel painelFuncoes;
        painelFuncoes = new JPanel();
        painelFuncoes.setLayout(new GridLayout(0,2));
        //painelFuncoes.setPreferredSize(new Dimension(1280, 720));
        painelFuncoes.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        
        JLabel Id = new JLabel("Id:", SwingConstants.CENTER);
        Id.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(Id);
        CadastrarIdAluno = new JTextField(25);
        CadastrarIdAluno.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(CadastrarIdAluno);
        
        JLabel Nome = new JLabel("Nome:", SwingConstants.CENTER);
        Nome.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(Nome);
        CadastrarNomeAluno = new JTextField(100);
        CadastrarNomeAluno.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(CadastrarNomeAluno);
        
        JLabel Senha = new JLabel("Senha:", SwingConstants.CENTER);
        Senha.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(Senha);
        CadastrarSenhaAluno = new JTextField(20);
        CadastrarSenhaAluno.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(CadastrarSenhaAluno);
        
        JLabel DataDeNasc = new JLabel("Data de Nascimento:", SwingConstants.CENTER);
        DataDeNasc.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(DataDeNasc);
        CadastrarDataAluno = new JTextField(20);
        CadastrarDataAluno.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(CadastrarDataAluno);
        
        JLabel Filiacao = new JLabel("Pais ou responsável:", SwingConstants.CENTER);
        Filiacao.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(Filiacao);
        CadastrarFiliacaoAluno = new JTextField(100);
        CadastrarFiliacaoAluno.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(CadastrarFiliacaoAluno);
        
        JLabel Telefone = new JLabel("Telefone:", SwingConstants.CENTER);
        Telefone.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(Telefone);
        CadastrarTelefoneAluno = new JTextField(100);
        CadastrarTelefoneAluno.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(CadastrarTelefoneAluno);
        
        JLabel Endereco = new JLabel("Endereço:", SwingConstants.CENTER);
        Endereco.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(Endereco);
        CadastrarEnderecoAluno = new JTextField(100);
        CadastrarEnderecoAluno.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(CadastrarEnderecoAluno);
        
        JButton CadastrarBtn;
        CadastrarBtn = new JButton("Cadastrar");
        CadastrarBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        CadastrarBtn.addActionListener(new ConfirmaCadastroAluno(this));
        this.painelCadastrarAluno.add(CadastrarBtn,BorderLayout.EAST);
        
        this.painelCadastrarAluno.add(painelFuncoes, BorderLayout.CENTER);
    }
    
    public void TelaAdminRemoverAluno()
    {
        VisibilidadeTelaAdmin();
        this.setSize(1280,720);
        this.setVisible(true);
        
        this.painelRemoverAluno = new JPanel();
        this.painelRemoverAluno.setLayout(new BorderLayout());
        this.painelRemoverAluno.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));
        
        TelaAdminRemoverAlunoAux();
        
        this.add(this.painelRemoverAluno);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.repaint();
    }
    
    private void TelaAdminRemoverAlunoAux()
    {   
        Alunos.setVisible(true);
        Alunos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.painelRemoverAluno.add(new JScrollPane(Alunos), BorderLayout.CENTER);
        
        JLabel Titulo = new JLabel("REMOVER ALUNO", SwingConstants.CENTER);
        Titulo.setFont(new Font("Arial", Font.PLAIN, 120));
        this.painelRemoverAluno.add(Titulo, BorderLayout.NORTH);
        
        JButton RemoverBtn;
        RemoverBtn = new JButton("Remover");
        RemoverBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        RemoverBtn.addActionListener(new ConfirmaRemoveAluno(this));
        this.painelRemoverAluno.add(RemoverBtn,BorderLayout.EAST);
        
        JButton VoltarBtn;
        VoltarBtn = new JButton("Voltar");
        VoltarBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        VoltarBtn.addActionListener(new VoltarAdminRemoverAluno(this));
        this.painelRemoverAluno.add(VoltarBtn,BorderLayout.SOUTH);
        
    }
    
    public void TelaAdminEditarAluno()
    {
        VisibilidadeTelaAdmin();
        this.setSize(1280,720);
        this.setVisible(true);
        
        this.painelEditarAluno = new JPanel();
        this.painelEditarAluno.setLayout(new BorderLayout());
        this.painelEditarAluno.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));
        
        TelaAdminEditarAlunoAux();
        
        this.add(this.painelEditarAluno);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.repaint();
    }
    
    public void TelaAdminEditarAlunoAux()
    {
        JLabel Titulo = new JLabel("EDITAR ALUNO", SwingConstants.CENTER);
        Titulo.setFont(new Font("Arial", Font.PLAIN, 120));
        this.painelEditarAluno.add(Titulo, BorderLayout.NORTH);
        
        Alunos.setVisible(true);
        Alunos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.painelEditarAluno.add(new JScrollPane(Alunos), BorderLayout.WEST);
        
        JPanel painelFuncoes = new JPanel();
        painelFuncoes.setLayout(new GridLayout(0,2));
        painelFuncoes.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        
        JLabel Id = new JLabel("Id:", SwingConstants.CENTER);
        Id.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(Id);
        CadastrarIdAluno = new JTextField(25);
        CadastrarIdAluno.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(CadastrarIdAluno);
        
        JLabel Nome = new JLabel("Nome:", SwingConstants.CENTER);
        Nome.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(Nome);
        CadastrarNomeAluno = new JTextField(100);
        CadastrarNomeAluno.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(CadastrarNomeAluno);
        
        JLabel Senha = new JLabel("Senha:", SwingConstants.CENTER);
        Senha.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(Senha);
        CadastrarSenhaAluno = new JTextField(20);
        CadastrarSenhaAluno.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(CadastrarSenhaAluno);
        
        JLabel DataDeNasc = new JLabel("Data de Nascimento:", SwingConstants.CENTER);
        DataDeNasc.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(DataDeNasc);
        CadastrarDataAluno = new JTextField(20);
        CadastrarDataAluno.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(CadastrarDataAluno);
        
        JLabel Filiacao = new JLabel("Pais ou responsável:", SwingConstants.CENTER);
        Filiacao.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(Filiacao);
        CadastrarFiliacaoAluno = new JTextField(100);
        CadastrarFiliacaoAluno.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(CadastrarFiliacaoAluno);
        
        JLabel Telefone = new JLabel("Telefone:", SwingConstants.CENTER);
        Telefone.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(Telefone);
        CadastrarTelefoneAluno = new JTextField(100);
        CadastrarTelefoneAluno.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(CadastrarTelefoneAluno);
        
        JLabel Endereco = new JLabel("Endereço:", SwingConstants.CENTER);
        Endereco.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(Endereco);
        CadastrarEnderecoAluno = new JTextField(100);
        CadastrarEnderecoAluno.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(CadastrarEnderecoAluno);
        
        this.painelEditarAluno.add(painelFuncoes, BorderLayout.CENTER);
        
        Alunos.addListSelectionListener(new InfoListaAluno(this));
        
        JButton EditarBtn;
        EditarBtn = new JButton("Editar");
        EditarBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        EditarBtn.addActionListener(new ConfirmaEditaAluno(this));
        this.painelEditarAluno.add(EditarBtn,BorderLayout.EAST);
        
        JButton VoltarBtn;
        VoltarBtn = new JButton("Voltar");
        VoltarBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        VoltarBtn.addActionListener(new VoltarAdminEditarAluno(this));
        this.painelEditarAluno.add(VoltarBtn,BorderLayout.SOUTH);
    }
    
    public void TelaAdminCadastrarProfessor()
    {
        VisibilidadeTelaAdmin();
        this.setSize(1280,720);
        this.setVisible(true);
        
        this.painelCadastrarProfessor = new JPanel();
        this.painelCadastrarProfessor.setLayout(new BorderLayout());
        this.painelCadastrarProfessor.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));
        
        TelaAdminCadastrarProfessorAux();
        
        this.add(this.painelCadastrarProfessor);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.repaint();
    }
    
    private void TelaAdminCadastrarProfessorAux()
    {
        JLabel Titulo = new JLabel("CADASTRAR PROFESSOR", SwingConstants.CENTER);
        Titulo.setFont(new Font("Arial", Font.PLAIN, 95));
        this.painelCadastrarProfessor.add(Titulo, BorderLayout.NORTH);
        
        JButton VoltarBtn;
        VoltarBtn = new JButton("Voltar");
        VoltarBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        VoltarBtn.addActionListener(new VoltarAdminProfessor(this,1));
        this.painelCadastrarProfessor.add(VoltarBtn,BorderLayout.SOUTH);
        
        JPanel painelFuncoes;
        painelFuncoes = new JPanel();
        painelFuncoes.setLayout(new GridLayout(0,2));
        painelFuncoes.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        
        JLabel Id = new JLabel("Id:", SwingConstants.CENTER);
        Id.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(Id);
        CadastrarIdProfessor = new JTextField(25);
        CadastrarIdProfessor.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(CadastrarIdProfessor);
        
        JLabel Nome = new JLabel("Nome:", SwingConstants.CENTER);
        Nome.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(Nome);
        CadastrarNomeProfessor = new JTextField(100);
        CadastrarNomeProfessor.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(CadastrarNomeProfessor);
        
        JLabel Senha = new JLabel("Senha:", SwingConstants.CENTER);
        Senha.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(Senha);
        CadastrarSenhaProfessor = new JTextField(20);
        CadastrarSenhaProfessor.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(CadastrarSenhaProfessor);
        
        JLabel DataDeNasc = new JLabel("Data de Nascimento:", SwingConstants.CENTER);
        DataDeNasc.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(DataDeNasc);
        CadastrarDataProfessor = new JTextField(20);
        CadastrarDataProfessor.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(CadastrarDataProfessor);
        
        JLabel Filiacao = new JLabel("Pais ou responsável:", SwingConstants.CENTER);
        Filiacao.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(Filiacao);
        CadastrarFiliacaoProfessor = new JTextField(100);
        CadastrarFiliacaoProfessor.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(CadastrarFiliacaoProfessor);
        
        JLabel Telefone = new JLabel("Telefone:", SwingConstants.CENTER);
        Telefone.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(Telefone);
        CadastrarTelefoneProfessor = new JTextField(100);
        CadastrarTelefoneProfessor.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(CadastrarTelefoneProfessor);
        
        JLabel Endereco = new JLabel("Endereço:", SwingConstants.CENTER);
        Endereco.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(Endereco);
        CadastrarEnderecoProfessor = new JTextField(100);
        CadastrarEnderecoProfessor.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(CadastrarEnderecoProfessor);
        
        JButton CadastrarBtn;
        CadastrarBtn = new JButton("Cadastrar");
        CadastrarBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        CadastrarBtn.addActionListener(new ConfirmaCadastroProfessor(this));
        this.painelCadastrarProfessor.add(CadastrarBtn,BorderLayout.EAST);
        
        this.painelCadastrarProfessor.add(painelFuncoes, BorderLayout.CENTER);
    }
    
    public void TelaAdminRemoverProfessor()
    {
        VisibilidadeTelaAdmin();
        this.setSize(1280,720);
        this.setVisible(true);
        
        this.painelRemoverProfessor = new JPanel();
        this.painelRemoverProfessor.setLayout(new BorderLayout());
        this.painelRemoverProfessor.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));
        
        TelaAdminRemoverProfessorAux();
        
        this.add(this.painelRemoverProfessor);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.repaint();
    }
    
    private void TelaAdminRemoverProfessorAux()
    {
        Professores.setVisible(true);
        Professores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.painelRemoverProfessor.add(new JScrollPane(Professores), BorderLayout.CENTER);
        
        JLabel Titulo = new JLabel("REMOVER PROFESSOR", SwingConstants.CENTER);
        Titulo.setFont(new Font("Arial", Font.PLAIN, 100));
        this.painelRemoverProfessor.add(Titulo, BorderLayout.NORTH);
        
        JButton RemoverBtn;
        RemoverBtn = new JButton("Remover");
        RemoverBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        RemoverBtn.addActionListener(new ConfirmaRemoveProfessor(this));
        this.painelRemoverProfessor.add(RemoverBtn,BorderLayout.EAST);
        
        JButton VoltarBtn;
        VoltarBtn = new JButton("Voltar");
        VoltarBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        VoltarBtn.addActionListener(new VoltarAdminProfessor(this,2));
        this.painelRemoverProfessor.add(VoltarBtn,BorderLayout.SOUTH);
    }
    
    public void TelaAdminEditarProfessor()
    {
        VisibilidadeTelaAdmin();
        this.setSize(1280,720);
        this.setVisible(true);
        
        this.painelEditarProfessor = new JPanel();
        this.painelEditarProfessor.setLayout(new BorderLayout());
        this.painelEditarProfessor.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));
        
        TelaAdminEditarProfessorAux();
        
        this.add(this.painelEditarProfessor);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.repaint();
    }
    
    private void TelaAdminEditarProfessorAux()
    {
        JLabel Titulo = new JLabel("EDITAR PROFESSOR", SwingConstants.CENTER);
        Titulo.setFont(new Font("Arial", Font.PLAIN, 100));
        this.painelEditarProfessor.add(Titulo, BorderLayout.NORTH);
        
        Professores.setVisible(true);
        Professores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.painelEditarProfessor.add(new JScrollPane(Professores), BorderLayout.WEST);
        
        JPanel painelFuncoes = new JPanel();
        painelFuncoes.setLayout(new GridLayout(0,2));
        painelFuncoes.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        
        JLabel Id = new JLabel("Id:", SwingConstants.CENTER);
        Id.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(Id);
        CadastrarIdProfessor = new JTextField(25);
        CadastrarIdProfessor.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(CadastrarIdProfessor);
        
        JLabel Nome = new JLabel("Nome:", SwingConstants.CENTER);
        Nome.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(Nome);
        CadastrarNomeProfessor = new JTextField(100);
        CadastrarNomeProfessor.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(CadastrarNomeProfessor);
        
        JLabel Senha = new JLabel("Senha:", SwingConstants.CENTER);
        Senha.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(Senha);
        CadastrarSenhaProfessor = new JTextField(20);
        CadastrarSenhaProfessor.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(CadastrarSenhaProfessor);
        
        JLabel DataDeNasc = new JLabel("Data de Nascimento:", SwingConstants.CENTER);
        DataDeNasc.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(DataDeNasc);
        CadastrarDataProfessor = new JTextField(20);
        CadastrarDataProfessor.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(CadastrarDataProfessor);
        
        JLabel Filiacao = new JLabel("Pais ou responsável:", SwingConstants.CENTER);
        Filiacao.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(Filiacao);
        CadastrarFiliacaoProfessor = new JTextField(100);
        CadastrarFiliacaoProfessor.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(CadastrarFiliacaoProfessor);
        
        JLabel Telefone = new JLabel("Telefone:", SwingConstants.CENTER);
        Telefone.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(Telefone);
        CadastrarTelefoneProfessor = new JTextField(100);
        CadastrarTelefoneProfessor.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(CadastrarTelefoneProfessor);
        
        JLabel Endereco = new JLabel("Endereço:", SwingConstants.CENTER);
        Endereco.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(Endereco);
        CadastrarEnderecoProfessor = new JTextField(100);
        CadastrarEnderecoProfessor.setFont(new Font("Arial", Font.PLAIN, 22));
        painelFuncoes.add(CadastrarEnderecoProfessor);
        
        this.painelEditarProfessor.add(painelFuncoes, BorderLayout.CENTER);
        
        Professores.addListSelectionListener(new InfoListaProfessor(this));
        
        JButton EditarBtn;
        EditarBtn = new JButton("Editar");
        EditarBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        EditarBtn.addActionListener(new ConfirmaEditaProfessor(this));
        this.painelEditarProfessor.add(EditarBtn,BorderLayout.EAST);
        
        JButton VoltarBtn;
        VoltarBtn = new JButton("Voltar");
        VoltarBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        VoltarBtn.addActionListener(new VoltarAdminProfessor(this,3));
        this.painelEditarProfessor.add(VoltarBtn,BorderLayout.SOUTH);
    }
    
    public void TelaAdminCadastrarTurma()
    {
        
    }
    
    public void TelaAdminRemoverTurma()
    {
        
    }
    
    public void TelaAdminEditarTurma()
    {
        
    }
    
    
    
    
    
    

    public static void main(String[] args) 
    {
        Tela tela = new Tela();
        tela.TelaPrincipal();
        tela.pack();
    }
    
    //Setters
    public void SetUsuario(JTextField usuario)
    {
        this.usuario = usuario;
    }
    
    public void SetSenha(JPasswordField senha)
    {
        this.senha = senha;
    }
    
    public void SetLastId(int LastId)
    {
        this.LastId = LastId;
    }
    
    public void SetCadastrarIdAluno(JTextField CadastrarIdAluno)
    {
       this.CadastrarIdAluno = CadastrarIdAluno;
    }
    
    public void SetCadastrarNomeAluno(JTextField CadastrarNomeAluno)
    {
        this.CadastrarNomeAluno = CadastrarNomeAluno;
    }
    
    public void SetCadastrarSenhaAluno(JTextField CadastrarSenhaAluno)
    {
        this.CadastrarSenhaAluno = CadastrarSenhaAluno;
    }
    
    public void SetCadastrarDataAluno(JTextField CadastrarDataAluno)
    {
        this.CadastrarDataAluno = CadastrarDataAluno;
    }
    
    public void SetCadastrarFiliacaoAluno(JTextField CadastrarFiliacaoAluno)
    {
        this.CadastrarFiliacaoAluno = CadastrarFiliacaoAluno;
    }
    
    public void SetCadastrarTelefoneAluno(JTextField CadastrarTelefoneAluno)
    {
        this.CadastrarTelefoneAluno = CadastrarTelefoneAluno;
    }
    
    public void SetCadastrarEnderecoAluno(JTextField CadastrarEnderecoAluno)
    {
        this.CadastrarEnderecoAluno = CadastrarEnderecoAluno;
    }
    
    public void SetCadastrarIdProfessor(JTextField CadastrarIdProfessor)
    {
       this.CadastrarIdProfessor = CadastrarIdProfessor;
    }
    
    public void SetCadastrarNomeProfessor(JTextField CadastrarNomeProfessor)
    {
        this.CadastrarNomeProfessor = CadastrarNomeProfessor;
    }
    
    public void SetCadastrarSenhaProfessor(JTextField CadastrarSenhaProfessor)
    {
        this.CadastrarSenhaProfessor = CadastrarSenhaProfessor;
    }
    
    public void SetCadastrarDataProfessor(JTextField CadastrarDataProfessor)
    {
        this.CadastrarDataProfessor = CadastrarDataProfessor;
    }
    
    public void SetCadastrarFiliacaoProfessor(JTextField CadastrarFiliacaoProfessor)
    {
        this.CadastrarFiliacaoProfessor = CadastrarFiliacaoProfessor;
    }
    
    public void SetCadastrarTelefoneProfessor(JTextField CadastrarTelefoneProfessor)
    {
        this.CadastrarTelefoneProfessor = CadastrarTelefoneProfessor;
    }
    
    public void SetCadastrarEnderecoProfessor(JTextField CadastrarEnderecoProfessor)
    {
        this.CadastrarEnderecoProfessor = CadastrarEnderecoProfessor;
    }
    
    //Getters
    public int GetLastId()
    {
        return this.LastId;
    }
    
    public JList<Aluno> GetAlunos() 
    {
        return Alunos;
    }
    
    public JList<Professor> GetProfessores() 
    {
        return Professores;
    }
    
    public JTextField GetUsuario()
    {
        return this.usuario;
    }
    
    public JPasswordField GetSenha()
    {
        return this.senha;
    }
    
    public JTextField GetCadastrarIdAluno()
    {
        return this.CadastrarIdAluno;
    }
    
    public JTextField GetCadastrarNomeAluno()
    {
        return this.CadastrarNomeAluno;
    }
    
    public JTextField GetCadastrarSenhaAluno()
    {
        return this.CadastrarSenhaAluno;
    }
    
    public JTextField GetCadastrarDataAluno()
    {
        return this.CadastrarDataAluno;
    }
    
    public JTextField GetCadastrarFiliacaoAluno()
    {
        return this.CadastrarFiliacaoAluno;
    }
    
    public JTextField GetCadastrarTelefoneAluno()
    {
        return this.CadastrarTelefoneAluno;
    }
    
    public JTextField GetCadastrarEnderecoAluno()
    {
        return this.CadastrarEnderecoAluno;
    }
    
    public JTextField GetCadastrarIdProfessor()
    {
        return this.CadastrarIdProfessor;
    }
    
    public JTextField GetCadastrarNomeProfessor()
    {
        return this.CadastrarNomeProfessor;
    }
    
    public JTextField GetCadastrarSenhaProfessor()
    {
        return this.CadastrarSenhaProfessor;
    }
    
    public JTextField GetCadastrarDataProfessor()
    {
        return this.CadastrarDataProfessor;
    }
    
    public JTextField GetCadastrarFiliacaoProfessor()
    {
        return this.CadastrarFiliacaoProfessor;
    }
    
    public JTextField GetCadastrarTelefoneProfessor()
    {
        return this.CadastrarTelefoneProfessor;
    }
    
    public JTextField GetCadastrarEnderecoProfessor()
    {
        return this.CadastrarEnderecoProfessor;
    }
    
    //Altera visibilidade
    public void VisibilidadeTelaAdmin()
    {
        this.painelAdmin.setVisible(false);
    }
    
    public void VisibilidadeTelaLogin()
    {
        this.painelLogin.setVisible(false);
    }
    
    public void VisibilidadeTelaPrincipal()
    {
        this.painelPrincipal.setVisible(false);
    }
    
    public void VisibilidadeTelaCadastrarAluno()
    {
        this.painelCadastrarAluno.setVisible(false);
    }
    
    public void VisibilidadeTelaCadastrarProfessor()
    {
        this.painelCadastrarProfessor.setVisible(false);
    }
    
    public void VisibilidadeTelaCadastrarTurma()
    {
        this.painelCadastrarTurma.setVisible(false);
    }
    
    public void VisibilidadeTelaRemoverAluno()
    {
        this.painelRemoverAluno.setVisible(false);
    }
    public void VisibilidadeTelaRemoverProfessor()
    {
        this.painelRemoverProfessor.setVisible(false);
    }
    public void VisibilidadeTelaRemoverTurma()
    {
        this.painelRemoverTurma.setVisible(false);
    }
    
    public void VisibilidadeTelaEditarAluno()
    {
        this.painelEditarAluno.setVisible(false);
    }
    public void VisibilidadeTelaEditarProfessor()
    {
        this.painelEditarProfessor.setVisible(false);
    }
    public void VisibilidadeTelaEditarTurma()
    {
        this.painelEditarTurma.setVisible(false);
    }
}
