package it.oop.parte_due;

public class Utente {
    private long id;
    private String nome;
    private String cognome;
    private String username;
    private String password;
    private String email;

    public Utente() {
        super();
    }

    public Utente(String nome, String cognome) {
        super();
        this.nome = nome;
        this.cognome = cognome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
