package br.edu.ifpb.menu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import br.edu.ifpb.dominio.Animal;
import br.edu.ifpb.dominio.Zoologico;
import br.edu.ifpb.exceptions.ZooException;

public class MenuListarAnimaisOrdenadosPeloNomeDecrescente extends AbstractMenu implements Menu {

	public MenuListarAnimaisOrdenadosPeloNomeDecrescente(Zoologico zoo, Scanner sc) {
		super(zoo, sc);
	}

	@Override
	public boolean exibirMenu() throws ZooException {
		String menu = "";
		menu += "====================================================================" + LS;
		menu += "Listar Animais Ordenados Pelo Nome Decrescente - Aplicação Zoológico" + LS;
		menu += "====================================================================" + LS;
		System.out.println(menu);

		Collection<Animal> animais = this.zoo.getAnimais();
		if (animais.isEmpty()) {
			System.out.println("Nenhum animal encontrado!");
		} else {
			List<Animal> animaisOrdenados = new ArrayList<>(animais);
			Collections.sort(animaisOrdenados);
//			Collections.sort(animaisOrdenados, new ComparatorAnimalNome());
			for (Animal animal : animaisOrdenados) {
				imprimir(animal);
			}
		}
		
		System.out.println();
		return true;
	}

}
