package br.ufrpe.JJGamesOn.entidades;

import java.util.Random;

public class Codigo {
    private String chave;

    public Codigo() {
        this.chave = gerarCodigo(10);
    }

    public String getChave() {
        return chave;
    }

    private String gerarCodigo(int tamanho) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder codigo = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            int indice = random.nextInt(caracteres.length());
            codigo.append(caracteres.charAt(indice));
        }

        return codigo.toString();
    }
}
