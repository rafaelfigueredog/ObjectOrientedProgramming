package br.edu.ifpb;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] lista = new int[3];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String valor = in.nextLine();
            try {
                int v = Integer.parseInt(valor);
                lista[i] = v;

            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Digite indice do Array:");

        try {
            int i = in.nextInt();
            System.out.println(lista[i]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException");
        }
    }
}
