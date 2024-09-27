package org.example;

import java.util.Scanner;

public class VerificarString_Desafio_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // pedindo ao usuario digitar uma frase/palavra
        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();

        // inicializa a contagem da letra a/A
        int contagem = 0;

        // for para percorrer a palavra/frase
        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            // Verifica se o caractere é 'a' ou 'A'
            if (caractere == 'a' || caractere == 'A') { // incrementando na contagem caso o caractere for a/A
                contagem++;
            }
        }

        if (contagem > 0) {
            System.out.println("A letra 'a' ou 'A' ocorre " + contagem + " vezes na string."); // caso seja detectado algum a/A exibindo para o usuario
        } else {
            System.out.println("A letra 'a' ou 'A' não foi encontrada na string."); // caso nao seja detectado nenhum a/A na frase/palavra
        }

        scanner.close();
    }

}
