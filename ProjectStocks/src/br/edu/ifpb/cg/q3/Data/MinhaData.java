package br.edu.ifpb.cg.q3.Data;

import java.io.Serializable;
import java.util.Objects;

public class MinhaData implements Serializable, Comparable<MinhaData> {

    private Integer dia;
    private Integer mes;
    private Integer ano;

    public MinhaData(Integer dia, Integer mes, Integer ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    @Override
    public int compareTo(MinhaData o) {
        if (this.ano.compareTo(o.getAno()) == 0) {
            if (this.mes.compareTo(o.getMes()) == 0) {
                if (this.dia.compareTo(o.getDia()) == 0) {
                    return  0;
                } else {
                    return this.dia.compareTo(o.getDia());
                }
            } else {
                return this.mes.compareTo(o.getMes());
            }
        } else {
            return this.ano.compareTo(o.getAno());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MinhaData minhaData = (MinhaData) o;
        return Objects.equals(dia, minhaData.dia) &&
                Objects.equals(mes, minhaData.mes) &&
                Objects.equals(ano, minhaData.ano);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dia, mes, ano);
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        if (dia >= 1 && dia <= 31)
            this.dia = dia;
        else
            this.dia = 1;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        if (mes >= 1 && mes <= 12)
            this.mes = mes;
        else
            this.mes = 1;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        if (ano > 0)
            this.ano = ano;
        else
            this.ano = 1;
    }

    @Override
    public String toString() {
        return  dia + "/" + mes + "/" + ano;
    }
}
