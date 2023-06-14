package com.mycompany.projeto.acesso.estadio;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String dataNascimento;

    // Construtor da classe Pessoa
    public Pessoa(String nome, String cpf, String endereco, String telefone, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public void mostrar(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Data de Nascimento: " + this.getDataNascimento());
    }
    // Métodos getters para acessar os atributos
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
    
    
}
