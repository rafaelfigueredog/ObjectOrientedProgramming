package com.unicesumar;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        // 1. Criação da livraria;
        Livraria livraria = new Livraria();  

        // 2. Criação do scanner para obter valores digitados pelo usuário 
        Scanner scanner = new Scanner(System.in); 

        // 3. Criação do menu principal enviando como parametros a livraria e o scanner para inputs. 
        MenuPrincipal menuPrincipal = new MenuPrincipal(livraria, scanner);

        // 4. Execução do programa. 
        boolean continuarExecução = true; 
        while (continuarExecução) {
            continuarExecução = menuPrincipal.exibirMenu(); 
        }
    }
}
