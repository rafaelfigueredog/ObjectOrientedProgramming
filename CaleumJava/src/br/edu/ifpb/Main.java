package br.edu.ifpb;

public class Main {

    public static void main(String[] args) {

        int x = 100;
        int y = 200;
        for (int i = x; i < y; i++) {
            if (i % 19 == 0) {
                System.out.println("Achei um número divisível por 19 entre x e y");
                System.out.println(i);
                break;
            }
        }
        // labeled loop?
        primeiroloop:
            for(int i=0;i<10;i++){
                segundoloop:
                for(int j=0;j<10;j++){
                    if(j == 5){
                        System.out.println(j);
                        break primeiroloop;
                    }
            }
        }

    }

}
