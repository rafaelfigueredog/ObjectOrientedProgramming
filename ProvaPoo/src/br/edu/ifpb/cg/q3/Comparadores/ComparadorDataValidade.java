package br.edu.ifpb.cg.q3.Comparadores;
import br.edu.ifpb.cg.q3.Produtos.Produto;
import java.util.Comparator;

public class ComparadorDataValidade implements Comparator<Produto> {
    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.getDataValidade().compareTo(o2.getDataValidade());
    }
}
