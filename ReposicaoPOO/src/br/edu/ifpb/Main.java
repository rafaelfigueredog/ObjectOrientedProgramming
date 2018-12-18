package br.edu.ifpb;

import br.edu.ifpb.Negocio.Locadora;

public class Main {

    public static void main(String[] args) throws Exception {

        Armazenamento armazenamento = new Armazenamento("locadora.ser");
        GeradorID geradorID = new GeradorID();
        Locadora locadora = armazenamento.recuperar(geradorID);
        boolean continuarExecucao = true;

        MenuPrincipal menuPrincipal = new MenuPrincipal(locadora);
        while ( continuarExecucao ) {
          try {
              continuarExecucao = menuPrincipal.exibirMenu();
          } catch (LocadoraException e) {
              System.out.println();
              System.err.println(e.getMessage());
              System.out.println();
          } finally {
              armazenamento.salvar(locadora);
          }
        }
    }
}
