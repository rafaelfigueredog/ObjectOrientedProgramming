package br.edu.ifpb.cg;
import br.edu.ifpb.cg.Armazenamento.Armazenamento;
import br.edu.ifpb.cg.Exceptions.HotelExeptions;
import br.edu.ifpb.cg.GeradorId.GeradorId;
import br.edu.ifpb.cg.GeradorId.GeradorIdNanoTime;
import br.edu.ifpb.cg.Menu.MenuPrincipal;
import br.edu.ifpb.cg.Negocio.Hotel;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Armazenamento armazenamento = new Armazenamento("Hotel.ser");
        GeradorId geradorId = null;
        geradorId = new GeradorIdNanoTime();

        Hotel hotel = armazenamento.recuperar(geradorId);
        Scanner input = new Scanner(System.in);
        MenuPrincipal menuPrincipal = new MenuPrincipal(hotel, input);

        boolean continuarExecutando = true;
        while (continuarExecutando) {
            try {
                continuarExecutando = menuPrincipal.exibirMenu();
            } catch (HotelExeptions e) {
                System.out.println();
                System.out.println(e.getMessage());
                System.out.println();
            } finally {
                armazenamento.armazenar(hotel);
            }
        }
    }
}
