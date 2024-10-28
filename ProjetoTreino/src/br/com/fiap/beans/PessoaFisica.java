package br.com.fiap.beans;

public class PessoaFisica extends Pessoa {

    private String cpf;
    private String rg;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, String email, double renda, String cpf, String rg) {
        super(nome, email, renda);
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                "} " + super.toString();
    }
}
