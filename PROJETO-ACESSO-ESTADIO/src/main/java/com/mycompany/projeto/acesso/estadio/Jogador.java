package com.mycompany.projeto.acesso.estadio;

import java.util.Scanner;

/*
 * @author lucas
 */
public class Jogador {

    int machucado;
    int bid;
    String altura;
    int idade;
    String peso;
    String posicao;
    String timeAtual;
    String idTime;
    private float salario;

    public Jogador(int aMachucado, int aBid, String aAltura, int aIdade, String aPeso, String aPosicao, String aTimeAtual, float aSalario) {

        this.machucado = aMachucado;
        this.bid = aBid;
        this.altura = aAltura;
        this.idade = aIdade;
        this.peso = aPeso;
        this.posicao = aPosicao;
        this.timeAtual = aTimeAtual;
        this.salario = aSalario;

    }
    Scanner ler = new Scanner(System.in);

    public void machucado() {
        System.out.println("O jogador está machucado? \n[1]SIM  [2]NÃO");
        int machucado = ler.nextInt();

        if (machucado == 1) {

            System.out.println("O jogador não poderá jogar, pois está machucado!!");

        } else {
            System.out.println("O jogador está apto para jogar!!");
        }

    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float aSalario) {
        this.salario = aSalario;
    }

}
