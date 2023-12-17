package br.ufrpe.JJGamesOn.dados;
import br.ufrpe.JJGamesOn.entidades.Jogo;
public class RepositorioJogo implements IRepositorioJogo{

    // atributos

    // construtor

    // CRUD de jogo
    public boolean inserirJogo(Jogo jogo){
        boolean inseriu = false;

        // algoritmo para inserir um jogo novo

        return inseriu;
    }
//  precisamos adicionar o atributo ID, acho

    public Jogo obterJogoPorId(int ID){
        Jogo c = null;
        return c;
    }

    public boolean removerJogo(Jogo jogo){
        boolean removeu = false;

        // algoritmo para remover um jogo já existente

        return removeu;
    }

    public boolean atualizarJogo (Jogo jogo){
        boolean atualizou = false;

        //

        return atualizou;
    }

/*  num crud esse método é necessário, mas não sei como implementar com
banco de br.ufrpe.JJGamesOn.dados
    public void listarJogosDoBancoDeDados(??){

    }
   */
}