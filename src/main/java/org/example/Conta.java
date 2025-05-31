package org.example;

import org.example.excecoes.DivisaoPorZero;

import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {

        dividir(12, 0);

    }

    public static int dividir(int a, int b) {


        try {
            System.out.println("a / b = " + a / b);
            return a / b;

        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida");
            return 0;
        }
    }

}