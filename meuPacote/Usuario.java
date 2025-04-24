package meuPacote;

public class Usuario {

    private String id;
    private String nome;
    private String email;
    private String senha;

    // Construtor padrão
    public Usuario() {
    }

    // Construtor com nome, email e senha
    // POLIMORFISMO ESTÁ AQUI POIS É USADO O POLIMORFISMO DE SOBRESCRITA (OVERRIDING) ###
    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.id = gerarIdAutomaticamente(); // pode ser um UUID ou algo do tipo
    }

    // Construtor com ID, email e senha
    // POLIMORFISMO ESTÁ AQUI POIS É USADO O POLIMORFISMO DE SOBRESCRITA (OVERRIDING) ###
    public Usuario(String id, String email, String senha, boolean usarId) {
        this.id = id;
        this.email = email;
        this.senha = senha;
    }

    // Método para gerar um ID aleatório, se quiser automatizar
    private String gerarIdAutomaticamente() {
        return java.util.UUID.randomUUID().toString();
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
