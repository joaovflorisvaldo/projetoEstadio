package com.mycompany.projeto.acesso.estadio;

public class Acesso extends Bilheteria{

    private int acessoInteiras;
    private int acessoMeiaEntrada;
    private int acessoVip;
    
    public Acesso(int acessoInteiras, int acessoMeiaEntrada, int acessoVip, int totalDisponiveis, int inteirasVendidas, int meiaEntradasVendidas, int vipVendidas, int entradasVendidas, double valorInteira, double valorMeiaEntrada, double valorVip, double valorTotal) {
        super(totalDisponiveis, inteirasVendidas, meiaEntradasVendidas, vipVendidas, entradasVendidas, valorInteira, valorMeiaEntrada, valorVip, valorTotal);
        this.acessoInteiras = acessoInteiras;
        this.acessoMeiaEntrada = acessoMeiaEntrada;
        this.acessoVip = acessoVip;
    }

    public int getAcessoInteiras() {
        return acessoInteiras;
    }

    public void setAcessoInteiras(int acessoInteiras) {
        this.acessoInteiras = acessoInteiras;
    }

    public int getAcessoMeiaEntrada() {
        return acessoMeiaEntrada;
    }

    public void setAcessoMeiaEntrada(int acessoMeiaEntrada) {
        this.acessoMeiaEntrada = acessoMeiaEntrada;
    }

    public int getAcessoVip() {
        return acessoVip;
    }

    public void setAcessoVip(int acessoVip) {
        this.acessoVip = acessoVip;
    }
    
}
    
    /*public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        Acesso acesso = new Acesso();
        Calendar horaAtual = Calendar.getInstance();
        Calendar dataAtual = Calendar.getInstance();
        SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatarHora = new SimpleDateFormat("HH:mm:ss");

        System.out.println("Usuário de Acesso: ");
        acesso.setQuemAcessa(n.nextLine());
        
        System.out.println("Dia de Acesso: " + formatarData.format(dataAtual.getTime()));
        acesso.setDiaAcesso(dataAtual);
        
        System.out.println("Horário de Acesso: " + formatarHora.format(horaAtual.getTime()));
        acesso.setHoraAcesso(horaAtual.get(Calendar.HOUR_OF_DAY));
        
        System.out.println("Nome do comprador: ");
        acesso.setNome(n.nextLine());
        
        System.out.println("CPF do comprador: ");
        acesso.setCpf(n.nextLine());
        
        System.out.println("Data de nascimento do comprador (dd/mm/yyyy): ");
        Calendar nascimento = Calendar.getInstance();
        nascimento.setTimeInMillis(n.nextLong());
        acesso.setNascimento(nascimento);
        
        System.out.println("Selecione o tipo de ingresso (VIP ou NORMAL):");
        String tipoIngresso = n.nextLine().toUpperCase();
        
        while (!tipoIngresso.equals("VIP") && !tipoIngresso.equals("NORMAL")) {
            System.out.println("Selecione o tipo de ingresso (VIP ou NORMAL):");
            tipoIngresso = n.nextLine().toUpperCase();
        }
        acesso.validarAcesso();
        acesso.imprimirDadosAcesso();
    }

    public void validarAcesso() {
        if (quemAcessa == null || diaAcesso == null || nome == null || cpf == null || nascimento == null) {
            System.out.println("Acesso negado. Todos os atributos obrigatórios devem ser informados.");
            acessoPermitido = false;
        } else {
            acessoPermitido = true;
        }
    }
    public void imprimirDadosAcesso() {
        if (acessoPermitido == true) {
            System.out.println("Usuário de Acesso: " + quemAcessa);
            System.out.println("Dia de Acesso: " + diaAcesso.getTime());
            System.out.println("Horário de Acesso: " + horaAcesso);
            System.out.println("Nome do comprador: " + nome);
            System.out.println("CPF do comprador: " + cpf);
            System.out.println("Data de nascimento do comprador: " + nascimento.getTime());
            System.out.println("ID do comprador: " + idPessoa);
            System.out.println("Tipo do Ingresso selecionado: " + tipoIngresso);
        }
    }
    
    public String getQuemAcessa() {
        return quemAcessa;
    }

    public void setQuemAcessa(String quemAcessa) {
        this.quemAcessa = quemAcessa;
    }

    public Calendar getDiaAcesso() {
        return diaAcesso;
    }

    public void setDiaAcesso(Calendar diaAcesso) {
        this.diaAcesso = diaAcesso;
    }

    public int getHoraAcesso() {
        return horaAcesso;
    }

    public void setHoraAcesso(int horaAcesso) {
        this.horaAcesso = horaAcesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Calendar getNascimento() {
    return nascimento;
}

public void setNascimento(Calendar nascimento) {
    this.nascimento = nascimento;
}

public int getIdPessoa() {
    return idPessoa;
}

public void setIdPessoa(int idPessoa) {
    this.idPessoa = idPessoa;
}

public enum TipoIngresso {
    VIP,
    NORMAL,
}

public TipoIngresso getTipoIngresso() {
        return tipoIngresso;
}
*/

