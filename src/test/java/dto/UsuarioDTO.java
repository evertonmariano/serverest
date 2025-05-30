package dto;

public class UsuarioDTO {
    private String nome;
    private String email;
    private String password;
    public String administrador;

    public UsuarioDTO() {
    }

    public UsuarioDTO(String nome, String email, String password, String administrador) {
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.administrador = administrador;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }
}

