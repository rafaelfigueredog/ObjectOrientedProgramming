package br.edu.ifpb.Java.OrientaçãoAObjetosBasica.Banco;

public class Main {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Gul", "4182-010578650-3");
        ContaCorrente cca = new ContaCorrente("Duke", "4182-11157650-3");
        cc.depositar(100);
        cc.depositar(1000);
        System.out.println(cc.getSaldo());
        cc.sacar(500);
        System.out.println(cc.getSaldo());
        cc.sacar(601);
        System.out.println(cc.getSaldo());
        cc.transferir(cca, 30);
        System.out.println("Saldo Conta 1: " + cc.getSaldo());
        System.out.println("Saldo Conta 2: " + cca.getSaldo());

    }
}
