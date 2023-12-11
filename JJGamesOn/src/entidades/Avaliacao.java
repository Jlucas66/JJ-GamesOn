package entidades;

public class Avaliacao {
    private Cliente cliente;
    private Jogo jogo;
    private int nota;
    private String comentario;

    public Avaliacao(Cliente cliente, Jogo jogo, int nota, String comentario) {
        this.cliente = cliente;
        this.jogo = jogo;
        this.nota = nota;
        this.comentario = comentario;
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

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
