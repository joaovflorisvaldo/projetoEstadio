package com.mycompany.projeto.acesso.estadio;

import java.util.Scanner;

/**
 ***
 * @author Maria
 */
public class Bilheteria {
    
    Scanner ler = new Scanner(System.in);
   
    private int totalDisponiveis = 1000;
    private int inteirasVendidas = 512;
    private int meiaEntradasVendidas = 256;
    private int vipVendidas = 210;
    public int entradasVendidas;
    public double valorInteira = 40.0;
    public double valorMeiaEntrada = 20.0;
    public double valorVip = 55.0;
    public double valorTotal;

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
    
    public void comprarIngresso(){ 

        int escolha;
        
        do{
            System.out.println("\nCONFORME A TABELA INFORME QUAL ENTRADA DESEJA COMPRAR");
            System.out.println("[1]INTEIRA: ");
            System.out.println("[2]MEIA-ENTRADA: ");
            System.out.println("[3]ENTRADA VIP: ");
            System.out.println("[0]SAIR");
        
            escolha = ler.nextInt();

            switch (escolha){
                case 1:
                    imprimirCompra();
                    break;
                case 2:
                    imprimirCompra();
                    break;
                case 3:
                    imprimirCompra();
                    break;
                case 0 :
                    System.out.println("\nVOCÊ ESCOLHEU SAIR DA BILHETERIA.");
                    break;
                default :
                    System.out.println("\nOPÇÃO INVÁLIDA.");
                    break;
            }   
        }while(escolha != 0);
    }
    
    public void imprimirCompra(){
        
        String nome;
        String cpf;
        String setorTorcida = "Casa ou Visitante"; 
        int torcedor;
        
        Ingresso ingresso = new Ingresso();
        
        System.out.println("\nVOCÊ SELECIONOU A OPÇÃO INTEIRA, PARA CONTINUAR INFORME SEUS DADOS");
        System.out.println("NOME: ");
        nome = ler.next();
        System.out.println("CPF: ");
        cpf = ler.next();
        System.out.println("\nTORCEDOR DO TIME DA CASA OU VISITANTE?");
        System.out.println("[1]TIME DA CASA");
        System.out.println("[2]TIME VISITANTE");
        torcedor = ler.nextInt();
                
        switch (torcedor) {
            case 1:
                setorTorcida = "CASA";
                ingresso.gerarIngresso();
                ingresso.salvarIngresso();
                break;
            case 2:
                setorTorcida = "VISITANE";
                ingresso.gerarIngresso();
                ingresso.salvarIngresso();
                break;
            default:
                System.out.println("OPÇÃO INVÁLIDA");
                break;
            }
                    
            System.out.println("\nDados:");
            System.out.println("Nome\t\t\t" + nome);
            System.out.println("CPF\t\t\t" + cpf);
            System.out.println("Setor\t\t\t" + setorTorcida);
            System.out.println("Código do ingresso\t" + ingresso.getCodigoIngresso() );
    }
}