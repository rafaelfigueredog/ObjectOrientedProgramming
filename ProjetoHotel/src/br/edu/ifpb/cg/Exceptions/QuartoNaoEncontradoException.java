package br.edu.ifpb.cg.Exceptions;

public class QuartoNaoEncontradoException extends Exception {

    public QuartoNaoEncontradoException(String message) {
        super(message);
    }

    public QuartoNaoEncontradoException(String message, Throwable cause) {
        super(message, cause);
    }
}
