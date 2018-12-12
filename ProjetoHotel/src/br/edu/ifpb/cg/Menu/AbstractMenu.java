package br.edu.ifpb.cg.Menu;
import br.edu.ifpb.cg.Negocio.Hotel;

import java.util.Scanner;

public abstract class AbstractMenu implements Menu {

    protected static final String ls = System.lineSeparator();
    protected Hotel hotel;
    protected Scanner input;


    public AbstractMenu(Hotel hotel, Scanner input) {
        this.hotel = hotel;
        this.input = input;
    }

    public static String getLs() {
        return ls;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
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

    protected Long obterValorLong(String mensagemProUsuario) {
        Long valor = null;
        while(valor == null) {
            System.out.print(mensagemProUsuario);
            try {
                String line = this.input.nextLine();
                valor = Long.parseLong(line);
            } catch(NumberFormatException e) {
                System.out.println("Erro! Valor inválido. Tente novamente!");
            }
        }
        return valor;
    }

}
