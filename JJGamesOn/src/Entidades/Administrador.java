package Entidades;

import java.time.LocalDateTime;

public class Administrador extends Pessoa{
    private int chaveEspecial;

    public Administrador(String nome, String email, String senha, LocalDateTime dataNascimento, int chaveEspecial) {
        super(nome, email, senha, dataNascimento);
        this.chaveEspecial = chaveEspecial;
    }

    public int getChaveEspecial() {
        return chaveEspecial;
    }

    public void setChaveEspecial(int chaveEspecial) {
        this.chaveEspecial = chaveEspecial;
    }
}
