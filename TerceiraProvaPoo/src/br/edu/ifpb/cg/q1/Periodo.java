package br.edu.ifpb.cg.q1;

import java.util.Date;

public class Periodo {

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
        return "Periodo{" +
                "dataInicial=" + dataInicial +
                ", dataFinal=" + dataFinal +
                '}';
    }
}
