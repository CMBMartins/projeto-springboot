public class Login {
    private String login;
    private String nome;
    private String senha;
    private String perfil;

    public Login(String login, String nome, String senha, String perfil) {
        this.login = login;
        this.nome = nome;
        this.senha = senha;
        this.perfil = perfil;
    }

    public String getLogin() {
        return login;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getPerfil() {
        return perfil;
    }
}
