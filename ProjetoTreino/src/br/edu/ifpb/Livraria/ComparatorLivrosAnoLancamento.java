package br.edu.ifpb.Livraria;
import java.util.Comparator;

public class ComparatorLivrosAnoLancamento implements Comparator<Livro> {

    @Override
    public int compare(Livro o1, Livro o2) {
        return o1.getLancamento().compareTo(o2.getLancamento());
    }

}
