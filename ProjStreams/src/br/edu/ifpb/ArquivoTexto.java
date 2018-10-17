package br.edu.ifpb;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoTexto {

    private String nomeArquivo;

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }


    @Override
    public String toString() {
        return "ArquivoTexto{" +
                "nomeArquivo='" + nomeArquivo + '\'' +
                '}';
    }

    public ArquivoTexto(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        try {
            FileWriter fw = new FileWriter(nomeArquivo);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(nomeArquivo);
            bw.close();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }
    public static boolean gravarProduto (String arquivo, int codigo, String produto ) throws Exception {

        FileWriter fw = new FileWriter(arquivo);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(String.valueOf(codigo)); bw.write("#"); bw.write(produto); bw.write("\n");
        bw.close();
        return true;

    }

}
