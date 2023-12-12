package br.ufrpe.JJGamesOn.entidades;

import java.util.ArrayList;

public class Jogo {
    private String nome;
    private double valor;
    private String desenvolvedora;
    private String genero;
    private String resumo;
    private double notaMetacritic;
    private int codigoDeAtivacao;
    private FaixaEtaria faixaEtaria;

    //Meramente Ilustrativo
    private ArrayList<Avaliacao> avaliacoes = new ArrayList<>();

    public Jogo(String nome, double valor, String desenvolvedora, String genero, String resumo,
                double notaMetacritic, int codigoDeAtivacao, FaixaEtaria faixaEtaria) {
        this.nome = nome;
        this.valor = valor;
        this.desenvolvedora = desenvolvedora;
        this.genero = genero;
        this.resumo = resumo;
        this.notaMetacritic = notaMetacritic;
        this.codigoDeAtivacao = codigoDeAtivacao;
        this.faixaEtaria = faixaEtaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    public void setDesenvolvedora(String desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public double getNotaMetacritic() {
        return notaMetacritic;
    }

    public void setNotaMetacritic(double notaMetacritic) {
        this.notaMetacritic = notaMetacritic;
    }

    public int getCodigoDeAtivacao() {
        return codigoDeAtivacao;
    }

    public void setCodigoDeAtivacao(int codigoDeAtivacao) {
        this.codigoDeAtivacao = codigoDeAtivacao;
    }

    public FaixaEtaria getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(FaixaEtaria faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

}
