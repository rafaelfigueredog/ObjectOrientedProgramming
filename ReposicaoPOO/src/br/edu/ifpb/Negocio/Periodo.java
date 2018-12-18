package br.edu.ifpb.Negocio;

import br.edu.ifpb.Imprimir;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Periodo implements Serializable {


    private Date dataInicial;
    private Date dataFinal;

    public Periodo(Date dataInicial, Date dataFinal) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }



    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(dataInicial) + " " + sdf.format(dataFinal);
    }
}
