package br.edu.ifpb.Arrays;

public class Matriz {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = j+i;
                System.out.printf(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
