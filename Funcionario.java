/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menu;
import java.util.*;
/**
 *
 * @author Administrator
 */
public class Funcionario {
    
    public int id;
    public String nome;
    public int tempodeTrabalho;
    public String funcao;
    public String cpf;
    public String endereco;
    public String sexo;
    public int idade;
    public String setor;
    List lista = new ArrayList();
    
    
    Funcionario[] funcionarios = new Funcionario[3];

    public Funcionario(int id, String nome, int tempodeTrabalho, String funcao, String cpf, String endereco, String sexo, int idade, String setor) {
        this.id = id;
        this.nome = nome;
        this.tempodeTrabalho = tempodeTrabalho;
        this.funcao = funcao;
        this.cpf = cpf;
        this.endereco = endereco;
        this.sexo = sexo;
        this.idade = idade;
        this.setor = setor;
        
    }

    Funcionario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void removerFuncionario(int idPessoa,String nome, int tempodeTrabalho,String funcao,int cpf, String endereco, String sexo, int idade, String setor){
   
    funcionarios[0].id = 1;
    funcionarios[0].tempodeTrabalho = 5;
    funcionarios[0].funcao = "Lixeiro";
    funcionarios[0].cpf = "189.466.845-32";
    funcionarios[0].endereco = "Rua A, 123";
    funcionarios[0].sexo = "M";
    funcionarios[0].idade = 30;
    funcionarios[0].setor = "TI";

    funcionarios[1].id = 2;
    funcionarios[1].nome = "Igor Mendes";
    funcionarios[1].tempodeTrabalho = 5;
    funcionarios[1].funcao = "Diarista";
    funcionarios[1].cpf = "321.558.124-10";
    funcionarios[1].endereco = "Rua A, 123";
    funcionarios[1].sexo = "M";
    funcionarios[1].idade = 30;
    funcionarios[1].setor = "TI";
    
    funcionarios[2].id = 3;
    funcionarios[2].nome = "Carol";
    funcionarios[2].tempodeTrabalho = 5;
    funcionarios[2].funcao = "Diarista";
    funcionarios[2].cpf = "133.546.777-12";
    funcionarios[2].endereco = "Rua A, 123";
    funcionarios[2].sexo = "M";
    funcionarios[2].idade = 30;
    funcionarios[2].setor = "TI";
    
        
   
        

    }
    
   

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getTempodeTrabalho() {
        return tempodeTrabalho;
    }

    public String getFuncao() {
        return funcao;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public String getSetor() {
        return setor;
    }
    
    public static Funcionario[] removerFuncionario(Funcionario[] funcionarios, int id) {
        Funcionario[] novoArray = new Funcionario[funcionarios.length - 1];
        int indiceNovoArray = 0;
        
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i].getId() != id) {
                novoArray[indiceNovoArray] = funcionarios[i];
                indiceNovoArray++;
                
               
                
            }
        }
        return novoArray;
}
    
    public static Funcionario[] atualizarFuncionario(Funcionario[] funcionarios, Funcionario funcionarioAtualizar,int novoId, String novoNome, int novoTempodeTrabalho, String novoFuncao, String novoCpf, String novoEndereco, String novoSexo, int novoIdade, String novoSetor) {
    int index = -1;
    for (int i = 0; i < funcionarios.length; i++) {
        if (funcionarios[i] == funcionarioAtualizar) {
            index = i;
            break;
        }
    }
    if (index != -1) {
        Funcionario funcionarioAtualizado = new Funcionario( novoId ,novoNome, novoTempodeTrabalho, novoFuncao, novoCpf, novoEndereco, novoSexo, novoIdade, novoSetor);
        funcionarios[index] = funcionarioAtualizado;
    }
    return funcionarios;
}
}