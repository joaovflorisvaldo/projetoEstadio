package com.mycompany.projeto.acesso.estadio;

public class Torcedor extends Pessoa {
    
    
    public Torcedor(String nome, String cpf, String endereco, String telefone, String dataNascimento) {
        super(nome, cpf, endereco, telefone, dataNascimento);
    }  
    public boolean socioTorcedor;
    
    public static void main (String[] args ){
    
       Torcedor torcedor1 = new Torcedor  ("paulo", "99966655545", "Rua sao Paulo", "45999875465","17/05/2000");
        System.out.println("Nome; "+ torcedor1.nome);
        System.out.println("CPF; "+ torcedor1.getCpf());
        System.out.println("Telefone; "+ torcedor1.getTelefone());
   
    }
    
 
}
    
            
    


