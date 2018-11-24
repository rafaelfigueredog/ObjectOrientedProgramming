package br.edu.ifpb.Java.Basico;

public class SequenciaRecursiva {

    public static void SequenciaRecursiva(int x) {

        if (x == 1) {
            System.out.println(x);
            return;
        }
        System.out.print(x  +  ", ");
        if ( x % 2 == 0)
            SequenciaRecursiva( x/2  );
        else
            SequenciaRecursiva((3 * x) + 1);


    }

    public static void main(String[] args) {

        SequenciaRecursiva(13);

    }

}
