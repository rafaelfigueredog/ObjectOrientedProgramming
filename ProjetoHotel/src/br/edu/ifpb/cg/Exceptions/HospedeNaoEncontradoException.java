package br.edu.ifpb.cg.Exceptions;

public class HospedeNaoEncontradoException extends Exception {

    public HospedeNaoEncontradoException(String message) {
        super(message);
    }

    public HospedeNaoEncontradoException(String message, Throwable cause) {
        super(message, cause);
    }
}
