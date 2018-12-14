package br.edu.ifpb.cg.Menu;
import br.edu.ifpb.cg.Exceptions.HotelExeptions;
import br.edu.ifpb.cg.Negocio.Funcionario;
import br.edu.ifpb.cg.Negocio.Hospedagem;
import br.edu.ifpb.cg.Negocio.Hotel;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RelatorioRendaGerada extends AbstractMenu {

    public RelatorioRendaGerada(Hotel hotel, Scanner input) {
        super(hotel, input);
    }

    @Override
    public boolean exibirMenu() throws HotelExeptions {

        String menu = "";
        menu += "=====================================" + ls;
        menu += "Relatorio Renda Gerada (Funcionários)" + ls;
        menu += "=====================================" + ls;
        System.out.println(menu);



        Collection<Funcionario> funcionarios = hotel.getFuncionarios();
        Map<Funcionario, Double> relatorio = new HashMap<Funcionario, Double>();
        for (Funcionario funcionario: funcionarios) {
            relatorio.put(funcionario, 0.0 );
        }


        Collection<Hospedagem> hospedagems = hotel.getHospedagens();
        if (hospedagems.isEmpty()) {
            System.out.println("O Hotel está sem hospedagens. ");

        } else {

            for (Hospedagem hospedagem: hospedagems) {
                Funcionario funcionario = hospedagem.getFuncionario();
                Double valorAnterior = relatorio.get(funcionario);
                Double valorDaHospedagem = hospedagem.getValor(); 
                Double valorAtual = valorAnterior + valorDaHospedagem;
                relatorio.put(funcionario, valorAtual ); 
            }

            for ( Map.Entry<Funcionario, Double> entry: relatorio.entrySet() ) {
                Funcionario funcionario = entry.getKey();
                Double valor = entry.getValue();
                System.out.println(funcionario.getNome()+ ": R$ " + valor);
            }

        }

        return false;
    }
}
