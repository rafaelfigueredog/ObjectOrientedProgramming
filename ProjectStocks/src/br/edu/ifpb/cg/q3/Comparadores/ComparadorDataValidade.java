package br.edu.ifpb.cg.q3.Comparadores;
import br.edu.ifpb.cg.q3.Produtos.Produto;
import java.util.Comparator;

public class ComparadorDataValidade implements Comparator<Produto> {


    @Override
    public int compare(Produto o1, Produto o2) {

        Integer ano1 = o1.getDataValidade().getAno();
        Integer ano2 = o2.getDataValidade().getAno();

        Integer mes1 = o1.getDataValidade().getMes();
        Integer mes2 = o2.getDataValidade().getMes();

        Integer dia1 = o1.getDataValidade().getDia();
        Integer dia2 = o2.getDataValidade().getDia();

        if (ano1.compareTo(ano2) == 0) {
            if (mes1.compareTo(mes2) == 0) {
                if (dia1.compareTo(dia2) == 0) {
                    return  0;
                } else {
                    return dia1.compareTo(dia2);
                }
            } else {
                return mes1.compareTo(mes2);
            }
        } else {
            return ano1.compareTo(ano2);
        }
    }
}
