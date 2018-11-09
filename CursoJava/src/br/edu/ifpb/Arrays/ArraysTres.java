package br.edu.ifpb.Arrays;

public class ArraysTres {

    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] numeros2 = {1,2,3,4,5,6};
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i <= j) matriz[i][j] = 1;
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
