/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.projeto.acesso.estadio;

import java.util.Scanner;

/**
 ***
 * @author Nicolas
 */
public class Menu {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("\nBem viando ao U.P. STADIUM\n");
            System.out.println("Por favor digite a opção que você deseja: \n");
            Scanner ler = new Scanner(System.in);
            System.out.println("[1]  BILHETERIA       [2] PESSOA             [3] JOGADOR");
            System.out.println("[4]  JUIZ             [5] TORCEDOR           [6] CIDADE");
            System.out.println("[7]  ESTADIO          [8] TIME               [9] JOGO");
            System.out.println("[10] VENDEDOR         [11] FUNCIONARIO       [12] ACESSO");
            System.out.println("[13] PLACAR           [14] SAIR");

            String escolha = ler.next();

            String Bilheteria = "BILHETERIA ";
            String Pessoa = "PESSOA";
            String Jogador = "JOGADOR";
            String Juiz = "JUIZ";
            String Torcedor = "TORCEDOR";
            String Cidade = "CIDADE";
            String Estadio = "ESTADIO";
            String Time = "TIME";
            String Jogo = "JOGO";
            String Vendedor = "VENDEDOR";
            String Funcionario = "FUNCIONARIO";
            String Acesso = "ACESSO";
            String Placar = "Placar";
            String Sair = "Sair";

            switch (escolha) {
                case "1":
                    System.out.println("SUA ESCOLHA FOI: " + Bilheteria);
                    Bilheteria vender = new Bilheteria();
                    vender.venderIngressos(200.58, 100.29, 850.69);
                    vender.validarIngressoPorPessoa();
                break;
                case "2":
                    System.out.println("SUA ESCOLHA FOI: " + Pessoa);
                break;
                case "3":
                    System.out.println("SUA ESCOLHA FOI: " + Jogador);
                    Jogador apto = new Jogador(1, 12255, "1.80", 28, "80 Kg", "Atacante", "Santos FC", (float) 158.0);
                    apto.machucado();
                break;
                case "4":
                    System.out.println("SUA ESCOLHA FOI: " + Juiz);
                    Juiz cadastrar = new Juiz("AAA", "AAAA", "11122255544", "11114445577", "42999999999", 1434.60);
                    cadastrar.CadastrarJuiz();
                break;
                case "5":
                    System.out.println("SUA ESCOLHA FOI: " + Torcedor);
                break;
                case "6":
                    System.out.println("SUA ESCOLHA FOI: " + Cidade);
                break;
                case "7":
                    System.out.println("SUA ESCOLHA FOI: " + Estadio);
                break;
                case "8":
                    System.out.println("SUA ESCOLHA FOI: " + Time);
                break;
                case "9":
                    System.out.println("SUA ESCOLHA FOI: " + Jogo);
                break;
                case "10":
                    System.out.println("SUA ESCOLHA FOI: " + Vendedor);
                break;
                case "11":
                    System.out.println("SUA ESCOLHA FOI "+Acesso);
                break; 
                case "12":
                    System.out.println("SUA ESCOLHA FOI: " + Placar);
                break;
                case "14":
                    System.out.println("Sua escolha foi: " + Sair);
                break;
                default:
                    System.out.println("\n\nA OPÇÃO DIGITADA É INVALIDA, INFORME UM NUMERO DE 1 Á 12!!\n\n");
                    i = 0;
                break;
            }
        }

    }
}
