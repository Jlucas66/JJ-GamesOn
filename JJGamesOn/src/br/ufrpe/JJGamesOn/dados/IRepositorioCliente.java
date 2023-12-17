package br.ufrpe.JJGamesOn.dados;

public interface IRepositorioCliente {

    void inserirCliente(Cliente cliente);
    Cliente obterClientePorId(int id);
    void removerCliente(Cliente cliente);
    void atualizarCliente(Cliente cliente);
    // void listarClientesDoBancoDeDados (???);

}
