package br.edu.ifpb;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Digite um Inteiro: ");
        int s = in.nextInt();
        int atual = 1;
        int anterior = 0;
        int aux;
        System.out.println(anterior);
        System.out.println(atual);
        for (int i = 1; i < s ; i++) {
            aux = atual;
            atual = atual + anterior;
            anterior = aux;
            System.out.println(atual);
        }

    }

}
