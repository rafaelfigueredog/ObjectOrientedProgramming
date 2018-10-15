package br.edu.ifpb;

import java.util.Scanner;
import static java.lang.System.*;

public class TestarCadastro {

    public static void main(String[] args) {

        String nome;
        int idade;
        double salario;

        try {

            Scanner in = new Scanner(System.in);
            System.out.printf("Digite o Nome: ");
            nome = in.nextLine();
            System.out.printf("Digite a idade: ");
            idade = in.nextInt();
            System.out.printf("Digite o Salario: ");
            salario = in.nextDouble();
            Cadastro C = new Cadastro(nome, idade, salario);
            System.out.println(C.toString());

        }
        catch ( IdadeException  objIdade ) {
            System.out.println(obj.getMessage());
        }
        catch ( NomeException objNome ) {
            System.out.println(objNome.getMessage());
        }
        catch ( SalarioException  objSalario ) {
            System.out.println(objSalario.getMessage() );
        }
    }
}
