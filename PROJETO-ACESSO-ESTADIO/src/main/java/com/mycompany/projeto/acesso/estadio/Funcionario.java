package com.mycompany.projeto.acesso.estadio;

import java.util.List;
import java.util.ArrayList;

/*
 * @author lucas
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
    List<Funcionario> lista = new ArrayList<>();

    Funcionario[] funcionarios = new Funcionario[3];

    public Funcionario() {
        this.id = 0;
        this.nome = "";
        this.tempodeTrabalho = 0;
        this.funcao = "";
        this.cpf = "";
        this.endereco = "";
        this.sexo = "";
        this.idade = 0;
        this.setor = "";

    }

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

    public void removerFuncionario() {
        System.out.println("Funcionário removido com sucesso!");

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
        List<Funcionario> listaAtualizada = new ArrayList<>();
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId() != id) {
                listaAtualizada.add(funcionario);
            }
        }
        return listaAtualizada.toArray(new Funcionario[listaAtualizada.size()]);

    }

    public static Funcionario[] atualizarFuncionario(Funcionario[] funcionarios, Funcionario funcionarioAtualizar, int novoId, String novoNome, int novoTempodeTrabalho, String novoFuncao, String novoCpf, String novoEndereco, String novoSexo, int novoIdade, String novoSetor) {
        int index = -1;
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] == funcionarioAtualizar) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            Funcionario funcionarioAtualizado = new Funcionario(novoId, novoNome, novoTempodeTrabalho, novoFuncao, novoCpf, novoEndereco, novoSexo, novoIdade, novoSetor);
            funcionarios[index] = funcionarioAtualizado;
        }
        return funcionarios;
    }

}
