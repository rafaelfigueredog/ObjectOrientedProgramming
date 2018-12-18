package br.edu.ifpb;

public class LocadoraException extends Exception {

    public LocadoraException(String message) {
        super(message);
    }

    public LocadoraException(String message, Throwable cause) {
        super(message, cause);
    }
}
