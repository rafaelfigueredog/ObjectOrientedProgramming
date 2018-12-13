package br.edu.ifpb.cg.Menu;
import br.edu.ifpb.cg.Exceptions.HotelExeptions;
import br.edu.ifpb.cg.Negocio.Hospede;
import br.edu.ifpb.cg.Negocio.Hotel;
import java.util.Date;
import java.util.Scanner;

public class AdicionarHospede extends AbstractMenu {

    public AdicionarHospede(Hotel hotel, Scanner input) {
        super(hotel, input);
    }

    @Override
    public boolean exibirMenu() throws HotelExeptions {

        String menu = "";
        menu += "====================================" + ls;
        menu += "         Adicionar Hospede          " + ls;
        menu += "====================================" + ls;
        System.out.println(menu);


        Long id = hotel.getGeradorId().obterProximoId();
        String nome = obterValorString("Nome: ");
        Long cpf = obterValorLong("CPF: ");
        Date data = obterValorDate("Data de Nascimento: ");
        Hospede hospede = new Hospede(id, nome, cpf, data);
        hotel.adicionarHospede(hospede);
        System.out.println("\nHospede adicionado!");

        return false;
    }
}
