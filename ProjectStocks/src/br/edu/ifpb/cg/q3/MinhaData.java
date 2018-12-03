package br.edu.ifpb.cg.q3;

public class MinhaData {

    private Integer dia;
    private Integer mes;
    private Integer ano;

    public MinhaData(Integer dia, Integer mes, Integer ano) {
        setDia(dia);
        setMes(mes);
        this.ano = ano;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        if (dia >= 1 && dia <= 31)
            this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        if (mes >= 1 && mes <= 12)
            this.mes = mes;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Data:  " + dia + "/" + mes + "/" + ano + "\n";

    }
}
