package br.ufrpe.JJGamesOn.dados;

import br.ufrpe.JJGamesOn.entidades.Cliente;

import java.util.ArrayList;

public class RepositorioCliente implements IRepositorioCliente {

    // atributos

    private ArrayList<Cliente> clientes;
    private static IRepositorioCliente instance;

    // construtores
    private RepositorioCliente(){
        clientes = new ArrayList<>();
    }

    public static IRepositorioCliente getInstance(){
        if(instance == null){
            instance = new RepositorioCliente();
        }
        return instance;
    }

    // CRUD de cliente

    public void inserirCliente(Cliente cliente) {
        if (cliente != null){
            clientes.add(cliente);
        }

    }

    public Cliente obterClientePorId(int id) {
        Cliente c = null;
        for (Cliente cliente : clientes){
            if (cliente.getIdCliente() == id){
                c = cliente;
            }
        }
        return c;
    }

    public void removerCliente(Cliente cliente) {
        if (cliente != null){
            clientes.remove(cliente);
        }
    }

    public void atualizarCliente(Cliente cliente) {
        if (cliente != null){
            for (Cliente antigo : clientes){
                if (antigo.getIdCliente() == cliente.getIdCliente()){  // se o id do cliente antigo for igual ao id do cliente novo, a atualização é feita
                    antigo.setNome(cliente.getNome());
                    antigo.setEmail(cliente.getEmail());
                    antigo.setSenha(cliente.getSenha());
                    antigo.setDataNascimento(cliente.getDataNascimento());
                }
            }
        }
    }

    /*public ArrayList<Cliente> listarClientesDoBancoDeDados (){
        return clientes;
    }*/
}