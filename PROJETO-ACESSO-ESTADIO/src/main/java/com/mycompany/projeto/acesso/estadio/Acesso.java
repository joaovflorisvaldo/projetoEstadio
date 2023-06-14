package com.mycompany.projeto.acesso.estadio;

import java.util.Scanner;

public class Acesso{

    private int entrada;
    
    public void validarAcesso(){
        
        Scanner ler = new Scanner(System.in);
        Bilheteria bilheteria = new Bilheteria();
        
        do{
            System.out.println("\nINFORME O CÓDIGO DA ENTRADA");
            entrada = ler.nextInt();
            if(entrada == bilheteria.getCodigoEntrada()){
                System.out.println("\nENTRADA AUTORIAZADA!");
            }else{
                System.out.println("\nENTRADA NEGADA, TENTE NOVAMENTE!");
            }
        }while(false);
    }  
}