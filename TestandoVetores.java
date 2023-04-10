/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testandovetores;

import java.util.Arrays;

/**
 *
 * @author lucas
 */
public class TestandoVetores {

    public static void main(String[] args) {
        int n []= {498,24,1,144};
        Arrays.sort(n); // vai imprir na tela os vetores em ordem crescevte do menor para o maior 
    
        for(int c=0; c<=3; c++){
            System.out.println("Na posição: " +c+ " Temos o valor: "+n[c]+"\n");
        }
        
        
        
        // OUTRO FORMA DE USAR O VETOR - VERTOR FOR INT (FUNCIONA EXCLUSIVAMENTE PARA COLEÇÕES / VETORES)
        
        double v []= {14.5, 17.3, 28.4, 18.7, 180.4}; // criou um vetor chamado 'v' e passou seus valores do tipo double 
        Arrays.sort(v);
        
        for(double valor: v){// criou um for e uma variavel do tipo double que vai receber os valores do vetor
            System.out.println(valor);} // está imprimindo a variavel que recebe os valores do vetor
            System.out.println("\n\n");
   
    // PROCURANDO UM VALOR DENTRO DO VETOR 
    
    int vetor [] = {4, 8, 1,3,56};
    
    for(int t: vetor){
        System.out.println(t);
    }
    int p = Arrays.binarySearch(vetor,1);
    
    
    System.out.print("\n\nEncontrei o valor na posição: "+p);
    
    }
    
}
