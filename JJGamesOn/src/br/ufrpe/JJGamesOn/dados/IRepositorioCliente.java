package br.ufrpe.JJGamesOn.dados;

import br.ufrpe.JJGamesOn.entidades.Pessoa;

public interface IRepositorioCliente {

    void inserirCliente(Pessoa cliente);
//    Pessoa obterClientePorId(int id);
    void removerCliente(Pessoa cliente);
//    void atualizarCliente(Pessoa cliente);
    // void listarClientesDoBancoDeDados (???);

}
