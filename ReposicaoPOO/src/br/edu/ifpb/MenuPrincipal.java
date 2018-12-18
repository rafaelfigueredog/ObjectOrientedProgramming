package br.edu.ifpb;
import br.edu.ifpb.Negocio.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

public class MenuPrincipal {

    private static final Long SerialVersionUID = 1L;
    private static final String ls = System.lineSeparator();
    private Scanner input;
    private Locadora locadora;

    public MenuPrincipal(Locadora locadora) {
        this.locadora = locadora;
        this.input = new Scanner(System.in);
    }

    public boolean exibirMenu() throws LocadoraException {

        while ( true ) {

            exibirTituloMenu("Menu Principal");
            exibirOpcoes();
            int opcaoEscolhida = obterOpcaoEscolhida("Digite a Opcao: " );

            switch (opcaoEscolhida) {
                case 1:
                    listarClientes(true, "Listar Clientes");
                    break;
                case 2:
                    listarFuncionarios(true, "Listar Funcionarios");
                    break;
                case 3:
                    listarMidias(true, "Listar Midias");
                    break;
                case 4:
                    listarLocacoes(true, "Listar Locações");
                    break;
                case 5:
                    adicionarDVDFilme("Adicionar DVD");
                    break;
                case 6:
                    adicionarBlurayFilme("Adicionar BluRay");
                    break;
                case 7:
                    adicionarCDMusica("Adicionar CD");
                    break;
                case 8:
                    adicionarCliente("Adicionar Cliente");
                    break;
                case 9:
                    adicionarFuncionario("Adicionar Funcionario");
                    break;
                case 10:
                    alugarMidia("Alugar Midia");
                    break;
                case 11:
                    devolverMidia("Devolver Midia");
                    break;
                case 12:
                    removerCliente("Remover Cliente");
                    break;
                case 13:
                    removerFuncionario("Remover Funcionario");
                    break;
                case 14:
                    removerMidia("Remover Midia");
                    break;
                case 15:
                    removerLocacao("Remover Locação");
                    break;
                case 16:
                    break;
                case 17:
                    return false;
                default:
                    System.err.println("Opcao Invalida");
                    break;
            }
        }

    }

    public void devolverMidia(String tituloMenu) throws LocadoraException {

        exibirTituloMenu(tituloMenu);
        this.listarLocacoes(false, "Locações");
        Long idLocacao = obterValorLong("Digite ID Locacao: ");
        Double multa = obterValorDouble("Valor da Multa: ");
        Boolean gostou = obterValorBoolean("Gostou do Filme? ");
        Locacao locacao = this.locadora.buscarLocacao(idLocacao);
        locacao.setGostou(gostou);
        locacao.setValorMulta(multa); // a instacia nao foi alterada dentro da locadora porque nção deu tempo

    }


    public void alugarMidia(String tituloMenu) throws LocadoraException {

        exibirTituloMenu(tituloMenu);

        this.listarClientes(false, "Clientes");
        Long idCliente = obterValorLong("Digite ID Cliente: ");

        this.listarFuncionarios(false, "Funcionarios");
        Long idFuncionario = obterValorLong("Digite ID Funcionario: ");

        this.listarMidias(false, "Midias");
        Long idMidia = obterValorLong("Digite ID Midia");

        Double valorDoAluguel = obterValorDouble("Valor R$: ");
        Date dataInicial = obterValorDate("Data do Aluguel: ");
        Date dataFinal = obterValorDate("Data Devolucao: ");
        Periodo periodo = new Periodo(dataInicial, dataFinal);
        Cliente cliente = locadora.buscarCliente(idCliente);
        Midia midia = locadora.buscarMidia(idMidia);
        Funcionario funcionario = locadora.buscarFuncionario(idFuncionario);
        Locacao locacao = new Locacao(cliente, funcionario, midia, valorDoAluguel, periodo);
        this.locadora.adicionarLocacao(locacao);
    }

    public void removerMidia(String tituloMenu) throws IDNaoEncontradoException {
        exibirTituloMenu(tituloMenu);
        Long id = obterValorLong("Digite o ID: ");
        this.locadora.removerMidia(id);
    }

    public void removerCliente(String tituloMenu) throws IDNaoEncontradoException {
        exibirTituloMenu(tituloMenu);
        Long id = obterValorLong("Digite o ID: ");
        this.locadora.removerCliente(id);
    }

    public void removerFuncionario(String tituloMenu) throws IDNaoEncontradoException {
        exibirTituloMenu(tituloMenu);
        Long id = obterValorLong("Digite o ID: ");
        this.locadora.removerFuncionario(id);
    }
    public void removerLocacao(String tituloMenu) throws IDNaoEncontradoException {
        exibirTituloMenu(tituloMenu);
        Long id = obterValorLong("Digite o ID: ");
        this.locadora.removerLocacao(id);
    }

    public void listarLocacoes(boolean tiulo, String tituloMenu){

        if (tiulo)  {
            exibirTituloMenu(tituloMenu);
        }
        Collection<Locacao> locacoes = this.locadora.getLocacoes();
        if (locacoes.isEmpty()) {
            System.out.println("Locadora não possui Locacoes");
        }
        else {
            for (Locacao locacao : locacoes) {
                System.out.println(locacao.toString());
            }
        }
    }

    public void listarClientes(boolean tiulo, String tituloMenu){

        if (tiulo)  {
            exibirTituloMenu(tituloMenu);
        }
        Collection<Cliente> clientes = this.locadora.getClientes();
        if (clientes.isEmpty()) {
            System.out.println("Locadora não possui Clientes");
        }
        else {
            for (Cliente cliente : clientes) {
                cliente.show();
            }
        }
    }

    public void listarFuncionarios(boolean tiulo, String tituloMenu){

        if (tiulo)  {
            exibirTituloMenu(tituloMenu);
        }
        Collection<Funcionario> funcionarios = this.locadora.getFuncionarios();
        if (funcionarios.isEmpty()) {
            System.out.println("Locadora não possui Funcionarios");
        }
        else {
            for (Funcionario funcionario: funcionarios) {
                funcionario.show();
            }
        }
    }

    public void listarMidias(boolean tiulo, String tituloMenu) {

        if (tiulo)  {
            exibirTituloMenu(tituloMenu);
        }

        Collection<Midia> midias = this.locadora.getMidias();
        if (midias.isEmpty()) {
            System.out.println("Locadora não possui Midias");
        }
        else {
            for (Midia midia: midias) {
                midia.show();
            }
        }
    }

    public void exibirTituloMenu(String titulo) {

        String cabecario = "";
        cabecario += "---------------------------------------" + ls;
        cabecario += "             "+titulo                    + ls;
        cabecario += "---------------------------------------" + ls;
        System.out.println(cabecario);
    }
    public void exibirOpcoes() {
        int opcao = 0;
        String menuOpcoes = "";
        menuOpcoes += ++opcao + ". Listar Clientes" + ls;
        menuOpcoes += ++opcao + ". Listar Funcionarios" + ls;
        menuOpcoes += ++opcao + ". Listar Midias" + ls;
        menuOpcoes += ++opcao + ". Listar Locacoes" + ls;
        menuOpcoes += ++opcao + ". Adicionar DVD/Filme" + ls;
        menuOpcoes += ++opcao + ". Adicionar Bluray/Filme" + ls;
        menuOpcoes += ++opcao + ". Adicionar CD/Musica" + ls;
        menuOpcoes += ++opcao + ". Adicionar Cliente" + ls;
        menuOpcoes += ++opcao + ". Adicionar Funcionario" + ls;
        menuOpcoes += ++opcao + ". Alugar Midia" + ls;
        menuOpcoes += ++opcao + ". Devolver Midia" + ls;
        menuOpcoes += ++opcao + ". Remover Clientes" + ls;
        menuOpcoes += ++opcao + ". Remover Funcionario" + ls;
        menuOpcoes += ++opcao + ". Remover Midias" + ls;
        menuOpcoes += ++opcao + ". Remover Locaçoes" + ls;
        menuOpcoes += ++opcao + ". Relatorio Receita da Locadora" + ls;
        menuOpcoes += ++opcao + ". Sair" + ls;
        System.out.println(menuOpcoes);
    }

    public void adicionarFuncionario(String tituloMenu){

        exibirTituloMenu(tituloMenu);

        String nome = obterValorString("Nome: ");
        Long cpf = obterValorLong("CPF: ");
        Double salario = obterValorDouble("Salario: ");
        Funcionario funcionario = new Funcionario(nome, cpf, salario);
        this.locadora.adicionarFuncionario(funcionario);

    }

    public void adicionarCliente(String tituloMenu){

        exibirTituloMenu(tituloMenu);

        String nome = obterValorString("Nome: ");
        Long cpf = obterValorLong("CPF: ");
        String endereco = obterValorString("Endereço: ");
        Cliente cliente = new Cliente(nome, cpf, endereco);
        this.locadora.adicionarCliente(cliente);


    }

    public void adicionarCDMusica(String tituloMenu) {

        exibirTituloMenu(tituloMenu);

        String titulo = obterValorString("Titulo: ");
        Integer duracao = obterValorInteger("Duracao: ");
        Integer anoLancamento = obterValorInteger("Ano: ");
        Integer quantidadeDeFaixas = obterValorInteger("Qtde. Faixas: ");
        CD cd = new CD(titulo, duracao, anoLancamento, quantidadeDeFaixas);
        this.locadora.adicionarMidia(cd);
    }

    public void adicionarBlurayFilme(String tituloMenu) {

        exibirTituloMenu(tituloMenu);

        String titulo = obterValorString("Titulo: ");
        Integer duracao = obterValorInteger("Duracao: ");
        Integer anoLancamento = obterValorInteger("Ano: ");
        Boolean conteudoExtra = obterValorBoolean("Conteudo Extra? ");
        Boolean eh3D = obterValorBoolean("3D? ");
        BluRay bluRay = new BluRay(titulo, duracao, anoLancamento, conteudoExtra, eh3D);
        this.locadora.adicionarMidia(bluRay);

    }

    public void adicionarDVDFilme(String tituloMenu) {

        exibirTituloMenu(tituloMenu);

        String titulo = obterValorString("Titulo: ");
        Integer duracao = obterValorInteger("Duracao: ");
        Integer anoLancamento = obterValorInteger("Ano: ");
        Boolean conteudoExtra = obterValorBoolean("Conteudo Extra? ");
        DVD dvd = new DVD(titulo, duracao, anoLancamento, conteudoExtra);
        this.locadora.adicionarMidia(dvd);
    }

    public Boolean obterValorBoolean(String messagemUsuario) {
        Boolean valor = null;
        while (valor == null)  {
            System.out.print(messagemUsuario);
            String line = this.input.nextLine();
            if ( line.equals("Sim") ) valor = true;
            else if (line.equals("sim")) valor = true;
            else if (line.equals("SIM")) valor = true;
            else valor = false;
        }
        return valor;
    }

    public Date obterValorDate(String messagemUsuario) {
        Date valor = null;
        while ( valor == null ) {
            System.out.print(messagemUsuario);
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                String line = this.input.nextLine();
                valor = sdf.parse(line);
            } catch (ParseException e ) {
                System.err.println("Valor Invalido Tente Novamente");
            }
        }
        return valor;
    }

    public int obterOpcaoEscolhida(String messagemUsuario) {
        Integer valor = null;
        while ( valor == null ) {
            System.out.print(messagemUsuario);
            try {
                String line = this.input.nextLine();
                valor = Integer.parseInt(line);
            } catch (NumberFormatException e ) {
                System.err.println("Valor Invalido Tente Novamente");
            }
        }
        return valor;
    }

    public String obterValorString(String messagemUsuario) {
        String valor = null;
        while ( valor == null ) {
            System.out.print(messagemUsuario);
            String line = this.input.nextLine();
            valor = line;
        }
        return valor;
    }

    public Integer obterValorInteger(String messagemUsuario) {
        Integer valor = null;
        while ( valor == null ) {
            System.out.print(messagemUsuario);
            try {
                String line = this.input.nextLine();
                valor = Integer.parseInt(line);
            } catch (NumberFormatException e ) {
                System.err.println("Valor Invalido Tente Novamente");
            }
        }
        return valor;
    }

    public Double obterValorDouble(String messagemUsuario) {
        Double valor = null;
        while ( valor == null ) {
            System.out.print(messagemUsuario);
            try {
                String line = this.input.nextLine();
                valor = Double.parseDouble(line);
            } catch (NumberFormatException e ) {
                System.err.println("Valor Invalido Tente Novamente");
            }
        }
        return valor;
    }

    public Long obterValorLong(String messagemUsuario) {
        Long valor = null;
        while ( valor == null ) {
            System.out.print(messagemUsuario);
            try {
                String line = this.input.nextLine();
                valor = Long.parseLong(line);
            } catch (NumberFormatException e ) {
                System.err.println("Valor Invalido Tente Novamente");
            }
        }
        return valor;
    }



}
