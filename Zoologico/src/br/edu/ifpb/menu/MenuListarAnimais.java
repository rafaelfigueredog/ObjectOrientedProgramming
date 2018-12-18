package br.edu.ifpb.menu;

import java.util.Collection;
import java.util.Scanner;

import br.edu.ifpb.dominio.Animal;
import br.edu.ifpb.dominio.Zoologico;
import br.edu.ifpb.exceptions.ZooException;

public class MenuListarAnimais extends AbstractMenu {

	public MenuListarAnimais(Zoologico zoo, Scanner sc) {
		super(zoo, sc);
	}

	@Override
	public boolean exibirMenu() throws ZooException {
		String menu = "";
		menu += "====================================" + LS;
		menu += "Listar Animais - Aplicação Zoológico" + LS;
		menu += "====================================" + LS;
		System.out.println(menu);

		Collection<Animal> animais = this.zoo.getAnimais();
		if (animais.isEmpty()) {
			System.out.println("Nenhum animal encontrado!");
		} else {
			for (Animal animal : animais) {
				imprimir(animal);
			}
		}
		System.out.println();
		return true;
	}
	
}
