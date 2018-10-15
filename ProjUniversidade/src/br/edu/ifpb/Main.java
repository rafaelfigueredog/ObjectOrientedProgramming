package br.edu.ifpb;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "chevrolet";
        carro1.modelo = "Celta";
        carro1.placa = "MYX - 8616";

        System.out.println(carro1.marca);
        System.out.println(carro1.modelo);
        System.out.println(carro1.placa);
    }
}
