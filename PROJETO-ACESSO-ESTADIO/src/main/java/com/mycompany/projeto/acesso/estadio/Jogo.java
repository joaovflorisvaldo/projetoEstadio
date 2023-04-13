/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.acesso.estadio;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Alexsander
 */
public class Jogo {
    private int idJogo;
    private int diaJogo;
    private int horarioJogo;
    private int classificacaoTime1;
    private int classificacaoTime2;
    private String nomeCampeonato;
    private int quantidadeJogos;
    private String escolherAcento;
    private float calendarioProximoJogo;
    
    public Jogo(int idJogo, LocalDate diaJogo, LocalTime horarioJogo, int classificacaoTime1, int classificacaoTime2, String nomeCampeonato, int quantidadeJogos, String escolherAcento) {
        this.idJogo = idJogo;
        this.diaJogo = diaJogo;
        this.horarioJogo = horarioJogo;
        this.classificacaoTime1 = classificacaoTime1;
        this.classificacaoTime2 = classificacaoTime2;
        this.nomeCampeonato = nomeCampeonato;
        this.quantidadeJogos = quantidadeJogos;
        this.escolherAcento = escolherAcento;
        this.calendarioProximoJogo = null;
    }
    
    public String calcularPlacar() {
        return classificacaoTime1 + " x " + classificacaoTime2;
    }
    
    public boolean mesmoDia(Jogo jogo) {
        return diaJogo.equals(jogo.getDiaJogo());
    }
    
    public boolean mesmoCampeonato(Jogo jogo) {
        return nomeCampeonato.equals(jogo.getNomeCampeonato());
    }
    
    public void imprimirInformacoes() {
        System.out.println("ID: " + idJogo);
        System.out.println("Data: " + diaJogo);
        System.out.println("Horário: " + horarioJogo);
        System.out.println("Placar: " + calcularPlacar());
        System.out.println("Campeonato: " + nomeCampeonato);
        System.out.println("Quantidade de jogos: " + quantidadeJogos);
        System.out.println("Acento escolhido: " + escolherAcento);
        System.out.println("Próximo jogo: " + calendarioProximoJogo);
    }
    
    public void atualizarCalendarioProximoJogo(LocalDate data) {
        calendarioProximoJogo = data;
    }
    
    public static void ordenarPorDataHorario(List<Jogo> jogos) {
        Collections.sort(jogos, new Comparator<Jogo>() {
            @Override
            public int compare(Jogo j1, Jogo j2) {
                if (j1.getDiaJogo().equals(j2.getDiaJogo())) {
                    return j1.getHorarioJogo().compareTo(j2.getHorarioJogo());
                } else {
                    return j1.getDiaJogo().compareTo(j2.getDiaJogo());
                }
            }
}
                
