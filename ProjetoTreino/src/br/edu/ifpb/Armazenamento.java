package br.edu.ifpb;

import java.io.*;

public class Armazenamento {

    private String nomeDoArquivo;

    public Armazenamento(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }

    public Livraria recuperar(GeradorID geradorID) throws LivrariaException {
        Livraria livraria = null;
        try (FileInputStream fis = new FileInputStream(this.nomeDoArquivo);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            livraria = (Livraria) ois.readObject();
            livraria.setGeradorID(geradorID);
        } catch (FileNotFoundException e) {
            livraria = new Livraria(geradorID);
        } catch (IOException | ClassNotFoundException e) {
            throw new LivrariaException("não foi possivel ler o arquivo");
        }
        return livraria;
    }

    public void salvar(Livraria livraria) throws LivrariaException {
        try (FileOutputStream fos = new FileOutputStream(this.nomeDoArquivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(livraria);
        } catch (IOException e) {
            throw new LivrariaException("Houve um erro ao Salvar o Arquivo");
        }

    }

}
