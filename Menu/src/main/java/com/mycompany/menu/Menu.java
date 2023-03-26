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
        System.out.println("Bem viando ao U.P. STADIUM\n");
        System.out.println("Por vavor selecione a opção que você deseja: \n");
        System.out.println("[1] ESCOLHER JOGO       [2] VIZUALIZAR INFORMAÇÕES DO JOGO      [3] LOGIN OU CADASTRO");
        System.out.println("[4] ESCOLHER SETOR      [5] FORMAS DE PAGAMENTO                 [6] VOLTAR PARA O INICIO");
        Scanner ler = new Scanner (System.in);
        char escolha = ler.next().charAt(0);
        
        
        String escJogo = "ESCOLHER JOGO";
        String informacoes = "VIZUALIZAR INFORMAÇÕES DO JOGO";
        String loginCasd = "LOGIN OU CADASTRO";
        String escSetor = "ESCOLHER SETOR";
        String pagamento = "FORMAS DE PAGAMENTO";
        String inicio = "VOLTAR PARA O INICIO";
                
        
        switch (escolha) {
            case '1':
                System.out.println("Sua escolha foi: "+escJogo);
                
                break;
            case '2':
                System.out.println("Sua escolha foi: " + informacoes);
                
                break;
            case '3':
                System.out.println("Sua escolha foi: " + loginCasd);
                
                break;
            case '4':
                System.out.println("Sua escolha foi: " + escSetor);
                
                break;
            case '5':
                System.out.println("Sua escolha foi: " + pagamento);
                
                break;
            case '6':
                System.out.println("Sua escolha foi: " + inicio);
                
                break;
                
            default: 
                        System.out.println("A OPÇÃO DIGITADA É INVALIDA, DIGITE UM NÚMERO DE 1 Á 6!!");

        }

    }
}
