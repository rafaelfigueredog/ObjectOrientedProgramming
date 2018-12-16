package br.edu.ifpb;

public class LivrariaException extends Exception {

    public LivrariaException(String message) {
        super(message);
    }

    public LivrariaException(String message, Throwable cause) {
        super(message, cause);
    }
}
