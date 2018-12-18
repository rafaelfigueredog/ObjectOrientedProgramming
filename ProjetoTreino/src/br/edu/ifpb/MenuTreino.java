package br.edu.ifpb;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MenuTreino {

    private Scanner in;

    public MenuTreino() {
        this.in = new Scanner(System.in);
    }

    public String obterValorString(String menssagemParaUsuario) {
        String valor = null;
        while (valor == null) {
            System.out.println(menssagemParaUsuario);
            String line = this.in.nextLine();
            valor = line;
        }
        return valor;
    }


    public Date obterValorDate(String menssagemParaUsuario) {
        Date valor = null;
        while (valor == null) {
            System.out.println(menssagemParaUsuario);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String line = this.in.nextLine();
            try {
                valor = sdf.parse(line);
            } catch (ParseException e) {
                System.err.println("Valor de Data Invalido, Tente Novamente.");
            }
        }
        return valor;
    }

}
