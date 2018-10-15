package br.edu.ifpb;

import javax.xml.stream.FactoryConfigurationError;
import java.io.*;
import java.util.ArrayList;

public class Biblioteca implements Serializable {

    private ArrayList<Livro> listaLivros;

    @Override
    public String toString() {
        return "Biblioteca{" +
                "listaLivros=" + listaLivros +
                '}';
    }

    public ArrayList<Livro> getListaLivros() {
        return listaLivros;
    }

    public Biblioteca() {
        listaLivros = new ArrayList<Livro>();
    }

    public boolean cadastrarLivro(int codigo, String titulo) {
        Livro livro = new Livro(codigo, titulo);
        listaLivros.add(livro);
        return true;
    }

    public void listarLivros() {
        System.out.print("Biblioteca: [ ");
        for (int i = 0; i < listaLivros.size(); i++) {
            System.out.print(listaLivros.get(i).getTitulo() + ", ");
        }
        System.out.println("]");
    }

    public Livro buscar(int codigo) {

        for (int i = 0; i < listaLivros.size(); i++) {
            if (listaLivros.get(i).getCodigo() ==  codigo) {
                return listaLivros.get(i);
            }
        }
        return null;
    }

    public boolean backup (String arquivo)  {
        try (

                FileOutputStream fos = new FileOutputStream(arquivo);
                ObjectOutputStream oos = new ObjectOutputStream(fos);

                FileInputStream fis = new FileInputStream(arquivo);
                ObjectInputStream ois = new ObjectInputStream( fis );
        )
        {
            oos.writeObject(listaLivros);
            return true;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
