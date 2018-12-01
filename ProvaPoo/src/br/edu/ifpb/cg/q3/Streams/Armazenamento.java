package br.edu.ifpb.cg.q3.Streams;

import br.edu.ifpb.cg.q3.Estoque;
import br.edu.ifpb.cg.q3.EstoqueException;
import br.edu.ifpb.cg.q3.GeradorId;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Armazenamento {

    private String nomeDoArquivo;

    public Armazenamento(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }

    public Estoque recuperar(GeradorId geradorId) throws EstoqueException {

        Estoque stocks = null;
        try (FileInputStream fis = new FileInputStream(this.nomeDoArquivo);
             ObjectInputStream ois = new ObjectInputStream(fis);) {
            stocks = (Estoque) ois.readObject();
            stocks.setGeradorId(geradorId);
        } catch (FileNotFoundException e) {
            stocks = new Estoque(geradorId);
        } catch ( IOException | ClassNotFoundException e) {
            throw new EstoqueException("Erro na Recuperação");
        }
        return stocks;
    }


}
