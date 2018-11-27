package br.edu.ifpb.Java.OrientaçãoAObjetosBasica.Banco;

import java.util.Date;

public class Data extends Date {

    int dia;
    int mes;
    int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return dia+"/"+mes+"/"+ano;
    }

    public Data() {
        Date hoje = new Date();
        this.dia = hoje.getDay();
        this.mes = hoje.getMonth();
        this.ano = hoje.getYear();
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia > 0) {
            this.dia = dia;
        }
    }

    public void setMes(int mes) {
        if (mes > 0  && mes <= 12) {
             this.mes = mes;
        }
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano > 0) {
            this.ano = ano;
        }
    }
}
