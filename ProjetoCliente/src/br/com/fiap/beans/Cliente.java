package br.com.fiap.beans;

public class Cliente {
    // visibilidade, tipo de dados e atributos
    private String nome;
    private int idade;
    private double altura;

    // metodos setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    // metodos getters (exibir/ retornar)
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public double getAltura(){
        return altura;
    }
}
