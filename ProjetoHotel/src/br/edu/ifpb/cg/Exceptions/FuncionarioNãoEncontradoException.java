package br.edu.ifpb.cg.Exceptions;

public class FuncionarioNãoEncontradoException extends Exception {

    public FuncionarioNãoEncontradoException(String message) {
        super(message);
    }

    public FuncionarioNãoEncontradoException(String message, Throwable cause) {
        super(message, cause);
    }
}
