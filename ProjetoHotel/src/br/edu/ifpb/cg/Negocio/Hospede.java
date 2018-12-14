package br.edu.ifpb.cg.Negocio;
import java.util.Date;

public class Hospede extends Pessoa {

    private static final long serialVersionUID = 1L;
    private Date dataNascimento;

    public Hospede(Long id, String nome, Long cpf, Date dataNascimento) {
        super(id, nome, cpf);
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String imprimir() {

        String representacao = "";

        representacao += "\nHospede: ";
        representacao += "\nId: " + super.getId();
        representacao += "\nNome: " + super.getNome();
        representacao += "\nCPF: " + super.getCpf();
        representacao += "\nDada de Nascimento: " + dataNascimento + "\n";

        return representacao;
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public Long getCpf() {
        return super.getCpf();
    }

    @Override
    public void setCpf(Long cpf) {
        super.setCpf(cpf);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    @Override
    public String toString() {
        return "Hospede {" +
                "dataNascimento=" + dataNascimento +
                '}';
    }
}
