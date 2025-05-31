package org.example;

import org.example.excecoes.DivisaoPorZero;

import static java.lang.Integer.valueOf;

public class Descricao implements Comparable<Conta> {

    private String nome;
    private int media;
    private int numero1;
    private int numero2;

    public Descricao(String nome, int media, int numero1, int numero2) {
        this.media = media;
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Descricao(ContaPJ contaPJ) {
        this.nome = contaPJ.title();

        if (numero2 == 0) {
            throw new DivisaoPorZero("Não é possível realizar divisão por zero");
        }

    }


    @Override
    public int compareTo(Conta o) {
        return 0;
    }

    @Override
    public String toString() {
        return "nome = '" + nome + '\'' +
                ", numero1 = " + numero1 + "\" + " +
                " numero2 = " + numero2;

    }
}
