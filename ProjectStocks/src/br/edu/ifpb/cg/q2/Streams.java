package br.edu.ifpb.cg.q2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class Streams {

    public static void main(String[] args) {

        Path path = Paths.get("texto.txt");
        try {

            ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(path);

            String[] palavras;
            for (String linha: lines) {
                palavras = linha.split(" ");
                for (String palavra: palavras) {
                    System.out.println(palavra);
                }
            }


        } catch (IOException e ){
            e.printStackTrace();
        }




    }

}
