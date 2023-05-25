package com.mycompany.projeto.acesso.estadio;

import java.util.Scanner;

public class Bilheteria {
    
    private int totalDisponiveis;
    private int inteirasVendidas;
    private int meiaEntradasVendidas;
    private int vipVendidas;
    public int entradasVendidas;
    public double valorInteira;
    public double valorMeiaEntrada;
    public double valorVip;
    public double valorTotal;

    public Bilheteria(int totalDisponiveis, int inteirasVendidas, int meiaEntradasVendidas, int vipVendidas, int entradasVendidas, double valorInteira, double valorMeiaEntrada, double valorVip, double valorTotal) {
        this.totalDisponiveis = totalDisponiveis;
        this.inteirasVendidas = inteirasVendidas;
        this.meiaEntradasVendidas = meiaEntradasVendidas;
        this.vipVendidas = vipVendidas;
        this.entradasVendidas = entradasVendidas;
        this.valorInteira = valorInteira;
        this.valorMeiaEntrada = valorMeiaEntrada;
        this.valorVip = valorVip;
        this.valorTotal = valorTotal;
    }

    public int getTotalDisponiveis() {
        return totalDisponiveis;
    }

    public void setTotalDisponiveis(int totalDisponiveis) {
        this.totalDisponiveis = totalDisponiveis;
    }
    
    public int getInteirasVendidas() {
        return inteirasVendidas;
    }

    public void setInteirasVendidas(int inteirasVendidas) {
        this.inteirasVendidas = inteirasVendidas;
    }

    public int getMeiaEntradasVendidas() {
        return meiaEntradasVendidas;
    }

    public void setMeiaEntradasVendidas(int meiaEntradasVendidas) {
        this.meiaEntradasVendidas = meiaEntradasVendidas;
    }

    public int getVipVendidas() {
        return vipVendidas;
    }

    public void setVipVendidas(int vipVendidas) {
        this.vipVendidas = vipVendidas;
    }
    
    public void ingressosVendidos(){
        this.entradasVendidas = this.inteirasVendidas + this.meiaEntradasVendidas + this.vipVendidas;
    }
    
    public void valorArrecadado(){
        this.valorTotal = (this.inteirasVendidas * this.valorInteira) + (this.meiaEntradasVendidas * this.valorMeiaEntrada) + (this.vipVendidas * this.valorVip);
    }
    
    public void comprarEntrada(){ 
        
        String nome;
        String cpf;
        String setorTorcida = "Casa ou Visitante"; 
        int torcedor;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("CONFORME A TABELA INFORME QUAL ENTRADA DESEJA COMPRAR");
        System.out.println("[1]INTEIRA: ");
        System.out.println("[2]MEIA-ENTRADA: ");
        System.out.println("[3]ENTRADA VIP: ");
        
        int opcao = ler.nextInt();
        
        switch (opcao){
            case 1:
                System.out.println("VOCÊ SELECIONOU A OPÇÃO INTEIRA, PARA CONTINUAR INFORME SEUS DADOS");
                System.out.println("NOME: ");
                nome = ler.next();
                System.out.println("CPF: ");
                cpf = ler.next();
                System.out.println("TORCEDOR DO TIME DA CASA OU VISITANTE?");
                System.out.println("[4]TIME DA CASA");
                System.out.println("[5]TIME VISITANTE");
                torcedor = ler.nextInt();
                
            switch (torcedor) {
                case 4:
                    setorTorcida = "Casa";
                    break;
                case 2:
                    setorTorcida = "Visitante";
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA");
                    break;
            }
                
                System.out.println("*ENTRADA COMPRADA COM SUCESSO*");
                System.out.println("Dados:");
                System.out.println("Nome\t" + nome);
                System.out.println("CPF\t" + cpf);
                System.out.println("Setor\t" + setorTorcida);
                break;
            case 2:
                System.out.println("VOCÊ SELECIONOU A OPÇÃO INTEIRA, PARA CONTINUAR INFORME SEUS DADOS");
                System.out.println("NOME: ");
                nome = ler.next();
                System.out.println("CPF: ");
                cpf = ler.next();
                System.out.println("TORCEDOR DO TIME DA CASA OU VISITANTE?");
                System.out.println("[4]TIME DA CASA");
                System.out.println("[5]TIME VISITANTE");
                torcedor = ler.nextInt();
                
            switch (torcedor) {
                case 4:
                    setorTorcida = "Time da Casa";
                    break;
                case 2:
                    setorTorcida = "Time Visitante";
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA");
                    break;
            }
                
                System.out.println("*ENTRADA COMPRADA COM SUCESSO*");
                System.out.println("Dados:");
                System.out.println("Nome\t" + nome);
                System.out.println("CPF\t" + cpf);
                System.out.println("Setor\t" + setorTorcida);
                break;
            case 3:
                                System.out.println("VOCÊ SELECIONOU A OPÇÃO INTEIRA, PARA CONTINUAR INFORME SEUS DADOS");
                System.out.println("NOME: ");
                nome = ler.next();
                System.out.println("CPF: ");
                cpf = ler.next();
                System.out.println("TORCEDOR DO TIME DA CASA OU VISITANTE?");
                System.out.println("[4]TIME DA CASA");
                System.out.println("[5]TIME VISITANTE");
                torcedor = ler.nextInt();
                
            switch (torcedor) {
                case 4:
                    setorTorcida = "Time da Casa";
                    break;
                case 2:
                    setorTorcida = "Time Visitante";
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA");
                    break;
            }
                
                System.out.println("*ENTRADA COMPRADA COM SUCESSO*");
                System.out.println("Dados:");
                System.out.println("Nome\t" + nome);
                System.out.println("CPF\t" + cpf);
                System.out.println("Setor\t" + setorTorcida);
                break;
            default :
                System.out.println("OPÇÃO INVÁLIDA.");
                break;
        }
    }
}
    /*
        if (opcao.equals("1")) {
            System.out.println("\nVocê selecionou ingresso normal!");

        } else if (resultado.equals(("2"))) {
            System.out.println("\nVocê selecionou meia entrada!");
        } else if (resultado.equals("3")) {
            System.out.println("\nVocê selecionou ingrsso VIP!");
        } else {
            System.out.println("\nSelecione uma opção válida.");
        }
   


    public void validarIngressoPorPessoa() {
        for (int i = 2; i > 0; i--) {

            Scanner read = new Scanner(System.in);

            System.out.println("Quantos ingressos você quer comprar? ");

            int quantidade = read.nextInt();

            if (quantidade > 5) {
                System.out.println("\nVocê excedeu a quantidade de ingressos por pessoa!!(Selecione uma quantidade inferior a 5)\n");
                i = 2;

            } else {
                System.out.println("Você selecionou " + quantidade + " Ingresso(s)");

            }
        }
    }
    */
