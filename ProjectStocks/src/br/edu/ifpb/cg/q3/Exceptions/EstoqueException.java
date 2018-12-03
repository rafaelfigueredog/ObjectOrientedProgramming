package br.edu.ifpb.cg.q3.Exceptions;

public class EstoqueException extends  Exception {

    private static final long serialVersionUID = 1L;

    public EstoqueException(String message) {
        super(message);
    }

    public EstoqueException(String message, Throwable cause) {
        super(message, cause);
    }


}
