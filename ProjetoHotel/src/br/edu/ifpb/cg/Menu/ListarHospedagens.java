package br.edu.ifpb.cg.Menu;

import br.edu.ifpb.cg.Exceptions.HotelExeptions;
import br.edu.ifpb.cg.Negocio.Hospedagem;
import br.edu.ifpb.cg.Negocio.Hospede;
import br.edu.ifpb.cg.Negocio.Hotel;

import java.util.Collection;
import java.util.Scanner;

public class ListarHospedagens extends AbstractMenu {

    public ListarHospedagens(Hotel hotel, Scanner input) {
        super(hotel, input);
    }

    @Override
    public boolean exibirMenu() throws HotelExeptions {


        String menu = "";
        menu += "====================================" + ls;
        menu += "           Listar Hospedagens       " + ls;
        menu += "====================================" + ls;
        System.out.println(menu);


        Collection<Hospedagem> hospedagems = hotel.getHospedagens();
        if (hospedagems.isEmpty()) {

            System.out.println("O Hotel está sem hospedagens. ");

        } else {
            for (Hospedagem hospedagem: hospedagems) {
                System.out.println(hospedagem.imprimir());
            }
        }


        return false;
    }
}
