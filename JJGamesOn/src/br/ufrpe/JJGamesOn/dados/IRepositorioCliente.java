package br.ufrpe.JJGamesOn.dados;

import br.ufrpe.JJGamesOn.entidades.Cliente;

public interface IRepositorioCliente {

    void inserirCliente(Cliente cliente);
    Cliente obterClientePorId(int id);
    void removerCliente(Cliente cliente);
    void atualizarCliente(Cliente cliente);
    // void listarClientesDoBancoDeDados (???);

}
