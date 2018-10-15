package br.edu.ifpb;

public class EstudanteTeste {

    public static void main(String[] args) {

        Estudante Rafael = new Estudante();
        Rafael.idade = 25;
        Rafael.matricula = 1000;
        Rafael.nome = "Rafael";
        Rafael.notas = new double[]{1.5,10.0,10.0};
        System.out.println(Rafael.toString());
        System.out.println(Rafael.media());

    }
}
