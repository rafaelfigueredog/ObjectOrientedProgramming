package br.edu.ifpb;

public class TestarBiblioteca {

    public static void main(String[] args) {

        Biblioteca b = new Biblioteca();
        b.cadastrarLivro(1, "JavaCore");
        b.cadastrarLivro(2, "Python");
        b.cadastrarLivro(3, "C++");

        b.listarLivros();


        System.out.println(b.buscar(1));
        System.out.println(b.buscar(10));
        System.out.println(b.buscar(2));

        b.backup("livros.txt");
    }

}
