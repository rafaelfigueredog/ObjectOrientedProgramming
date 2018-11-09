package br.edu.ifpb;

import java.util.ArrayList;

public class CheckList {

    private String dia;
    private ArrayList<String> produtosEscolhidos;

    public CheckList(String dia) {
        setDia(dia);
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
}
