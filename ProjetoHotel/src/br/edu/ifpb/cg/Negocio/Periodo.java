package br.edu.ifpb.cg.Negocio;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Periodo implements Serializable {

    private static final long serialVersionUID = 1L;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Periodo periodo = (Periodo) o;
        return Objects.equals(dataInicial, periodo.dataInicial) &&
                Objects.equals(dataFinal, periodo.dataFinal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataInicial, dataFinal);
    }

}
