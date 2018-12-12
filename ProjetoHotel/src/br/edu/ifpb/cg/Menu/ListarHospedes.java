package br.edu.ifpb.cg.Menu;

import br.edu.ifpb.cg.Exceptions.HotelExeptions;
import br.edu.ifpb.cg.Negocio.Hotel;

import java.util.Scanner;

public class ListarHospedes extends AbstractMenu {

    public ListarHospedes(Hotel hotel, Scanner input) {
        super(hotel, input);
    }

    @Override
    public boolean exibirMenu() throws HotelExeptions {
        return false;
    }
}
