package dev.ifrs.pessoas;

public class Usuario extends Pessoa{

    private int anuncios;

    public Usuario(String username, String email, String password) {
        super(username, email, password);
        this.anuncios = 0;
        //TODO Auto-generated constructor stub
    }
    
}
