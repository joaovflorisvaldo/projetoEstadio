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
          
            String Bilheteria = "BILHETERIA";
            String Pessoa = "PESSOA";
            String Juiz = "JUIZ";
            String Torcedor = "TORCEDOR";
            String Estadio = "ESTADIO";
            String Time = "TIME";
            String Jogo = "JOGO";
            String Vendedor = "VENDEDOR";
            String Funcionario = "FUNCIONARIO";
            String Acesso = "ACESSO";

            switch (escolha) {
                case 1:
                    System.out.println("\nSUA ESCOLHA FOI: " + Bilheteria);
                    Bilheteria bilheteria = new Bilheteria();
                    bilheteria.menuBilheteria();
                    break;
                case 2:
                    System.out.println("\nSUA ESCOLHA FOI: " + Pessoa);
                    Pessoa pessoa = new Pessoa("João", "123.456.789-00", "Rua A, 123", "9999-9999", "01/01/2000");
                    pessoa.mostrar();
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
                    Estadio estadio = new Estadio(1, "Neo Quimica Arena", "Distrito de Itaquera", 49000, 14, 16, "São Paulo");
                    estadio.mostrar();
                    break;
                case 6:
                    System.out.println("\nSUA ESCOLHA FOI: " + Time);
                    break;
                case 7:
                    System.out.println("\nSUA ESCOLHA FOI: " + Jogo);
                    Jogo jogo = new Jogo(1, "15 de Agosto", "12 horas", "Corinthias", "Flamengo", "Brasileirão");
                    jogo.informacoes();
                    break;
                case 8:
                    System.out.println("\nSUA ESCOLHA FOI: " + Vendedor);
                    break;
                case 9:
                    System.out.println("\nSUA ESCOLHA FOI: " + Funcionario);
                    break; 
                case 10:
                    System.out.println("\nSUA ESCOLHA FOI: " + Acesso);
                    Acesso acesso = new Acesso();
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
