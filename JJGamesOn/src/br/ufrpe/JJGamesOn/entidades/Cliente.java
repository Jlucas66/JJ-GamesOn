package br.ufrpe.JJGamesOn.entidades;

import java.time.LocalDate;

public class Cliente extends Pessoa{

    public Cliente(String nome, String email, String senha, LocalDate dataNascimento) {
        super(nome, email, senha, dataNascimento);
    }

}
