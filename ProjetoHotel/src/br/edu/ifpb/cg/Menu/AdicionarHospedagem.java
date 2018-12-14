package br.edu.ifpb.cg.Menu;
import br.edu.ifpb.cg.Exceptions.FuncionarioNãoEncontradoException;
import br.edu.ifpb.cg.Exceptions.HospedeNaoEncontradoException;
import br.edu.ifpb.cg.Exceptions.HotelExeptions;
import br.edu.ifpb.cg.Exceptions.QuartoNaoEncontradoException;
import br.edu.ifpb.cg.Negocio.*;

import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

public class AdicionarHospedagem extends AbstractMenu {

    public AdicionarHospedagem(Hotel hotel, Scanner input) {
        super(hotel, input);
    }

    @Override
    public boolean exibirMenu() throws HotelExeptions {


        String menu = "";
        menu += "====================================" + ls;
        menu += "         Adicionar Hospedagem       " + ls;
        menu += "====================================" + ls;
        System.out.println(menu);


        if ( hotel.getQuartos().isEmpty() ) {

            throw new HotelExeptions("Quartos indisponíveis");

        } else if ( hotel.getFuncionarios().isEmpty() ) {

            throw new HotelExeptions("Funcionários indisponíveis");

        } else if ( hotel.getHospedes().isEmpty() ) {

            throw new HotelExeptions("Favor, adicionar Hospede primeiro");

        } else {

            Long id;
            Quarto quartoSelecionado = null;
            Funcionario funcionarioSelecionado = null;
            Hospede hospedeSelecionado = null;
            Periodo periodo = null;
            Double valor = null;

            Collection<Quarto> quartos = hotel.getQuartos();
            for (Quarto quarto: quartos) {
                quarto.imprimirCompacto();
            }
            System.out.println();


            id = obterValorLong("Digite o ID do Quarto: ");
            for (Quarto quarto : quartos) {
                if (quarto.getId().equals(id)) {
                    quartoSelecionado = quarto;
                    break;
                }
            }

            Collection<Funcionario> funcionarios = hotel.getFuncionarios();
            for (Funcionario funcionario: funcionarios) {
                funcionario.imprimirCompacto();
            }


            id = obterValorLong("Digite o ID do Funcionario: ");
            for (Funcionario funcionario: funcionarios) {
                if (funcionario.getId().equals(id)) {
                    funcionarioSelecionado = funcionario;
                    break;
                }
            }

            Collection<Hospede> hospedes = hotel.getHospedes();
            for (Hospede hospede: hospedes) {
                hospede.imprimirCompacto();
            }

            id = obterValorLong("Digite o ID do Hospede: ");
            for (Hospede hospede: hospedes) {
                if ( hospede.getId().equals(id) ) {
                    hospedeSelecionado = hospede;
                    break;
                }
            }

            Date datainicial = obterValorDate("Data de Chegada: ");
            Date dataFinal = obterValorDate("Data de Saída: ");
            periodo = new Periodo(datainicial, dataFinal);
            valor = obterValorDouble("Digite o valor: ");

            id = hotel.getGeradorId().obterProximoId();
            try {
                Hospedagem hospedagem;
                hospedagem = new Hospedagem(id, quartoSelecionado, funcionarioSelecionado, hospedeSelecionado, periodo, valor);
                hotel.adicionarHopedagem(hospedagem);
            } catch (HotelExeptions e) {
                System.out.println(e.getMessage());
            }
        }
        return false;
    }
}
