package br.edu.ifpb.cg.q3.Streams;

import br.edu.ifpb.cg.q3.Produtos.Estoque;
import br.edu.ifpb.cg.q3.Exceptions.EstoqueException;
import br.edu.ifpb.cg.q3.GeradorID.GeradorId;

import java.io.*;

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

    public void armazenar(Estoque stocks) throws EstoqueException {
        try (FileOutputStream fos = new FileOutputStream(this.nomeDoArquivo);
             ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(stocks);
        } catch (IOException e) {
            throw new EstoqueException("Houve algum erro ao tentar armazenar os dados do Estoque!", e);
        }
    }
}
