package br.com.fiap.main;

import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Pessoa;
import br.com.fiap.beans.PessoaFisica;
import br.com.fiap.beans.PessoaJuridica;

import javax.swing.*;

public class TesteSistema {

    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j){
        return  Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }


    public static void main(String[] args) {

        PessoaFisica objPF = new PessoaFisica(
                texto("Nome"),
                texto("Email"),
                real("Renda"),
                texto("CPF"),
                texto("RG")
        );

        Endereco objEndPF = new Endereco(
                texto("Logradouro"),
                inteiro("Número"),
                texto("Bairro"),
                texto("Cidade"),
                texto("CEP")
        );

        objPF.setEndereco(objEndPF);

        PessoaJuridica objPJ = new PessoaJuridica(
                texto("Nome da empresa"),
                texto("Email empresa"),
                real("Renda Labora"),
                texto("CNPJ")
        );

        Endereco objEndPJ = new Endereco(
                texto("Logradouro"),
                inteiro("Número"),
                texto("Bairro"),
                texto("Cidade"),
                texto("CEP")
        );

        objPJ.setEndereco(objEndPJ);

        System.out.println(objPF);
        System.out.println(objPJ);
    }
}
