package br.edu.ifpb.menu;

import java.util.Scanner;

import br.edu.ifpb.dominio.Zoologico;
import br.edu.ifpb.exceptions.ZooException;

public class MenuSobre extends AbstractMenu implements Menu {

	public MenuSobre(Zoologico zoo, Scanner sc) {
		super(zoo, sc);
	}

	@Override
	public boolean exibirMenu() throws ZooException {
		String menu = "";
		menu += "====================================" + LS;
		menu += "Sobre - Aplicação Zoológico" + LS;
		menu += "====================================" + LS;
		System.out.println(menu);
		
		imprimir(this.zoo);
		System.out.println();
		return true;
	}

}
