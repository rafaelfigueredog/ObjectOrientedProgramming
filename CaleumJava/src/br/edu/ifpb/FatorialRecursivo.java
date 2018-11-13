package br.edu.ifpb;

import java.util.Scanner;

public class FatorialRecursivo {

    public static int Fatorial(int n) {
        return n < 2 ? 1 : n * Fatorial(n-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();

        for (int i = 0; i < s; i++) {
            System.out.print( Fatorial(i) + " ");
        }
    }

}
