package br.edu.ifpb.Java.OrientaçãoAObjetosBasica;

public class Main {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Rafael", "4182-01057650-3");
        cc.depositar(100);
        cc.depositar(1000);
        System.out.println(cc.getSaldo());
        cc.sacar(500);
        System.out.println(cc.getSaldo());
        cc.sacar(601);
        System.out.println(cc.getSaldo());
        System.out.println(cc.getNome());
        System.out.println(cc.getNumero());
    }
}
