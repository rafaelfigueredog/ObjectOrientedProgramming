package com.unicesumar;

public class GeradorDeCodigo {
    private Integer codigoAtual; 

    public GeradorDeCodigo() {
        this.codigoAtual = 0; 
    }


    public String getProximoCodigo() {
        this.codigoAtual = codigoAtual + 1; 
        return codigoAtual.toString();
    }
}
