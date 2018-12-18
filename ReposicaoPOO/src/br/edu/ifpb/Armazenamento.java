package br.edu.ifpb;

import br.edu.ifpb.Negocio.Locadora;

import java.io.*;

public class Armazenamento {

    private String nomeDoArquivo;

    public Armazenamento(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }

    public Locadora recuperar(GeradorID geradorID) throws LocadoraException {
        Locadora locadora = null;
        try (FileInputStream fis = new FileInputStream(this.nomeDoArquivo);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            locadora = (Locadora) ois.readObject();
        } catch ( FileNotFoundException e ) {
            locadora = new Locadora(geradorID);
        } catch ( IOException | ClassNotFoundException e ) {
            throw new LocadoraException("Erro ao tentar recuperar");
        }
        return locadora;
    }

    public void salvar(Locadora locadora) {
        try (FileOutputStream fos = new FileOutputStream(this.nomeDoArquivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(locadora);
        } catch (IOException e ){
            e.printStackTrace();
            System.err.println("Erro ao tentar salvar o arquivo");
        }
    }
}
