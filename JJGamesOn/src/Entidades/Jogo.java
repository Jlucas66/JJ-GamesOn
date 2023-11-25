package Entidades;

public class Jogo {
    private String nome;
    private String desenvolvedora;
    private String genero;
    private String resumo;
    private double notaMetacritic;
    private int codigoDeAtivacao;

    public Jogo(String nome, String desenvolvedora, String genero, String resumo, double notaMetacritic, int codigoDeAtivacao) {
        this.nome = nome;
        this.desenvolvedora = desenvolvedora;
        this.genero = genero;
        this.resumo = resumo;
        this.notaMetacritic = notaMetacritic;
        this.codigoDeAtivacao = codigoDeAtivacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public void Media(){

    }
}
