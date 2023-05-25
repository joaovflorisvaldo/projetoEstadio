package com.mycompany.projeto.acesso.estadio;

public class Estadio extends Jogo {

    public static void main(String[] args) {
        Estadio estadio1 = new Estadio(1, "Neo Química Arena", "Distrito de Itaquera", 49000, 14, 16, "São Paulo", 1, "10/06/2023", 20, "Santos", "Corinthians", "Copa do Brasil");
        System.out.println("Localização: " + estadio1.nomeEstadio);
        System.out.println("Capacidade: " + estadio1.localizacao);
        System.out.println("Horário de funcionamento: " + estadio1.capacidade);
        System.out.println("Time da Casa: " + estadio1.getNomeTime1());    
        System.out.println("Time Visitante: " + estadio1.getNomeTime2());    
        System.out.println("Campeonato: " + estadio1.getNomeCampeonato());    
        System.out.println("Dia do jogo: " + estadio1.getDiaJogo());
        System.out.println("Horário do jogo: " + estadio1.getHorarioJogo());
    }
    
        private int idEstadio;
        private String nomeEstadio;
        private String localizacao;
        private int capacidade;
        private int horarioAberturaPotoes;
        private int horarioFuncionamento;
        private String cidadeEstadio;
            
        
    public Estadio(int idEstadio, String nomeEstadio, String localizacao, int capacidade, int horarioAberturaPotoes, int horarioFuncionamento, String cidadeEstadio, int idJogo, String diaJogo, int horarioJogo, String nomeTime1, String nomeTime2, String nomeCampeonato) {
        super(idJogo, diaJogo, horarioJogo, nomeTime1, nomeTime2, nomeCampeonato);
        this.idEstadio = idEstadio;
        this.nomeEstadio = nomeEstadio;
        this.localizacao = localizacao;
        this.capacidade = capacidade;
        this.horarioAberturaPotoes = horarioAberturaPotoes;
        this.horarioFuncionamento = horarioFuncionamento;
        this.cidadeEstadio = cidadeEstadio;

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

    public int getHorarioAberturaPotoes() {
        return horarioAberturaPotoes;
    }

    public void setHorarioAberturaPotoes(int horarioAberturaPotoes) {
        this.horarioAberturaPotoes = horarioAberturaPotoes;
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
