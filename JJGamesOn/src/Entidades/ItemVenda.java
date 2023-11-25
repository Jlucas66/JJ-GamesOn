package Entidades;

public class ItemVenda {
    private Jogo jogo;
    private int quantidade;
    private double valorTotal;

    public ItemVenda(Jogo jogo, int quantidade) {
        this.jogo = jogo;
        this.quantidade = quantidade;
        valorTotal = jogo.getValor() * quantidade;
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

    public double getValorTotal() {
        return valorTotal;
    }
}
