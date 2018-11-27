package br.edu.ifpb;

public class SubClass extends SuperCass {
    public int doIt(String str, Integer data) {
        String signature = "(String, Integer[])";
        System.out.println("Overridden: " + str + "  " + signature);
        return 1;
    }
}
