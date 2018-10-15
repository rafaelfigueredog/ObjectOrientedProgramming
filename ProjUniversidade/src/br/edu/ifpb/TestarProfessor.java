package br.edu.ifpb;

public class TestarProfessor {

    public static void main(String[] args) {

        Professor prof = new Professor();
        prof.cpf = "087.428.924-65";
        prof.matricula = "12345";
        prof.nome = "Rafael";

        System.out.println("Nome: " +  prof.nome);
        System.out.println("Mtricula: " + prof.matricula);
        System.out.println("CPF: " + prof.cpf);

    }
}
