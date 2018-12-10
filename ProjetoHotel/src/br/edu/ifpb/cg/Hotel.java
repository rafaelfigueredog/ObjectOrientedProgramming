package br.edu.ifpb.cg;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Hotel implements Serializable  {

    private List funcionarios;
    private List quartos;
    private List hospedes;
    private List hospedagens;

    public Hotel() {
        this.funcionarios = new ArrayList();
        this.quartos = new ArrayList();
        this.hospedes = new ArrayList();
        this.hospedagens = new ArrayList();
    }






}
