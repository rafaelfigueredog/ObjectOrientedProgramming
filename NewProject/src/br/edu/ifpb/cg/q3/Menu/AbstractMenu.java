package br.edu.ifpb.cg.q3.Menu;
import br.edu.ifpb.cg.q3.Estoque;
import br.edu.ifpb.cg.q3.MinhaData;
import java.util.Scanner;

public abstract class AbstractMenu implements Menu {

    protected static final String ls = System.lineSeparator();
    protected Estoque stocks;
    protected Scanner input;

    public Estoque getStocks() {
        return stocks;
    }

    public void setStocks(Estoque stocks) {
        this.stocks = stocks;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public AbstractMenu(Estoque stocks, Scanner input) {
        this.stocks = stocks;
        this.input = input;
    }

    protected Integer obterValorInteger(String mensagemProUsuario) {
        Integer valor = null;
        while(valor == null) {
            System.out.print(mensagemProUsuario);
            try {
                String line = this.input.nextLine();
                valor = Integer.parseInt(line);
            } catch(NumberFormatException e) {
                System.out.println("Erro! Valor inválido. Tente novamente!");
            }
        }
        return valor;
    }

    protected Boolean obterValorBoolean(String mensagemProUsuario) {
        Boolean valor = null;
        while(valor == null) {
            System.out.print(mensagemProUsuario);
            String line = this.input.nextLine();
            if ("Sim".equalsIgnoreCase(line)) {
                line = "True";
            }
            valor = Boolean.parseBoolean(line);
        }
        return valor;
    }

    protected String obterValorString(String mensagemProUsuario) {
        String valor = null;
        while (valor == null) {
            System.out.print(mensagemProUsuario);
            String line = this.input.nextLine();
            valor = line;
        }
        return valor;
    }

    protected MinhaData obterData() {

        Integer dia = null;
        Integer mes = null;
        Integer ano = null;

        while (dia == null) {
            System.out.print("Digite o Dia: ");
            String line = this.input.nextLine();
            dia = Integer.parseInt(line);
        }

        while (mes == null) {
            System.out.print("Digite o Mês: ");
            String line = this.input.nextLine();
            mes = Integer.parseInt(line);
        }

        while (ano == null) {
            System.out.print("Digite o Ano: ");
            String line = this.input.nextLine();
            ano = Integer.parseInt(line);
        }

        MinhaData data = new MinhaData(dia, mes, ano);
        return data;
    }
}
