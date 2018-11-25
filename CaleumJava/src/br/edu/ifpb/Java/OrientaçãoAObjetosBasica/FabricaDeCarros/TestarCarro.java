package br.edu.ifpb.Java.OrientaçãoAObjetosBasica.FabricaDeCarros;

public class TestarCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.cor = "Branco";
        carro.modelo = "Celta";
        carro.velocidadeAtual = 0;
        carro.velocidadeMaxima = 80;

        carro.liga();
        carro.acelera(41);
        System.out.println(carro.pegaMarcha());
        System.out.println(carro.velocidadeAtual);
    }
}
