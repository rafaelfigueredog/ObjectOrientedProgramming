package br.edu.ifpb.cg.q1;

public class Main {

    public static void main(String[] args) {
        String[] a = {"ABC", "123", "0", ""}; // indexação do array {0, 1, 2, 3}

        for (int i = 0; i <= 4; i++) {
            // note que for começa em 0 e vai até 4; Loops:  { 0, 1, 2, 3, 4 }
            // quando o i == 4, será lançada a exeção ArrayIndexOutOfBoundsException
            try {
                String s = a[i];
                System.out.println("s: " +s);
                int n = Integer.parseInt(s); // i == 0 : Integer é a classe Rapper do tipo int portando não é possivel converter 'ABC' em um numero:
                System.out.println("n: "+n);
                int m = 1234/n;
                System.out.println("m: "+m);
            } catch (NumberFormatException e) {
                System.out.println("Erro na formatacao do numero");
            } catch ( ArrayIndexOutOfBoundsException e) {
                System.out.println("Acesso Fora do Array");
            } catch ( ArithmeticException e) {
                System.out.println("Erromatemática");
            }
        }
        System.out.println("fim");
    }

}
