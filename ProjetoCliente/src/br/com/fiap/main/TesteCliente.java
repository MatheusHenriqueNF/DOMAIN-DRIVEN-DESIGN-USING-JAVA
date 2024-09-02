package br.com.fiap.main;

import br.com.fiap.beans.Cliente;

public class TesteCliente {

    // metodo para executar
    public static void main(String[] args){

        // Instanciar objeto
        Cliente objCliente = new Cliente();

        objCliente.setNome("Braufagelio");
                            // (40)
                            // (1.70)
        System.out.println(
                objCliente.getNome()
        );

    }
}
