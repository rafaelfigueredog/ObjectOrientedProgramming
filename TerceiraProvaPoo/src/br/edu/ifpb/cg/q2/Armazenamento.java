package br.edu.ifpb.cg.q2;
import br.edu.ifpb.cg.q1.GeradorId;
import java.io.*;

public class Armazenamento {

    public Armazenamento() {
    }

    public Imobiliaria recuperar(String nomeDoArquivo) {
        Imobiliaria imobiliaria = null;
        GeradorId geradorId = new GeradorId();
        try ( FileInputStream fis = new FileInputStream(nomeDoArquivo);
              ObjectInputStream ois = new ObjectInputStream(fis) ) {
            imobiliaria = (Imobiliaria) ois.readObject();
            imobiliaria.setGeradorId(geradorId);
        } catch (FileNotFoundException e) {
            imobiliaria = new Imobiliaria(geradorId);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return imobiliaria;
    }

    public void armazenar(Imobiliaria imobiliaria, String nomeDoarquivo) {
        try (FileOutputStream fos = new FileOutputStream(nomeDoarquivo);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(imobiliaria);
        } catch (IOException e) {
            System.out.println("Não foi possivel salvar;");
        }
    }
}
