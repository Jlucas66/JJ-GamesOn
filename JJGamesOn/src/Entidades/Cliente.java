package Entidades;

import java.lang.reflect.Array;
import java.time.LocalDate;

public class Cliente extends Pessoa{
    private Array historicoDeCompras;

    public Cliente(String nome, String email, String senha, LocalDate dataNascimento, Array historicoDeCompras) {
        super(nome, email, senha, dataNascimento);
        this.historicoDeCompras = historicoDeCompras;
    }

    public Array getHistoricoDeCompras() {
        return historicoDeCompras;
    }

    public void setHistoricoDeCompras(Array historicoDeCompras) {
        this.historicoDeCompras = historicoDeCompras;
    }
}
