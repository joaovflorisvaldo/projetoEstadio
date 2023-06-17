package com.mycompany.projeto.acesso.estadio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author Maria
 */
public class Ingresso {
    
    private int codigoIngresso;
    
    public int getCodigoIngresso() {
        return codigoIngresso;
    }

    public void setCodigoIngresso(int codigoIngresso) {
        this.codigoIngresso = codigoIngresso;
    }
    
    public void gerarIngresso(){
        
        Random codigo = new Random();
        codigoIngresso = codigo.nextInt(100);
    }
    
    public void salvarIngresso(){
        
        try{
            FileWriter writer = new FileWriter("CODIGOINGRESSO.txt", true);
            writer.write(Integer.toString(codigoIngresso));
            writer.write(System.lineSeparator());
            writer.close();
            System.out.println("INGRESSO COMPRADO COM SUCESSO.");
        }catch(IOException e){
            System.out.println("NÃO FOI POSSÍVEL CONCLUIR A COMPRA, TENTE NOVAMENTE.");
        }
    }
    
    public String lerIngresso(){
        String linha = null;
        
        try(BufferedReader reader = new BufferedReader(new FileReader("CODIGOINGRESSO.txt"))) {
            linha = reader.readLine();
        } catch(IOException e){
        } 
        return linha;
    }
}
