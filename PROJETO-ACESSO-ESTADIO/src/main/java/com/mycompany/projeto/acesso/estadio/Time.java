package com.mycompany.projeto.acesso.estadio;

/*
 * @author Renan
 */
public class Time {

    public String time1;
    public String time2;
    public String jogadoresTime1;
    public String jogadoresTime2;
    public String tecnicoTime1;
    public String tecnicoTime2;
    public String nomeEstadioJogo;
    public String divisaoTime1;
    public String divisaoTime2;
    private String nomeTorcidaOrganizadaTime1;
    private String nomeTorcidaOrganizadaTime2;

    public void contratarJogador() {
        System.out.println("contratar jogador");
    }

    public void demitirJogador() {
        System.out.println("demitir jogador");
    }

    public void salarioJogar() {
        System.out.println("pagar salario");
    }

    public String getNomeTorcidaOrganizadaTime1() {
        return nomeTorcidaOrganizadaTime1;
    }

    public String getNomeTorcidaOrganizadaTime2() {
        return nomeTorcidaOrganizadaTime2;
    }

}
