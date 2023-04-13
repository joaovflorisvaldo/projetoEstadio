/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.acesso.estadio;

/**
 ***
 * @author Roney
 */
public class Estadio {
    private int idEstadio;
    private String nomeEstadio;
    private String localizacao;
    private int capacidade;
    private int horarioAberturaPotoes;
    private int horarioFuncionamento;
    private String cidadeEstadio;
    private boolean coberto;
    private String timeCasa;

    public Estadio(int idEstadio, String nomeEstadio, String localizacao, int capacidade, int horarioAberturaPortoes,
                   int horarioFuncionamento, String cidadeEstadio, boolean coberto, String timeCasa) {
        this.idEstadio = idEstadio;
        this.nomeEstadio = nomeEstadio;
        this.localizacao = localizacao;
        this.capacidade = capacidade;
        this.horarioAberturaPotoes = horarioAberturaPortoes;
        this.horarioFuncionamento = horarioFuncionamento;
        this.cidadeEstadio = cidadeEstadio;
        this.coberto = coberto;
        this.timeCasa = timeCasa;
    }
    public static void main(String[] args) {
        Estadio estadio1 = new Estadio(1, "Neo Química Arena", "Distrito de Itaquera", 49000, 14, 16, "São Paulo", true, "Corinthians");
        System.out.println("Nome do Estádio: " + estadio1.getNomeEstadio());
        System.out.println("Localização: " + estadio1.getLocalizacao());
        System.out.println("Capacidade: " + estadio1.getCapacidade());
        System.out.println("Horário de abertura dos portões: " + estadio1.getHorarioAberturaPortoes());
        System.out.println("Horário de funcionamento: " + estadio1.getHorarioFuncionamento());
        System.out.println("Cidade do Estádio: " + estadio1.getCidadeEstadio());
        System.out.println("Está coberto? " + estadio1.isCoberto());
        System.out.println("Time da casa: " + estadio1.getTimeCasa());
        
        Estadio estadio2 = new Estadio (2, "Olímpico Regional Arnaldo Busatto", "Bairro Santa Cruz", 25000, 14, 16, "Cascavel", false, "F.C Cascavel");
        System.out.println("Nome do Estádio: " + estadio2.getNomeEstadio());
        System.out.println("Localização: " + estadio2.getLocalizacao());
        System.out.println("Capacidade: " + estadio2.getCapacidade());
        System.out.println("Horário de abertura dos portões: " + estadio2.getHorarioAberturaPortoes());
        System.out.println("Horário de funcionamento: " + estadio2.getHorarioFuncionamento());
        System.out.println("Cidade do Estádio: " + estadio2.getCidadeEstadio());
        System.out.println("Está coberto? " + estadio2.isCoberto());
        System.out.println("Time da casa: " + estadio2.getTimeCasa());       
    }

    public int getIdEstadio() {
        return idEstadio;
    }

    public void setIdEstadio(int idEstadio) {
        this.idEstadio = idEstadio;
    }

    public String getNomeEstadio() {
        return nomeEstadio;
    }

    public void setNomeEstadio(String nomeEstadio) {
        this.nomeEstadio = nomeEstadio;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getHorarioAberturaPortoes() {
        return horarioAberturaPotoes;
    }

    public void setHorarioAberturaPortoes(int horarioAberturaPortoes) {
        this.horarioAberturaPotoes = horarioAberturaPortoes;
    }

    public int getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(int horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public String getCidadeEstadio() {
        return cidadeEstadio;
    }

    public void setCidadeEstadio(String cidadeEstadio) {
        this.cidadeEstadio = cidadeEstadio;
    }

    public boolean isCoberto() {
        return coberto;
    }

    public void setCoberto(boolean coberto) {
        this.coberto = coberto;
    }

    public String getTimeCasa() {
        return timeCasa;
    }

    public void setTimeCasa(String timeCasa) {
        this.timeCasa = timeCasa;
    }
}
