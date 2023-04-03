package com.mycompany.menu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class Bilheteria {
    private int qntddIngressosDisponibilizados;
    public  int qtddIngressosVedidos;
    public int qtddIngressosDisponiveis;
    public int limiteIngressoPorPessoa;
    public double valorIngressoNormal;
    public double valorIngressoMeiaEntrada;
    public double valorIngressoVip;
    
    public void venderIngressos(double aValorIngressoNormal, double aValorIngressoMeiaEntrada, double aValorIngressoVip){
        System.out.println("\n[1]VALOR DO INGRESSO NORMAL: "+aValorIngressoNormal);
        System.out.println("\n[2]VALOR DE MEIA-ENTRADA: "+ aValorIngressoMeiaEntrada);
        System.out.println("\n[3]VALOR DO INGRESSO VIP: "+ aValorIngressoVip);
        System.out.println("\nSELECIONE A OPÇÃO DO INGRESSO: ");
        Scanner ler = new Scanner(System.in);
        
         String resultado = ler.nextLine();
         
         if(resultado.equals("1")){
             System.out.println("\nVocê selecionou ingresso normal!");

         }
        else if (resultado.equals(("2"))){
             System.out.println("\nVocê selecionou meia entrada!");
         }
        else if (resultado.equals("3")){
                 System.out.println("\nVocê selecionou ingrsso VIP!");
         }
         
         else  {
             System.out.println("\nSelecione uma opção válida.");
             
         }
         
        
    }
    
    
    public int getQntddIngressosDisponibilizados() {
        return qntddIngressosDisponibilizados;
    }

    public void setQntddIngressosDisponibilizados(int qntddIngressosDisponibilizados) {
        this.qntddIngressosDisponibilizados = qntddIngressosDisponibilizados;
    }

    public int getQtddIngressosVedidos() {
        return qtddIngressosVedidos;
    }

    public int getQtddIngressosDisponiveis() {
        return qtddIngressosDisponiveis;
    }

    public int getLimiteIngressoPorPessoa() {
        return limiteIngressoPorPessoa;
    }
    
    
}
