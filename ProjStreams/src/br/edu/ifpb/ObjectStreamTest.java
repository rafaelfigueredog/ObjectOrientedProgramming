package br.edu.ifpb;

import java.io.*;

class Aluno implements Serializable { // classe interna. Não pode ser publica, util apenas nesse arquivo.

    int mat;
    String nome;

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno(int mat, String nome) {
        this.mat = mat;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "mat=" + mat +
                ", nome='" + nome + '\'' +
                '}';
    }
}

public class ObjectStreamTest {

    public static void main(String[] args) {


        try (
            FileOutputStream fos = new FileOutputStream("files/aluno.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            FileInputStream fis = new FileInputStream("files/aluno.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
        )
        {
            Aluno estudante = new Aluno(123, "Rafael");

            oos.writeObject(estudante);

            estudante = null;

            estudante = (Aluno) ois.readObject(); // read file;
            System.out.println(estudante.toString());
            estudante.setNome("Joao");
            System.out.println(estudante.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
    // FileInputStream,  BufferedInputStream,
    // FileOutputStream BufferedOutputStream
    // ObjectInputStream
}
