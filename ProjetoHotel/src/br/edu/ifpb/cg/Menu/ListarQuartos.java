package br.edu.ifpb.cg.Menu;
import br.edu.ifpb.cg.Exceptions.HotelExeptions;
import br.edu.ifpb.cg.Negocio.Hotel;
import br.edu.ifpb.cg.Negocio.Quarto;
import java.util.Collection;
import java.util.Scanner;

public class ListarQuartos extends AbstractMenu {

    public ListarQuartos(Hotel hotel, Scanner input) {
        super(hotel, input);
    }

    @Override
    public boolean exibirMenu() throws HotelExeptions {
        String menu = "";
        menu += "====================================" + ls;
        menu += "            Listar Quartos          " + ls;
        menu += "====================================" + ls;
        System.out.println(menu);

        Collection<Quarto> quartos = hotel.getQuartos();
        if (quartos.isEmpty()) {

            System.out.println("Sem quartos Disponiveis");

        } else {
            for (Quarto quarto: quartos) {
                System.out.println(quarto.imprimir());
            }
        }


        return false;
    }
}
