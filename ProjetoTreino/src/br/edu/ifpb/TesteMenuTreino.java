package br.edu.ifpb;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteMenuTreino {

    public static void main(String[] args) {

        MenuTreino menuTreino = new MenuTreino();

        Date date = menuTreino.obterValorDate("Digite a Data no Formato: dd/MM/yyyy");
        String str = menuTreino.obterValorString("Digite a String: ");
        SimpleDateFormat sdf = new SimpleDateFormat(" dd/MM/yyyy hh:mm:ss");
        System.out.println(sdf.format(date));
        System.out.println(str);
    }

}
