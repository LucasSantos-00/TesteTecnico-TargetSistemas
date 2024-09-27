package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SequenciaDeFibonacci_Desafio_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean entradaValida = false;
        int numero = 0;

        // garantindo que o usuario ira digitar um número inteiro
        while (!entradaValida) {
            try {
                System.out.print("Informe um numero inteiro: ");
                numero = scanner.nextInt();
                entradaValida = true;

                // verifica se o numero informado pertence a sequencia de fibonacci
                if (eFibonacci(numero)) {
                    System.out.println(numero + " pertence a sequencia de Fibonacci."); // (True)
                } else {
                    System.out.println(numero + " nao pertence a sequencia de Fibonacci."); // (False)
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida, insira um numero inteiro");
                scanner.next(); // limpa a entrada invalida
            }
        }
        scanner.close();
    }

    public static boolean eFibonacci(int numero) { // funçao para verificar se um numero pertence a sequencia de fibonacci
        if (numero == 0 || numero == 1) {
            return true;
        }
        int anterior = 0;
        int atual = 1;
        int proximo = anterior + atual;

        // gerando a sequencia ate que o proximo valor seja maior ou igual ao numero digitado
        while (proximo <= numero) {
            if (proximo == numero) {
                return true; // Retorna true caso o número for da sequencia
            }
            anterior = atual;
            atual = proximo;
            proximo = anterior + atual;
        }

        return false; // retorna false caso o numero nao pertencer a sequencia
    }
}