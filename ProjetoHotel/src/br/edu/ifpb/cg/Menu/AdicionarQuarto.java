package br.edu.ifpb.cg.Menu;
import br.edu.ifpb.cg.Exceptions.HotelExeptions;
import br.edu.ifpb.cg.Negocio.Hotel;
import br.edu.ifpb.cg.Negocio.QuartoMaster;
import br.edu.ifpb.cg.Negocio.QuartoSimples;
import java.util.Scanner;

public class AdicionarQuarto extends AbstractMenu {

    public AdicionarQuarto(Hotel hotel, Scanner input) {
        super(hotel, input);
    }

    @Override
    public boolean exibirMenu() throws HotelExeptions {

        Integer opcao = null;
        String menu = "";
        menu += "====================================" + ls;
        menu += "         Adicionar Quarto           " + ls;
        menu += "====================================" + ls;
        menu += "1. Quarto Master"  + ls;
        menu += "2. Quarto Simples" + ls;
        System.out.println(menu);

        Integer andar = null;
        Integer quantidadePessoas = null;
        Integer numero = null;

        opcao = obterValorInteger("Selecione o tipo: ");

        if (opcao == 1) {

            menu = "";
            menu += "====================================" + ls;
            menu += "           Quarto Master            " + ls;
            menu += "====================================" + ls;
            System.out.println(menu);
            numero = obterValorInteger("Número do Quarto: ");
            andar = obterValorInteger("Digite o andar: ");
            quantidadePessoas = obterValorInteger("Quantidade Máxima de Pessoas: ");
            boolean temHidromassagem = obterValorBoolean("Tem Hidromassagem? ");
            boolean temVistaMar = obterValorBoolean("Tem Vista P/ Mar? ");

            Long id = hotel.getGeradorId().obterProximoId();
            QuartoMaster quartoMaster = new QuartoMaster(id, numero, andar, quantidadePessoas, temHidromassagem, temVistaMar);

            hotel.adicionarQuarto(quartoMaster);


        } else {

            menu = "";
            menu += "====================================" + ls;
            menu += "           Quarto Simples           " + ls;
            menu += "====================================" + ls;
            System.out.println(menu);

            numero = obterValorInteger("Número do Quarto: ");
            andar = obterValorInteger("Digite o andar: ");
            quantidadePessoas = obterValorInteger("Quantidade Máxima de Pessoas: ");
            boolean ehDuplo = obterValorBoolean("É Dublo? ");
            boolean temAr = obterValorBoolean("Tem Arcondicionado: ");
            Long id = hotel.getGeradorId().obterProximoId();
            QuartoSimples quartoSimples = new QuartoSimples(id, numero, andar, quantidadePessoas, ehDuplo, temAr);
            hotel.adicionarQuarto(quartoSimples);

        }
        return false;
    }
}
