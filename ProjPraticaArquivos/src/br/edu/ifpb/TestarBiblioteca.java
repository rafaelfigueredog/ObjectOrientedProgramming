package br.edu.ifpb;

public class TestarBiblioteca {

    public static void main(String[] args) {

        Biblioteca b = new Biblioteca();
        b.cadastrarLivro(1, "JavaCore");
        b.cadastrarLivro(2, "Python");
        b.cadastrarLivro(3, "C++");
        b.cadastrarLivro(4, "PHP");
        b.cadastrarLivro(5, "JavaDeitel");
        b.listarLivros();

        b.backup("livros.txt");
    }

}
