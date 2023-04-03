/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menu;

/**
 *Análista Responsável: Pablo Simionni - Desenvolvedor: Lucas Leopolski 
 * @author lucas
 */
public class Cidade {
    public String cidadeTime1;
    public String cidadeTime2; 
    public String cidadeEstadio; 
    private String deslocamentoEstadio; 
    
    public Cidade(String aCddTime1,String aCddTime2, String aCddEstadio, String aDeslocEstadio){
    this.cidadeTime1 = aCddTime1;
    this.cidadeTime2 = aCddTime2;
    this.cidadeEstadio = aCddEstadio;
    this.deslocamentoEstadio = aDeslocEstadio;
    
    
    }
    
    public String getDescricaoCidade(){
        return cidadeEstadio;
    }
    
}
