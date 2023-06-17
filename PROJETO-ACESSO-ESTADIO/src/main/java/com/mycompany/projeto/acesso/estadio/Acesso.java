package com.mycompany.projeto.acesso.estadio;

import java.util.Scanner;

/**
 ***
 * @author Maria
 */
public class Acesso{
    
    private String ingresso;
    private String codigoIngresso;

    public String getIngresso() {
        return ingresso;
    }

    public void setIngresso(String ingresso) {
        this.ingresso = ingresso;
    }

    public String getCodigoIngresso() {
        return codigoIngresso;
    }

    public void setCodigoIngresso(String codigoIngresso) {
        this.codigoIngresso = codigoIngresso;
    }
    
    public void validarAcesso(){
        
        Scanner ler = new Scanner(System.in);
        
        Ingresso validaIngresso = new Ingresso();
        setIngresso(validaIngresso.lerIngresso());
        
        do{
            System.out.println("\nINFORME O CÓDIGO DA ENTRADA");
            setCodigoIngresso(ler.next());
            
            if(getCodigoIngresso().equals(getIngresso())){
                System.out.println("\nENTRADA AUTORIAZADA!");
            }else{
                System.out.println("\nENTRADA NEGADA, TENTE NOVAMENTE!");
            }
        }while(false);
    }  
}