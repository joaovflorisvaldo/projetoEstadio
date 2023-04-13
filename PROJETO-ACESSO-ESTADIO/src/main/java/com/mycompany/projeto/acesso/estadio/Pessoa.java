/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.acesso.estadio;
import java.time.LocalDate;
import java.util.Date;

/********
 *
 * @author Alexsander
 */
public class Pessoa {
    private int idPessoa;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private Date dataNascimento;

    public Pessoa {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return idPessoa;
    }

    public void setId(int id) {
        this.idPessoa = id;
    }

    public String getNomeCompleto() {
        return nome;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nome= nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


}
