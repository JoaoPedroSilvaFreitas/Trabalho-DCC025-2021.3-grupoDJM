package ufjf.dcc025.grupodmj.view;

import javax.swing.*;
import java.awt.*;
import ufjf.dcc025.grupodmj.obj.*;
import ufjf.dcc025.grupodmj.controller.*;

public class Tela extends JFrame
{
    private JList<Admin> funcoesAdmin;
    private JPanel painelPrincipal;
    private JPanel painelAdmin;
    private JTextField usuario;
    private JPasswordField senha;
    
    Tela()
    {
        super("Sistema de controle escolar");
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
        JPanel painelLogin;
        JLabel preencheEspaco0 = new JLabel();
        JLabel preencheEspaco1 = new JLabel();
        JLabel preencheEspaco2 = new JLabel();
        JLabel preencheEspaco3 = new JLabel();
        JLabel preencheEspaco4 = new JLabel();
        JLabel preencheEspaco5 = new JLabel();
        JLabel preencheEspaco6 = new JLabel();
        
        painelLogin = new JPanel();
        painelLogin.setLayout(new BorderLayout());
        painelLogin.setLayout(new GridLayout(0, 3));
        painelLogin.setPreferredSize(new Dimension(1280, 720));
        
        JLabel loginTitulo = new JLabel("LOGIN", SwingConstants.CENTER);
        loginTitulo.setFont(new Font("Arial", Font.PLAIN, 120));
        painelLogin.add(loginTitulo, BorderLayout.NORTH);
        painelLogin.add(preencheEspaco0);
        painelLogin.add(preencheEspaco1);
        
        JLabel Usuario = new JLabel("Usuario:", SwingConstants.CENTER);
        Usuario.setFont(new Font("Arial", Font.PLAIN, 80));
        usuario = new JTextField(100);
        usuario.setFont(new Font("Arial", Font.PLAIN, 95));
        painelLogin.add(Usuario);
        painelLogin.add(usuario);
        painelLogin.add(preencheEspaco2);
        
        JLabel Senha = new JLabel("Senha:", SwingConstants.CENTER);
        Senha.setFont(new Font("Arial", Font.PLAIN, 80));
        senha = new JPasswordField(100);
        senha.setFont(new Font("Arial", Font.PLAIN, 95));
        painelLogin.add(Senha);
        painelLogin.add(senha);
        painelLogin.add(preencheEspaco3);
        
        painelLogin.add(preencheEspaco4);
        
        JButton loginBtn = new JButton("Entrar");
        loginBtn.setFont(new Font("Arial", Font.PLAIN, 26));
        loginBtn.addActionListener(new Login(this));
        painelLogin.add(loginBtn);
        painelLogin.add(preencheEspaco5);
        painelLogin.add(preencheEspaco6);
        
        this.painelPrincipal.add(painelLogin, BorderLayout.CENTER);
    }
    
    public void TelaAdmin()
    {
        painelPrincipal.setVisible(false);
        this.setSize(1280,720);
        this.setVisible(true);
        
        this.painelAdmin = new JPanel();
        this.painelAdmin .setLayout(new BorderLayout());
        this.painelAdmin .setBorder(BorderFactory.createLineBorder(Color.BLACK,5));
        
        TelaAdminAux();
        
        
        this.add(this.painelAdmin );
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.repaint();
    }
    
    private void TelaAdminAux()
    {
        
        //Adicionando titulo na página
        JLabel adminTitulo = new JLabel("ADMIN", SwingConstants.CENTER);
        adminTitulo.setFont(new Font("Arial", Font.PLAIN, 120));
        this.painelAdmin.add(adminTitulo, BorderLayout.NORTH);
        
        //Adicionando Lista de funções
        DefaultListModel<Admin> model = new DefaultListModel<>();
        funcoesAdmin = new JList<>(model);
        funcoesAdmin.setVisible(true);
        funcoesAdmin.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        //funcoesAdmin.addListSelectionListener(new InfoLista(this));
        
        this.painelAdmin.add(new JScrollPane(funcoesAdmin), BorderLayout.WEST);
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
    
    //Getters
    public JTextField GetUsuario()
    {
        return this.usuario;
    }
    
    public JPasswordField GetSenha()
    {
        return this.senha;
    }
    
}
