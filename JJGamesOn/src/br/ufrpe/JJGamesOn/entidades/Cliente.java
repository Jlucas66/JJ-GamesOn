package br.ufrpe.JJGamesOn.entidades;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente extends Pessoa{
    private ArrayList<Venda> historicoDeCompras = new ArrayList<>();

    public Cliente(String nome, String email, String senha, LocalDate dataNascimento) {
        super(nome, email, senha, dataNascimento);
    }


    // Esses códigos vão ficar nos repositorios, meramente ilustrativo
    public void adicionarHistorico(Venda venda){
        if(!historicoDeCompras.contains(venda)){
            historicoDeCompras.add(venda);
        }
    }
    public void removerHistorico(Venda venda){
        if(historicoDeCompras.contains(venda)){
            historicoDeCompras.remove(venda);
        }
    }
}
