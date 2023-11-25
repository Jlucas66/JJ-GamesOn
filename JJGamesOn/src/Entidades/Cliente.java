package Entidades;

import java.lang.reflect.Array;
import java.time.LocalDateTime;

public class Cliente extends Pessoa{
    private Array historicoDeCompras;

    public Cliente(String nome, String email, String senha, LocalDateTime dataNascimento, Array historicoDeCompras) {
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
