package br.edu.ifpb.cg.Menu;

import br.edu.ifpb.cg.Exceptions.HotelExeptions;
import br.edu.ifpb.cg.Negocio.Funcionario;
import br.edu.ifpb.cg.Negocio.Hotel;

import java.util.Collection;
import java.util.Scanner;

public class ListarFuncionarios extends AbstractMenu {

    public ListarFuncionarios(Hotel hotel, Scanner input) {
        super(hotel, input);
    }

    @Override
    public boolean exibirMenu() throws HotelExeptions {

        String menu = "";
        menu += "====================================" + ls;
        menu += "          Listar Funcionários       " + ls;
        menu += "====================================" + ls;
        System.out.println(menu);

        Collection<Funcionario> funcionarios = hotel.getFuncionarios();
        if (funcionarios.isEmpty()) {

            System.out.println("O Hotel está sem funcionarios. ");

        } else {
            for (Funcionario funcionario: funcionarios) {
                System.out.println(funcionario.imprimir());
            }
        }

        return false;
    }
}
