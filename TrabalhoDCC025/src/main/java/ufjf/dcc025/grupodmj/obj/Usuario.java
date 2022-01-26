package ufjf.dcc025.grupodmj.obj;


abstract class Usuario 
{
    String Senha, Usuario;
    
    public String GetSenha()
    {
        return this.Senha;
    }
    
    public void SetSenha(String Senha)
    {
        this.Senha = Senha;
    }
    
}
