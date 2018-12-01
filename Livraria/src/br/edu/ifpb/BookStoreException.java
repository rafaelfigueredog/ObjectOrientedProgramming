package br.edu.ifpb;

public class BookStoreException extends Exception {

    private static final long serialVersionUID = 1L;

    public BookStoreException(String message) {
        super(message);
    }
    public BookStoreException(String message, Throwable cause) {
        super(message, cause);
    }
}
