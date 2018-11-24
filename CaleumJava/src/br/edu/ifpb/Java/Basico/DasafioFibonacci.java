package br.edu.ifpb.Java.Basico;

import java.util.Scanner;

public class DasafioFibonacci {

    public static int Fibonacci (int n) {
        return n < 2 ? n : Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int s = in.nextInt();

        for (int i = 0; i < s; i++) {
            System.out.print( Fibonacci(i) + " ");
        }


    }

}
