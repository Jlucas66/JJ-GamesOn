package br.ufrpe.JJGamesOn.entidades;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private String email;
    private String senha;
    private LocalDate dataNascimento;
    private boolean ehAdm;

    public Pessoa(String nome, String email, String senha, LocalDate dataNascimento, boolean ehAdm) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.ehAdm = ehAdm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean getEhAdm(){
        return ehAdm;
    }

    public int calcularIdade(){
        LocalDate dataAtual = LocalDate.now();
        return Period.between(dataNascimento, dataAtual).getYears();
    }

}
