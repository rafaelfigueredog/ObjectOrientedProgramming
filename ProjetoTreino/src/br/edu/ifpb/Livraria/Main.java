package br.edu.ifpb.Livraria;

public class Main {

    public static void main(String[] args) throws Exception {

        Armazenamento armazenamento = new Armazenamento("livraria.ser");
        GeradorID geradorID = new GeradorID();
        Livraria livraria = armazenamento.recuperar(geradorID);
        boolean continuarExecucao = true;
        MenuPrincipal menuPrincipal = new MenuPrincipal(livraria);
        while (continuarExecucao) {
            try {
                continuarExecucao = menuPrincipal.exibirMenu();
            } catch (LivrariaException e) {
                System.out.println();
                System.out.println(e.getMessage());
                System.out.println();
            } finally {
                armazenamento.salvar(livraria);
            }
        }
    }
}
