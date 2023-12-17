package br.ufrpe.JJGamesOn.dados;

import br.ufrpe.JJGamesOn.entidades.Jogo;

public interface IRepositorioJogo {
    void inserirJogo (Jogo jogo);
    Jogo obterJogoPorId(int ID);
    void removerJogo (Jogo jogo);
    void atualizarJogo (Jogo jogo);
    // void listarJogosDoBancoDeDados (???);
}
