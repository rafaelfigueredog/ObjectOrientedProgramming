package br.edu.ifpb.cg.Exceptions;

public class HotelExeptions extends Exception {

    public HotelExeptions(String message) {
        super(message);
    }

    public HotelExeptions(String message, Throwable cause) {
        super(message, cause);
    }
}
