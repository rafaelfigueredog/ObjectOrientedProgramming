package br.edu.ifpb.cg.Menu;

import br.edu.ifpb.cg.Exceptions.HotelExeptions;
import br.edu.ifpb.cg.Negocio.Hospede;
import br.edu.ifpb.cg.Negocio.Hotel;

import java.util.Collection;
import java.util.Scanner;

public class ListarHospedes extends AbstractMenu {

    public ListarHospedes(Hotel hotel, Scanner input) {
        super(hotel, input);
    }

    @Override
    public boolean exibirMenu() throws HotelExeptions {

        String menu = "";
        menu += "====================================" + ls;
        menu += "           Listar Hospedes          " + ls;
        menu += "====================================" + ls;
        System.out.println(menu);


        Collection<Hospede> hospedes = hotel.getHospedes();
        if (hospedes.isEmpty()) {

            System.out.println("O Hotel está sem hospedes. ");

        } else {
            for (Hospede hospede: hospedes) {
                System.out.println(hospede.imprimir());
            }
        }

        return false;
    }
}
