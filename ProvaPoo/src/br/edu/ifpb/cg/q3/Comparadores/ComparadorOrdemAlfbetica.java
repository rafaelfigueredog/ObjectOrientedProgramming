package br.edu.ifpb.cg.q3.Comparadores;

import br.edu.ifpb.cg.q3.Produtos.Produto;

import java.util.Comparator;

public class ComparadorOrdemAlfbetica implements Comparator<Produto> {

    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }

}
