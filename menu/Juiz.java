/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menu;
import java.util.Scanner; 
/**
 *; Analista Responsável: Nicolas Leandro  - Desenvolvedor: Lucas 
 * @author lucas
 */
public class Juiz {
    public String nomeJuiz; 
    public String organizacaoFutebol; 
    public int cpf;
    public int rg; 
    public int telefone;
    private double salario;
    
    public Juiz (String aNomeJuiz, String aOrganizacaoFutebol, int aCpf, int aRg, int aTelefone, double aSalario){
    this.nomeJuiz = aNomeJuiz;
    this.organizacaoFutebol = aOrganizacaoFutebol;
    this.cpf = aCpf; 
    this.rg = aRg; 
    this.telefone = aTelefone;
    this.salario = aSalario;
    
    
    }

    Juiz() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public double getSalario(){
        return this.salario;
    }
    Scanner ler = new Scanner (System.in);
  
    public void CadastrarJuiz(){
    System.out.println("NOME: "+this.nomeJuiz);
    
    System.out.println("ORGANIZAÇÃO DE FUTEBOL: "+this.organizacaoFutebol);
    System.out.println("CPF: "+this.cpf);
    System.out.println("RG: "+this.rg);
    System.out.println("TELEFONE: "+this.telefone);
    System.out.println("SALARIO: "+this.salario);
    
    }

}

