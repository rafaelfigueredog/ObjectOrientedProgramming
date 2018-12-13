package br.edu.ifpb.cg.Menu;
import br.edu.ifpb.cg.Exceptions.HotelExeptions;
import br.edu.ifpb.cg.Negocio.Funcionario;
import br.edu.ifpb.cg.Negocio.Hotel;
import java.util.Scanner;

public class AdicionarFuncionario extends AbstractMenu {

    public AdicionarFuncionario(Hotel hotel, Scanner input) {
        super(hotel, input);
    }

    @Override
    public boolean exibirMenu() throws HotelExeptions {

        String menu = "" + ls;
        menu += "====================================" + ls;
        menu += "        Adicionar Funcionário       " + ls;
        menu += "====================================" + ls;
        System.out.println(menu);

        Long id = hotel.getGeradorId().obterProximoId();
        String nome = obterValorString("Digite o Nome: ");
        Long cpf = obterValorLong("Digite o CPF: ");
        Double salario = obterValorDouble("Digite o Salário: ");

        Funcionario funcionario = new Funcionario(id, nome, cpf, salario);
        hotel.adicionarFuncionario(funcionario);
        System.out.println("\nFuncionário adicionado!");
        return false;
    }
}
