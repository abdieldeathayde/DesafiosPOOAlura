package org.example.excecoes;


public class DivisaoPorZero extends RuntimeException {

    private String mensagem;

    public DivisaoPorZero(String mensagem) {
        this.mensagem = mensagem;
    }


    @Override
    public String getMessage() {
        return this.mensagem;
    }








}
