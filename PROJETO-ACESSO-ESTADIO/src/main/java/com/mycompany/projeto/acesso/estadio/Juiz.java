package com.mycompany.projeto.acesso.estadio;

import java.util.Scanner;

/*
 * @author lucas
 */
public class Juiz {

    public String nomeJuiz;
    public String organizacaoFutebol;
    public String cpf;
    public String rg;
    public String telefone;
    private double salario;
    public String novoJuiz[] = {};

    public Juiz(String aNomeJuiz, String aOrganizacaoFutebol, String aCpf, String aRg, String aTelefone, double aSalario) {
        this.nomeJuiz = aNomeJuiz;
        this.organizacaoFutebol = aOrganizacaoFutebol;
        this.cpf = aCpf;
        this.rg = aRg;
        this.telefone = aTelefone;
        this.salario = aSalario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void CadastrarJuiz() {

        Scanner ler = new Scanner(System.in);

        System.out.println("\nCADASTRAR JUIZ:\n");

        System.out.print("Digite o nome: ");
        String aNomeJuiz = ler.nextLine();
        System.out.print("Digite o CPF : ");
        String aCpf = ler.nextLine();
        System.out.print("Digite o RG: ");
        String aRg = ler.nextLine();
        System.out.print("Digite a Organização de Futebol: ");
        String aOrganizacaoFutebol = ler.nextLine();
        System.out.print("Digite o telefone: ");
        String aTelefone = ler.nextLine();

        System.out.println("\n\nNOVO JUIZ CADASTRADO COM SUCESSO!! \n");
        System.out.println("NOME: " + aNomeJuiz);
        System.out.println("CPF: " + aCpf);
        System.out.println("RG: " + aRg);
        System.out.println("ORGANIZAÇÃO DE FUTEBOL: " + aOrganizacaoFutebol);
        System.out.println("TELEFONE: " + aTelefone);

    }

}
