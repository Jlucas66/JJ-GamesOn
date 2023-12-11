package dados;

import entidades.Jogo;

public interface IRepositorioJogo {
    boolean inserirJogo (Jogo jogo);
    Jogo obterJogoPorId(int ID);
    boolean removerJogo (Jogo jogo);
    boolean atualizarJogo (Jogo jogo);
    // void listarJogosDoBancoDeDados (???);
}
