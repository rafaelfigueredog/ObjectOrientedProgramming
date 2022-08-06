package com.unicesumar;

import java.util.Collection;
import java.util.Scanner;

public class MenuPrincipal {
    private static final String LS = System.lineSeparator(); 

    private Livraria livraria; 
    private Scanner scanner; 

    public Livraria getLivraria() {
		return livraria;
	}

	public void setLivraria(Livraria livraria) {
		this.livraria = livraria;
	}

	public Scanner getSc() {
		return scanner;
	}

	public void setSc(Scanner scanner) {
		this.scanner = scanner;
	}

    public MenuPrincipal(Livraria livraria, Scanner scanner) {
        this.livraria = livraria; 
        this.scanner = scanner; 
    }

    
    protected Integer obterValorInteger(String mensagemProUsuario) {
		Integer valor = null;
		while(valor == null) {
			System.out.print(mensagemProUsuario);
			try {
				String line = this.scanner.nextLine();
				valor = Integer.parseInt(line);
			} catch(NumberFormatException e) {
				System.out.println("Erro! Valor inválido. Tente novamente!");
			}
		}
		return valor;
	}

    protected Double obterValorDouble(String mensagemProUsuario) {
		Double valor = null;
		while(valor == null) {
			System.out.print(mensagemProUsuario);
			try {
				String line = this.scanner.nextLine();
				valor = Double.parseDouble(line);
			} catch(NumberFormatException e) {
				System.out.println("Erro! Valor inválido. Tente novamente!");
			}
		}
		return valor;
	}

    protected String obterValorString(String mensagemProUsuario) {
		String valor = null;
		while (valor == null) {
			System.out.print(mensagemProUsuario);
			String line = this.scanner.nextLine().trim();
			valor = line;
		}
		return valor;
	}


	private void visualizarClientes() {
		Collection<Cliente> clientes = livraria.getClientes(); 
		if (clientes.isEmpty()) {
			System.out.println("Nenhum cliente na lista!"); 
		} else {
			for (Cliente cliente : clientes) {
				String dadosCliente = LS;
				dadosCliente += "Código: " + cliente.getCodigo() + LS; 
				dadosCliente += "Nome: " + cliente.getNome() + LS; 
				dadosCliente += "Telefone: " + cliente.getTelefone() + LS;   
				System.out.println(dadosCliente);
			}
		}
	}

	private void visualizarProdutos() {
		Collection<Produto> produtos = livraria.getProdutos(); 
		if (produtos.isEmpty()) {
			System.out.println("Nenhum produto na lista!"); 
		} else {
			for (Produto produto : produtos) {
				String dadosProduto = LS;
				dadosProduto += "Código: " + produto.getCodigo() + LS; 
				dadosProduto += "Descrição: " + produto.getDescricao() + LS; 
				dadosProduto += "Quantidade: " + produto.getQuantidadeEmEstoque() + LS;   
				dadosProduto += "Preço: R$ " + produto.getPreco() + LS; 
				System.out.println(dadosProduto);
			}
		}
	}

	private void visualizarVendas() {
		Collection<Venda> vendas = livraria.getVendas(); 
		if (vendas.isEmpty()) {
			System.out.println("Nenhum venda no Histórico"); 
		} else {
			for (Venda venda : vendas) {
				String dadosVenda = LS;
				dadosVenda += "Código: " + venda.getCodigo() + LS; 
				dadosVenda += "Cliente: " + venda.getCliente().getNome() + LS; 
				dadosVenda += "Produto: " + venda.getProduto().getDescricao() + LS; 
				dadosVenda += "Preço: R$ " + venda.getValorSemDesconto() + LS;   
				dadosVenda += "Desconto: " + venda.getPercentualDeDesconto() + LS; 
				dadosVenda += "Preço Final: R$ " + venda.getValorComDesconto() + LS; 
				System.out.println(dadosVenda);
			}
		}
	}


	private void cadastrarProduto() {
		String descrição = this.obterValorString("Digite a descrição do produto: ");
		Double preco = this.obterValorDouble("Digite o valor do Produto: ");  
		Integer quantidadeEmEstoque = this.obterValorInteger("Digite a quantidade em Estoque: ");
		Produto novoProduto = new Produto(descrição, quantidadeEmEstoque, preco); 
		this.livraria.addProduto(novoProduto);

		System.out.println(LS + "Produto cadastrado com sucesso!" + LS); 
	}

	private void cadastrarCliente() {

		// Recebe dados do cliente
		String nome = this.obterValorString("Digite o nome do cliente: "); 
		String telefone = this.obterValorString("Digite o telefone do cliente: "); 

		// Recebe dos dados do endereço 
		System.out.println("Digite o endereço do Cliente: ");
		String rua = obterValorString("Rua: "); 
		String numero = obterValorString("Numero: "); 
		String bairro = obterValorString("Bairro: "); 
		String cep = obterValorString("Cep: "); 
		String cidade = obterValorString("Cidade: "); 
		String estado = obterValorString("Estado: "); 

		// Cria uma instancia da classe Endereço 
		Endereco endereco = new Endereco(rua, numero, cep, bairro, cidade, estado);
		Cliente novoCliente = new Cliente(nome, telefone, endereco); 

		this.livraria.addCliente(novoCliente);

		System.out.println(LS + "Cliente cadastrado com sucesso!" + LS); 
	}


	private Double getPreçoFinal(Double preço, Double desconto) {
		Double preçoFinal = preço - ((preço*desconto) / 100); 
		return preçoFinal; 
	}


	private void cadastrarVenda() {
		Double preçoDaVenda;
		Double desconto;
		Double preçoFinal; 


		System.out.println("Escolha o código do produto: ");
		this.visualizarProdutos();
		String codigoDoProduto = this.obterValorString("Digite o código do produto: "); 
		
		
		Produto produtoEscolhido = this.livraria.getProdutoPorCodigo(codigoDoProduto);
		if (produtoEscolhido != null) {
			if (produtoEscolhido.getQuantidadeEmEstoque().equals(0)){
				System.out.println(LS + "O estoque desse produto está zerado!" + LS);
				return; 
			} else {
				preçoDaVenda = produtoEscolhido.getPreco(); 
				desconto = this.obterValorDouble("Digite o percentual de desconto: ");
				preçoFinal = this.getPreçoFinal(preçoDaVenda, desconto);
			}
		} else {
			System.out.println("Código do Produto inválido");
			return; 
		}

		System.out.println("Escolha o código do cliente: ");
		this.visualizarClientes();
		String codigoDoCliente = this.obterValorString("Digite o código do cliente: ");
		Cliente cliente = this.livraria.getClientePorCodigo(codigoDoCliente); 

		if (cliente != null) {
			Venda novaVenda = new Venda(cliente, produtoEscolhido, preçoDaVenda, desconto, preçoFinal); 
			this.livraria.addVenda(novaVenda);
			this.livraria.removerProdutoDoEstoque(codigoDoProduto);
			System.out.println(LS + "Venda cadastrada com sucesso!" + LS); 
		} else {
			System.out.println("Código do Cliente inválido");
			return; 
		}
		
		
	}

    


    public boolean exibirMenu() {
        int opcao = 0;
		String menu = "";
        menu += "===================================" + LS;
		menu += "Menu Principal - Aplicação Livraria" + LS;
		menu += "===================================" + LS;
        menu += ++opcao + ". Cadastrar Produto" + LS;
        menu += ++opcao + ". Cadastrar Cliente" + LS;
        menu += ++opcao + ". Cadastrar Venda"   + LS;
        menu += ++opcao + ". Listar Clientes"   + LS;
        menu += ++opcao + ". Listar Vendas"     + LS;
        menu += ++opcao + ". Listar Produtos"   + LS;
        menu += ++opcao + ". Sair" + LS; 


        while (true) {
            System.out.println(menu);
            int opcaoEscolhida = this.obterValorInteger("Digite uma opção: "); 
            switch (opcaoEscolhida) {
                case 1: 
					this.cadastrarProduto();
                    break; 
                case 2: 
					this.cadastrarCliente();
                    break; 
                case 3: 
					this.cadastrarVenda();
                    break; 
                case 4: 
					this.visualizarClientes(); 
                    break;
                case 5: 
					this.visualizarVendas();
                    break;
                case 6: 
					this.visualizarProdutos();
                    break;
                case 7: 
                    return false;
            }
        }
    }
}
