package com.mycompany.projeto.acesso.estadio;

public class Jogo {

    private int idJogo;
    private String diaJogo;
    private String horarioJogo;
    private String nomeTime1;
    private String nomeTime2;
    private String nomeCampeonato;

    public Jogo(int idJogo, String diaJogo, String horarioJogo, String nomeTime1, String nomeTime2, String nomeCampeonato) {
        this.idJogo = idJogo;
        this.diaJogo = diaJogo;
        this.horarioJogo = horarioJogo;
        this.nomeTime1 = nomeTime1;
        this.nomeTime2 = nomeTime2;
        this.nomeCampeonato = nomeCampeonato;
    }

    public void informacoes(){
        System.out.println("O dia do jogo vai ser: " + this.getDiaJogo());
        System.out.println("O horário do jogo vai ser as: " + this.getHorarioJogo());
        System.out.println("O nome do time da casa é: " + this.getNomeTime1());
        System.out.println("O nome do time adversário é: " + this.getNomeTime2());
        System.out.println("O campeonato que está acontecendo é o: " + this.getNomeCampeonato());
       
    }

    public int getIdJogo() {
        return idJogo;
    }

    public void setIdJogo(int idJogo) {
        this.idJogo = idJogo;
    }

    public String getDiaJogo() {
        return diaJogo;
    }

    public void setDiaJogo(String diaJogo) {
        this.diaJogo = diaJogo;
    }

    public String getHorarioJogo() {
        return horarioJogo;
    }

    public void setHorarioJogo(String horarioJogo) {
        this.horarioJogo = horarioJogo;
    }

    public String getNomeTime1() {
        return nomeTime1;
    }

    public void setNomeTime1(String nomeTime1) {
        this.nomeTime1 = nomeTime1;
    }

    public String getNomeTime2() {
        return nomeTime2;
    }

    public void setNomeTime2(String nomeTime2) {
        this.nomeTime2 = nomeTime2;
    }

    public String getNomeCampeonato() {
        return nomeCampeonato;
    }

    public void setNomeCampeonato(String nomeCampeonato) {
        this.nomeCampeonato = nomeCampeonato;
    }

}
