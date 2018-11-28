package br.edu.ifpb.Java.OrientaçãoAObjetosBasica.Exceções;

public class A {
    public String sayHello(String name) throws ArithmeticException {
        if(name == null) throw new TestException();
        return "Hello" + name;

    }
}
