package com.mycompany.projeto.acesso.estadio;

public class Estadio {

    private int idEstadio;
        private String nomeEstadio;
        private String localizacao;
        private int capacidade;
        private int horarioAberturaPortoes;
        private int horarioFuncionamento;
        private String cidadeEstadio;

    public Estadio(int idEstadio, String nomeEstadio, String localizacao, int capacidade, int horarioAberturaPortoes, int horarioFuncionamento, String cidadeEstadio) {
        this.idEstadio = idEstadio;
        this.nomeEstadio = nomeEstadio;
        this.localizacao = localizacao;
        this.capacidade = capacidade;
        this.horarioAberturaPortoes = horarioAberturaPortoes;
        this.horarioFuncionamento = horarioFuncionamento;
        this.cidadeEstadio = cidadeEstadio;
    }
    
    
    
    public void mostrar(){
        System.out.println("Nome do Estadio: " + this.getNomeEstadio());
        System.out.println("Localização: " + this.getLocalizacao());
        System.out.println("Capacidade: " + this.getCapacidade());
        System.out.println("Abertura: " + this.getHorarioAberturaPortoes() + " horas");
        System.out.println("Horário de funcionamento: " + this.getHorarioFuncionamento() + " horas");
        System.out.println("Cidade do estádio: " + this.getCidadeEstadio());
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
        return horarioAberturaPortoes;
    }

    public void setHorarioAberturaPortoes(int horarioAberturaPortoes) {
        this.horarioAberturaPortoes = horarioAberturaPortoes;
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

   
       
    }


  
