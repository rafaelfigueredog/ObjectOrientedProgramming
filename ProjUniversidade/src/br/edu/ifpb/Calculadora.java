package br.edu.ifpb;

public class Calculadora {


    public int somaNumeros(int... numeros) {
        int resultado = 0;
        for (int i : numeros) resultado += i;
        return resultado;
    }

}
