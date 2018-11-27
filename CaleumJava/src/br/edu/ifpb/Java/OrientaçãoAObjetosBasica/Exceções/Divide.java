package br.edu.ifpb.Java.OrientaçãoAObjetosBasica.Exceções;

public class Divide {

    public static void divide (int a, int b) {
        try {
            int c = a/b;
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        divide(3,0);
    }

}
