package br.edu.ifpb;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Interface {

    public static void menu() {

        byte dia;
        String[] dias = {"Domingo", "Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado"};
        Scanner in = new Scanner(System.in);

        System.out.println("    Bem Vindo!   ");
        System.out.println("-----------------");

        System.out.println("1 - Domingo\n" +
                "2 - Segunda-Feira\n" +
                "3 - Terça-Feira\n" +
                "4 - Quarta-Feira\n" +
                "5 - Quinta-feira\n" +
                "6 - Sexta-Feira\n" +
                "7 - Sábado\n");
        System.out.print("Selecione o Dia: ");
        dia = in.nextByte();
        try {

        } catch (ArrayIndexOutOfBoundsException o) {
            o.printStackTrace();
        }




    }
}
