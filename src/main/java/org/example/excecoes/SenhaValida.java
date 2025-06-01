package org.example.excecoes;

import javax.swing.*;

public class SenhaValida extends Exception {

    public static void main(String[] args) {
        System.out.println(valida("12345"));      // Deve mostrar erro
        System.out.println(valida("12345678"));   // Deve mostrar sucesso
    }

    public static String valida(String senha) {
        try {
            if (senha.length() >= 8) {
                return "Senha cadastrada com sucesso";
            } else {
                throw new SenhaValida(); // Lança a exceção personalizada
            }
        } catch (SenhaValida e) {
            return "Erro: Senha deve conter no mínimo 8 caracteres";
        }
    }
}
