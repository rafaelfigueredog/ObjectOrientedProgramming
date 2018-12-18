package br.edu.ifpb.menu;

import java.util.Collection;
import java.util.Scanner;

import br.edu.ifpb.dominio.Animal;
import br.edu.ifpb.dominio.Zoologico;
import br.edu.ifpb.exceptions.ZooException;

public class MenuRemoverAnimal extends AbstractMenu implements Menu {

	public MenuRemoverAnimal(Zoologico zoo, Scanner sc) {
		super(zoo, sc);
	}

	@Override
	public boolean exibirMenu() throws ZooException {
		String menu = "";
		menu += "====================================" + LS;
		menu += "Remover Animal - Aplicação Zoológico" + LS;
		menu += "====================================" + LS;
		System.out.println(menu);
		
		Collection<Animal> animais = this.zoo.getAnimais();
		if (animais.isEmpty()) {
			System.out.println("Não há animais para remover!");
			return true;
		}
		
		for (Animal animal : animais) {
			System.out.println(animal);
		}
		Long id = obterValorLong("Escolha o id do Animal a ser removido: ");
		this.zoo.removerAnimal(id);
		
		System.out.println();
		System.out.println("Animal removido com sucesso!");
		System.out.println();
		return true;
	}

}
