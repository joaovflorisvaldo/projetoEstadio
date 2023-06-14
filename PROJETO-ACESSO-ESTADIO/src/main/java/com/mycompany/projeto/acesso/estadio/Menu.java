package com.mycompany.projeto.acesso.estadio;

import java.util.Scanner;

/**
 ***
 * @author Nicolas
 */
public class Menu {
    public static void main(String[] args) {
        
        int escolha;
        
        Acesso acesso = new Acesso();
        Bilheteria bilheteria = new Bilheteria();
        
        Scanner ler = new Scanner(System.in);
        
        do {
            System.out.println("\nBem viando ao U.P. STADIUM\n");
            System.out.println("Por favor digite a opção que você deseja: \n");
            System.out.println("[1]   BILHETERIA\t[2]   PESSOA");
            System.out.println("[3]   JUIZ\t\t[4]   TORCEDOR");
            System.out.println("[5]   ESTADIO\t\t[6]   TIME");
            System.out.println("[7]   JOGO\t\t[8]   VENDEDOR");
            System.out.println("[9]   FUNCIONARIO\t[10]  ACESSO");
            System.out.println("[0]   SAIR");

            escolha = ler.nextInt();

            String Pessoa = "PESSOA";
            String Juiz = "JUIZ";
            String Torcedor = "TORCEDOR";
            String Estadio = "ESTADIO";
            String Time = "TIME";
            String Jogo = "JOGO";
            String Vendedor = "VENDEDOR";
            String Funcionario = "FUNCIONARIO";


            switch (escolha) {
                case 1:
                    bilheteria.menuBilheteria();
                    break;
                case 2:
                    System.out.println("\nSUA ESCOLHA FOI: " + Pessoa);
                    break;
                case 3:
                    System.out.println("\nSUA ESCOLHA FOI: " + Juiz);
                    Juiz cadastrar = new Juiz("AAA", "AAAA", "11122255544", "11114445577", "42999999999", 1434.60);
                    cadastrar.CadastrarJuiz();
                    break;
                case 4:
                    System.out.println("\nSUA ESCOLHA FOI: " + Torcedor);
                    break;
                case 5:
                    System.out.println("\nSUA ESCOLHA FOI: " + Estadio);
                    break;
                case 6:
                    System.out.println("\nSUA ESCOLHA FOI: " + Time);
                    break;
                case 7:
                    System.out.println("\nSUA ESCOLHA FOI: " + Jogo);
                    break;
                case 8:
                    System.out.println("\nSUA ESCOLHA FOI: " + Vendedor);
                    break;
                case 9:
                    System.out.println("\nSUA ESCOLHA FOI: " + Funcionario);
                    break; 
                case 10:
                    acesso.validarAcesso();
                    break;
                case 0:
                    System.out.println("\nVOCÊ ESCOLHEU SAIR DO SISTEMA!");
                    break;
                default:
                    System.out.println("\nOPÇÃO DIGITADA É INVALIDA");
                    break;
            }   
        }while(escolha != 0);
    }
}
