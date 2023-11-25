package Entidades;

public class Jogo {
    private String nome;
    private String desenvolvedora;
    private String genero;
    private String resumo;
    private double notaMetacritic;
    private int codigoDeAtivacao;
    private FaixaEtaria faixaEtaria;

    public enum FaixaEtaria {
        LIVRE(0), DEZ(10), DOZE(12), QUATORZE(14), DEZESSEIS(16), DEZOITO(18);

        private final int idade;

        public int getIdade() {
            return idade;
        }

        FaixaEtaria(int idade) {
            this.idade = idade;
        }
    }

    public void Media(){

    }
}
