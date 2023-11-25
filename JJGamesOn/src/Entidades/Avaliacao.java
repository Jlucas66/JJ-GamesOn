package Entidades;

public class Avaliacao {
    private Cliente cliente;
    private Jogo jogo;
    private int nota;

    public Avaliacao(Cliente cliente, Jogo jogo, int nota) {
        this.cliente = cliente;
        this.jogo = jogo;
        this.nota = nota;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
