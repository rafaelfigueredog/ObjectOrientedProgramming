package br.edu.ifpb;

import java.util.Arrays;

public class Estudante {

    public String nome;
    public int matricula;
    public int idade;
    public double[] notas;


    public String media() {
        double media = 0d;
        for (int i = 0; i < 3; i++) {
            media += this.notas[i];
        }
        media = media / 3.0;

        if (media < 7) {
            return "Reprovado";
        } else {
            return "Aprovado";
        }
    }

    @Override
    public String toString() {
        return "Estudante:" +
                "\nnome: " + nome +
                "\nmatricula: " + matricula +
                "\nidade: " + idade +
                "\nnotas: " + Arrays.toString(notas);
    }
}
