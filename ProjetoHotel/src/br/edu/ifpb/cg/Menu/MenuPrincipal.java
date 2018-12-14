package br.edu.ifpb.cg.Menu;
import br.edu.ifpb.cg.Exceptions.FuncionarioNãoEncontradoException;
import br.edu.ifpb.cg.Exceptions.HotelExeptions;
import br.edu.ifpb.cg.Negocio.Hotel;
import java.util.Scanner;

public class MenuPrincipal extends AbstractMenu {

    private AdicionarQuarto adicionarQuarto;
    private AdicionarFuncionario adicionarFuncionario;
    private AdicionarHospede adicionarHospede;
    private AdicionarHospedagem adicionarHospedagem;
    private ListarQuartos listarQuartos;
    private ListarFuncionarios listarFuncionarios;
    private ListarHospedes listarHospedes;
    private ListarHospedagens listarHospedagens;
    private RelatorioRendaGerada relatorioRendaGerada;
    private RelatorioHospedagens relatorioHospedagens;
    private RelatorioValores relatorioValores;

    public MenuPrincipal(Hotel hotel, Scanner input) {
        super(hotel, input);
        this.adicionarQuarto = new AdicionarQuarto(hotel, input);
        this.adicionarFuncionario = new AdicionarFuncionario(hotel, input);
        this.adicionarHospede = new AdicionarHospede(hotel, input);
        this.adicionarHospedagem = new AdicionarHospedagem(hotel, input);
        this.listarQuartos = new ListarQuartos(hotel, input);
        this.listarFuncionarios = new ListarFuncionarios(hotel, input);
        this.listarHospedes = new ListarHospedes(hotel, input);
        this.listarHospedagens = new ListarHospedagens(hotel, input);
        this.relatorioRendaGerada = new RelatorioRendaGerada(hotel, input);
        this.relatorioHospedagens = new RelatorioHospedagens(hotel, input);
        this.relatorioValores = new RelatorioValores(hotel, input);
    }


    @Override
    public boolean exibirMenu() throws HotelExeptions {

         byte opcao = 0;
         String menu = "" + ls;

        menu += "====================================" + ls;
        menu += "            Menu Principal          " + ls;
        menu += "====================================" + ls;
        menu += ++opcao + ". Adicionar Quarto" + ls;
        menu += ++opcao + ". Adicionar Funcionário" + ls;
        menu += ++opcao + ". Adicionar Hóspede" + ls;
        menu += ++opcao + ". Adicionar Hospedagem" + ls;
        menu += ++opcao + ". Listar Quartos" + ls;
        menu += ++opcao + ". Listar Funcionários" + ls;
        menu += ++opcao + ". Listar Hóspedes" + ls;
        menu += ++opcao + ". Listar Hospedagens" + ls;
        menu += ++opcao + ". Rel. Renda Gerada (Funcionários)" + ls;
        menu += ++opcao + ". Rel. de Hóspede (Qtde. Hospedagens)" + ls;
        menu += ++opcao + ". Rel. de Hóspede (Soma Valor)" + ls;
        menu += ++opcao + ". Sair" + ls;

        while (true) {
            System.out.println(menu);
            int opcaoEscolhida = obterValorInteger("Digite a opção: ");
            Menu menuSelecionado = null;
            switch (opcaoEscolhida) {
                case 1:
                    menuSelecionado = this.adicionarQuarto;
                    break;
                case 2:
                    menuSelecionado = this.adicionarFuncionario;
                    break;
                case 3:
                    menuSelecionado = this.adicionarHospede;
                    break;
                case 4:
                    menuSelecionado = this.adicionarHospedagem;
                    break;
                case 5:
                    menuSelecionado = this.listarQuartos;
                    break;
                case 6:
                    menuSelecionado = this.listarFuncionarios;
                    break;
                case 7:
                    menuSelecionado = this.listarHospedes;
                    break;
                case 8:
                    menuSelecionado = this.listarHospedagens;
                    break;
                case 9:
                    menuSelecionado = this.relatorioRendaGerada;
                    break;
                case 10:
                    menuSelecionado = this.relatorioHospedagens;
                    break;
                case 11:
                    menuSelecionado = this.relatorioValores;
                    break;
                case 12:
                    return false;
                default:
                    System.out.println();
                    System.out.println("Erro! Opção invalida: " + opcaoEscolhida);
                    System.out.println();
                    break;
            }
            if (menuSelecionado != null) {
                menuSelecionado.exibirMenu();
            }
        }
    }
}
