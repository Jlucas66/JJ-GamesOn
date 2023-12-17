package br.ufrpe.JJGamesOn.dados;

import br.ufrpe.JJGamesOn.entidades.Pessoa;

import java.util.ArrayList;

public class RepositorioCliente implements IRepositorioCliente {

    // atributos

    private ArrayList<Pessoa> clientes;
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

    public void inserirCliente(Pessoa cliente) {
        if (cliente != null){
            clientes.add(cliente);
        }

    }

    //Mexer dps pq não existe metodo de obter ID

//    public Pessoa obterClientePorId(int id) {
//        Pessoa c = null;
//        for (Pessoa cliente : clientes){
//            if (cliente.getIdCliente() == id){
//                c = cliente;
//            }
//        }
//        return c;
//   }

    public void removerCliente(Pessoa cliente) {
        if (cliente != null){
            clientes.remove(cliente);
        }
    }

    //Mexer dps pq não existe metodo de obter ID

//    public void atualizarCliente(Pessoa cliente) {
//        if (cliente != null){
//            for (Pessoa antigo : clientes){
//                if (antigo.getIdCliente() == cliente.getIdCliente()){  // se o id do cliente antigo for igual ao id do cliente novo, a atualização é feita
//                    antigo.setNome(cliente.getNome());
//                    antigo.setEmail(cliente.getEmail());
//                    antigo.setSenha(cliente.getSenha());
//                    antigo.setDataNascimento(cliente.getDataNascimento());
//                }
//            }
//        }
//    }

    /*public ArrayList<Cliente> listarClientesDoBancoDeDados (){
        return clientes;
    }*/
}
