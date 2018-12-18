package br.edu.ifpb.cg;
import br.edu.ifpb.cg.q1.GeradorId;
import br.edu.ifpb.cg.q2.Armazenamento;
import br.edu.ifpb.cg.q2.Imobiliaria;
import br.edu.ifpb.cg.q2.Menu;

public class Main {

    public static void main(String[] args) {

        GeradorId geradorId = new GeradorId();
        Armazenamento armazenamento = new Armazenamento();
        Imobiliaria imobiliaria = armazenamento.recuperar("imobiliaria.ser");
        Menu menuPricipal = new Menu();
        boolean continuar = true;
        while (continuar) {
            continuar = menuPricipal.exibirMenu(imobiliaria);
        }
        armazenamento.armazenar(imobiliaria, "imobiliaria.ser");



    }
}
