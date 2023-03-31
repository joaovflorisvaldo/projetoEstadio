/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.menu;

import java.util.Scanner;

/**
 *
 * @author LUCAS
 */
public class Menu {

    public static void main(String[] args) {
        Bilheteria vender = new Bilheteria();
        for(int i=0; i<3;i++){
        System.out.println("Bem viando ao U.P. STADIUM\n");
        System.out.println("Por favor digite a opção que você deseja: \n");
        System.out.println("[1] BILHETERIA       [2] PESSOA             [3] JOGADOR");
        System.out.println("[4] JUIZ             [5] TORCEDOR           [6] CIDADE");
        System.out.println("[7] ESTADIO          [8] TIME               [9] JOGO");
        System.out.println("[10] VENDEDOR        [11] FUNCIONARIO       [12] ACESSO");
        Scanner ler = new Scanner (System.in);
        
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
                
        
        switch (escolha) {
            case "1":
                System.out.println("SUA ESCOLHA FOI: "+Bilheteria);
                i=4;
                vender.venderIngressos(130.58,150.29,850.69);
                break;
            case "2":
                System.out.println("SUA ESCOLHA FOI: " + Pessoa);
                i=4;
                break;
            case "3":
                System.out.println("SUA ESCOLHA FOI: " + Jogador);
                i=4;
                break;
            case "4":
                System.out.println("SUA ESCOLHA FOI: " + Juiz);
                
                i=4;
                break;
            case "5":
                System.out.println("SUA ESCOLHA FOI: " + Torcedor);
                i=4;
                break;
            case "6":
                System.out.println("SUA ESCOLHA FOI: " + Cidade);
                i=4;
                break;
                
             case "7":
             System.out.println("SUA ESCOLHA FOI: " + Estadio);
                i=4;
                break;
            case "8":
                System.out.println("SUA ESCOLHA FOI: " + Time);
                i=4;
                break;
                
                case "9":
                System.out.println("SUA ESCOLHA FOI: " + Jogo);
                i=4;
                break;
                
                case "10":
                System.out.println("SUA ESCOLHA FOI: " + Vendedor);
                i=4;
                break;
                
                case "11":
                System.out.println("SUA ESCOLHA FOI: " + Funcionario);
                i=4;
                break;
                
                case "12":
                System.out.println("Sua escolha foi: " + Acesso);
                i=4;
                break;             
               
                
                default: 
                    System.out.println("\n\nA OPÇÃO DIGITADA É INVALIDA, INFORME UM NUMERO DE 1 Á 12!!\n\n");
                     i=0;                      
                break;
        }
        }

    }
}
