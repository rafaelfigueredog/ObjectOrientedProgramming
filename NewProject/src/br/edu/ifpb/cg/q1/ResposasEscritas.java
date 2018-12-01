package br.edu.ifpb.cg.q1;

public class ResposasEscritas {

    /*

    a) Exceção é um comportamento anormal que o programa identifica e pode ser tratado em tempo de execução ou não.

    b) Exceções checadas que estendem de uma Exception são exceções que podem ser tratadas.
        Exceções não checadas são erros que não podem ser tratados não há tratamento em tempo execução.  Algo que independe do programador.

    c) O bloco finally do try catch sempre que uma exceção é lançada ele execultado e caso seja utilizado,  deve vir após todos os catch's do bloco try-catch.

    d) As vezes o bloco num bloco try podemos ter mais de uma operação que lança uma exceção,  dependendo da exceção que for lançada, o tratamento do erro
       é especifico para cada tipo exceção conforme as necessidades da aplicação. Deve obedecer uma Hieraquia sim. Todas as Exceções estendem da
       classe Exception, então no blocos catch's as de classes mais especificas para classes mais reais.

    e) Saida do Programa:

        s: ABC
        Erro na formatacao do numero
        s: 123
        n: 123
        m: 10
        s: 0
        n: 0
        Erromatemática
        s:
        Erro na formatacao do numero
        Acesso Fora do Array
        fim

        Saida do Programa Comentada


        1. A aplicação entra no primeiro laço no bloco try:
        2. Implime o plimeiro valor do array

              s: ABC

       3.  Na linha seguinte o programa tenta converter a string "ABC" para um formato numerico com a classe Integer;
           porém não é possivel converter 'ABC' em um numero, por isso é lancada a exceção NumberFormatException e tem um catch
           onde é impresso a causa do erro:

             Erro na formatacao do numero

        4. O  controle após o catch volta para o cabeççario do for, no segundo laço, i == 1 , imprime na tela:

                s: 123

        5. Dessa vez converte com sucesso 123 em Integer e imprime novamente o resultado

                n: 123

        6. Divide 1234/123, como a m é definido como tipo primitivo int a divisão é inteira, portanto imprime:

            m: 10

        7. i == 2: imprime

            s: 0

        8. converte para s para Integer e Imprime:

            n: 0

        9. Tenta dividir 1234/0, é gerada uma exceção o controle vai para o bloco catch ArithmeticException que imprime:

           Erromatemática

        10.  Imprime a string

            s:

        11. E novamente entra no erro   NumberFormatException e o catch desse erro imprime

            Erro na formatacao do numero

        12. Em seguida o valor atribuido a variavei i é 4, não temos esse indice em nosso array.
            na linha String s = a[i]; é lançada a exceção ArrayIndexOutOfBoundsException e no catch dessa exceção é impresso:

            Acesso Fora do Array

        13. Finalmente o controle do laço termina e é impresso:

            fim


     */
}
