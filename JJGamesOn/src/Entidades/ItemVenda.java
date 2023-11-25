package Entidades;

public class ItemVenda {
    private Jogo jogo;
    private int quantidade;

    public ItemVenda(Jogo jogo, int quantidade) {
        this.jogo = jogo;
        this.quantidade = quantidade;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
