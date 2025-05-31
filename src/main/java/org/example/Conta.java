package org.example;

import org.example.excecoes.DivisaoPorZero;

import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int media;

        try {
            media = numero1 / numero2;
        } catch (DivisaoPorZero e) {
            System.out.println(e.getMessage());

        }

        System.out.println("Executou corretamente");
    }
}