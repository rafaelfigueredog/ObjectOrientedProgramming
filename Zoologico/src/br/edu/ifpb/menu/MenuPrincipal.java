package br.edu.ifpb.menu;

import java.util.Scanner;

import br.edu.ifpb.dominio.Zoologico;
import br.edu.ifpb.exceptions.ZooException;

public class MenuPrincipal extends AbstractMenu {

	private MenuListarAnimais menuListarAnimais;
	
	private MenuAdicionarLeao menuAdicionarLeao;
	
	private MenuAdicionarCobra menuAdicionarCobra;
	
	private MenuAdicionarZebra menuAdicionarZebra;
	
	private MenuRemoverAnimal menuRemoverAnimal;
	
	private MenuListarAnimaisOrdenadosPeloNome menuListarAnimaisOrdenadosPeloNome;
	
	private MenuListarAnimaisOrdenadosPeloIdDecrescente menuListarAnimaisOrdenadosPeloIdDecrescente;
	
	private MenuListarAnimaisOrdenadosPeloNomeDecrescente menuListarAnimaisOrdenadosPeloNomeDecrescente;
	
	private MenuSobre menuSobre;
	
	public MenuPrincipal(Zoologico zoo, Scanner sc) {
		super(zoo, sc);
		this.menuListarAnimais = new MenuListarAnimais(zoo, sc);
		this.menuAdicionarLeao = new MenuAdicionarLeao(zoo, sc);
		this.menuAdicionarCobra = new MenuAdicionarCobra(zoo, sc);
		this.menuAdicionarZebra = new MenuAdicionarZebra(zoo, sc);
		this.menuRemoverAnimal = new MenuRemoverAnimal(zoo, sc);
		this.menuSobre = new MenuSobre(zoo, sc);
		this.menuListarAnimaisOrdenadosPeloNome = new MenuListarAnimaisOrdenadosPeloNome(zoo, sc);
		this.menuListarAnimaisOrdenadosPeloIdDecrescente = new MenuListarAnimaisOrdenadosPeloIdDecrescente(zoo, sc);
		this.menuListarAnimaisOrdenadosPeloNomeDecrescente = new MenuListarAnimaisOrdenadosPeloNomeDecrescente(zoo, sc);
	}

	public Zoologico getZoo() {
		return zoo;
	}

	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public boolean exibirMenu() throws ZooException {
		
		int opcao = 0;
		String menu = "";
		menu += "====================================" + LS;
		menu += "Menu Principal - Aplicação Zoológico" + LS;
		menu += "====================================" + LS;
		menu += ++opcao + ". Listar Animais" + LS;
		menu += ++opcao + ". Adicionar Leão" + LS;
		menu += ++opcao + ". Adicionar Cobra" + LS;
		menu += ++opcao + ". Adicionar Zebra" + LS;
		menu += ++opcao + ". Remover Animal" + LS;
		menu += ++opcao + ". Sobre a aplicação" + LS;
		menu += ++opcao + ". Listar Animais Ordenados Pelo Nome" + LS;
		menu += ++opcao + ". Listar Animais Ordenados Pelo Id Decrescente" + LS;
		menu += ++opcao + ". Listar Animais Ordenados Pelo Nome Decrescente" + LS;
		menu += ++opcao + ". Sair" + LS;
		
		while (true) {
			System.out.println(menu);
			int opcaoEscolhida = obterValorInteger("Digite uma opção: ");
			Menu menuSelecionado = null;
			switch (opcaoEscolhida) {
				case 1:
					menuSelecionado = this.menuListarAnimais;
					break;
				case 2:
					menuSelecionado = this.menuAdicionarLeao;
					break;
				case 3:
					menuSelecionado = this.menuAdicionarCobra;
					break;
				case 4:
					menuSelecionado = this.menuAdicionarZebra;
					break;
				case 5:
					menuSelecionado = this.menuRemoverAnimal;
					break;
				case 6:
					menuSelecionado = this.menuSobre;
					break;
				case 7:
					menuSelecionado = this.menuListarAnimaisOrdenadosPeloNome;
					break;
				case 8:
					menuSelecionado = this.menuListarAnimaisOrdenadosPeloIdDecrescente;
					break;
				case 9:
					menuSelecionado = this.menuListarAnimaisOrdenadosPeloNomeDecrescente;
					break;
				case 10:
					// Sair do programa
					return false;
				default:
					System.out.println();
					System.out.println("Erro! Opção desconhecida: " + opcaoEscolhida);
					System.out.println();
					break;
			}
			if (menuSelecionado != null) {
				menuSelecionado.exibirMenu();
			}
		}
	}
	
}
