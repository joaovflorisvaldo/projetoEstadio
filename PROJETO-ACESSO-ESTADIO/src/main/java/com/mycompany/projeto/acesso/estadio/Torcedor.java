package com.mycompany.projeto.acesso.estadio;

/*
* @author Renan
 */
public class Torcedor {

    public Pessoa idPessoa;
    public String nome;
    public int cpf;
    public int idade;
    public boolean sexo;
    public String endereco;
    public boolean socioTorcedor;

    public void comprarIngresso() {
        System.out.println("Comprou Ingresso");
    }

    public void comprarAlimento() {
        System.out.println("comprou alimento");

    }

    public void irAoEstadio() {
        System.out.println("foiAoEstadio");
    }
}
