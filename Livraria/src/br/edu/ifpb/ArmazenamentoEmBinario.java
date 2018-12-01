package br.edu.ifpb;

import java.io.*;

public class ArmazenamentoEmBinario {

    private String nomeDoArquivo;

    public ArmazenamentoEmBinario(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }

    public Livraria recuperar(GeradorId geradorId) throws Exception {

        Livraria bookstore = null;

        try ( FileInputStream fis = new FileInputStream(this.nomeDoArquivo);
              ObjectInputStream ois = new ObjectInputStream(fis); ) {

            bookstore = (Livraria) ois.readObject();
            bookstore.setGeradorId(geradorId);
        } catch (FileNotFoundException o ) {
            bookstore = new Livraria(geradorId);
        } catch (IOException | ClassNotFoundException o) {
            throw new BookStoreException("Erro ao tentar recuperar um arquivo");
        }
        return bookstore;
    }

    public Livraria armazenar(Livraria livraria) throws BookStoreException {
        try (FileOutputStream fos = new FileOutputStream(this.nomeDoArquivo);
             ObjectOutputStream oos = new ObjectOutputStream(fos); ){
            oos.writeObject(livraria);
        } catch (IOException o) {
            throw new BookStoreException("Erro ao tentar armazenar Arquivos");
        }
    }

}
