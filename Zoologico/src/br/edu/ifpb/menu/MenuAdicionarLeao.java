package br.edu.ifpb.menu;

import java.util.Scanner;

import br.edu.ifpb.dominio.Leao;
import br.edu.ifpb.dominio.Zoologico;
import br.edu.ifpb.exceptions.ZooException;

public class MenuAdicionarLeao extends AbstractMenu implements Menu {

	public MenuAdicionarLeao(Zoologico zoo, Scanner sc) {
		super(zoo, sc);
	}

	@Override
	public boolean exibirMenu() throws ZooException {
		String menu = "";
		menu += "====================================" + LS;
		menu += "Adicionar Leão - Aplicação Zoológico" + LS;
		menu += "====================================" + LS;
		System.out.println(menu);
		
		String nome = obterValorString("Informe o nome: ");
		Integer tamanhoDaJuba = obterValorInteger("Informe o tamanho da juba (em cm): ");
		Leao animal = new Leao(nome, tamanhoDaJuba);
		this.zoo.adicionarAnimal(animal);
		
		System.out.println();
		System.out.println("Leão adicionado com sucesso!");
		System.out.println();
		return true;
	}

}
