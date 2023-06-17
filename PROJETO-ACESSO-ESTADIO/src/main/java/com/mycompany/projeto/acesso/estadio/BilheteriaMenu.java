package com.mycompany.projeto.acesso.estadio;

import java.util.Scanner;

/**
 *
 * @author Maria
 */
public class BilheteriaMenu {
    
    int opcao;
    
    Scanner ler = new Scanner(System.in);
    Bilheteria bilheteria = new Bilheteria();
    
    public void menuBilheteria(){
        do{
            System.out.println("\nINFORME O QUE DESEJA FAZER NA BILHETERIA");
            System.out.println("[1]COMPRAR INGRESSO");
            System.out.println("[2]INGRESSOS VENDIDOS");
            System.out.println("[3]VALOR ARRECADADO");
            System.out.println("[0]SAIR");
            opcao = ler.nextInt();
        
            switch(opcao){
                case 1:
                    bilheteria.comprarIngresso();
                    break;
                case 2:
                    bilheteria.ingressosVendidos();
                    break;
                case 3:
                    bilheteria.valorArrecadado();
                    break;
                case 0:
                    System.out.println("\nVOCÊ ESCOLHEU SAIR DA MENU DA BILHETERIA");
                    break;
                default:
                    System.out.println("\nOPÇÃO INVÁLIDA!");
                    break; 
            }
        }while(opcao != 0);
    }
}
