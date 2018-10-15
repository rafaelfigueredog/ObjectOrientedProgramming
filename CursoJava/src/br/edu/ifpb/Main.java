package br.edu.ifpb;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero = 1;
        String resultado;
        Scanner in = new Scanner(System.in);
        numero = in.nextInt();
        resultado = numero%2 == 0 ? "não" : "sim" ;
        System.out.println(resultado);
    }
}
