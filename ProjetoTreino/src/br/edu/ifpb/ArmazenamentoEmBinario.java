package br.edu.ifpb;
import br.edu.ifpb.Livraria.GeradorID;

import java.io.*;

public class ArmazenamentoEmBinario {

    private String nomeDoArquivo;

    public ArmazenamentoEmBinario(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }

    public Object recuperar(GeradorID geradorID) {
        Object objeto = null;
        try (FileInputStream fis = new FileInputStream(this.nomeDoArquivo);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            objeto = ois.readObject();
            // objeto.setGeradorId(geradorID);
        } catch ( FileNotFoundException e ) {
            objeto = new Object();
        } catch ( IOException | ClassNotFoundException e ) {
            System.err.println("Erro ao recuperar!");
        }
        return objeto;
    }

    public void salvar(Object objeto) {

        try(FileOutputStream fos = new FileOutputStream(this.nomeDoArquivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(objeto);
        } catch ( IOException e ) {
            System.err.println("Erro ao salvar");
        }

    }
}
