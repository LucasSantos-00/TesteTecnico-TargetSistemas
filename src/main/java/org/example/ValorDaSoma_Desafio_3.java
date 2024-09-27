package org.example;

public class ValorDaSoma_Desafio_3 {
    public static void main(String[] args) {
        int INDICE = 12, SOMA = 0, K = 1;
        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }
        System.out.printf(String.valueOf(SOMA));
    }
}


// O valor sera de 77