package br.edu.ifpb.Java.OrientaçãoAObjetosBasica.Exceções;

import br.edu.ifpb.Java.OrientaçãoAObjetosBasica.Banco.ContaCorrente;

class TesteErro {

    public static void main(String[] args) {
        System.out.println("inicio do main");
        metodo1();
        System.out.println("fim do main");
    }
    static void metodo1() {
        System.out.println("inicio do metodo1");
        try {
            metodo2();
        } catch (NullPointerException e) {
            System.out.println("Erro: " + e);
        }
        System.out.println("fim do metodo1");
    }
    static void metodo2() {
        System.out.println("inicio do metodo2");
        ContaCorrente cc = new ContaCorrente();
        for (int i = 0; i <= 15; i++) {
            cc.depositar((double) i + 1000);
            System.out.println(cc.getSaldo());
            if (i == 5) {
                cc = null;
            }
        }
        System.out.println("fim do metodo2");
    }
}