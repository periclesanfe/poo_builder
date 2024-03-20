package com.meu.projeto;

public class Predio {
    private String nomTipo;
    private int numAndares;
    private String nomMaterial;
    private String decoracao;
    private String elevador;
    private String portaria;
    private boolean areaComum;
    private boolean sistemaEletrico;
    private boolean sistemaHidraulico;
    private boolean pinturaExterna;
    private boolean pinturaInterna;
    private boolean sistemaPrevencaoIncendio;
    private boolean sistemaSeguranca;
    private boolean sistemaArCondicionado;
    private boolean sistemaInternet;
    private boolean sistemaTelevisao;
    private boolean estacionamento;

    interface ConstrutorDePredios {
        void construirEstrutura();
        void instalarSistemas();
        void construirUtilidades();
        void finalizar();
        Predio getPredio();
        void closeScanner();
    }

    public String GET() {
        String retorno = "Estrutura principal:\n- Tipo: " + this.nomTipo + "\n- Andares: " + this.numAndares + "\n- Material: " + this.nomMaterial + "\n- Elevador: "+this.elevador+"\n- Portaria: " + this.portaria + "\n- Decoração: " + this.decoracao + "\n";
        retorno += "Sistemas:\n";
        if (this.areaComum) {retorno += "- Área comum para os moradores, com piscina e parquinho infantil.\n";}
        if (this.sistemaEletrico) {retorno += "- Sistema elétrico.\n";}
        if (this.sistemaHidraulico) {retorno += "- Sistema hidráulico.\n";}
        if (this.pinturaExterna && this.pinturaInterna) {retorno += "- Pintura interna e externa.\n";}
        if (this.sistemaPrevencaoIncendio) {retorno += "- Sistema de prevenção de incêndio.\n";}
        if (this.sistemaSeguranca) {retorno += "- Sistema de segurança.\n";}
        if (this.sistemaArCondicionado) {retorno += "- Sistema de ar condicionado.\n";}
        if (this.sistemaInternet) {retorno += "- Sistema de internet.\n";}
        if (this.sistemaTelevisao) {retorno += "- Sistema de televisão.\n";}
        if (this.estacionamento) {retorno += "- Estacionamento.\n";}
        return retorno;
    }

    public void setTipo(String nomTipo) {
        this.nomTipo = nomTipo;
    }

    public void setNumAndares(int numAndares) {
        this.numAndares = numAndares;
    }

    public void setMaterial(String nomMaterial) {
        this.nomMaterial = nomMaterial;
    }

    public void setSistemaEletrico() {
        this.sistemaEletrico = true;
    }

    public void setSistemaHidraulico() {
        this.sistemaHidraulico = true;
    }

    public void setPinturaExterna() {
        this.pinturaExterna = true;
    }

    public void setPinturaInterna() {
        this.pinturaInterna = true;
    }

    public void setSistemaPrevencaoIncendio() {
        this.sistemaPrevencaoIncendio = true;
    }

    public void setDecoracao(String decoracao) {
        this.decoracao = decoracao;
    }

    public void setSistemaSeguranca() {
        this.sistemaSeguranca = true;
    }

    public void setSistemaArCondicionado() {
        this.sistemaArCondicionado = true;
    }

    public void setElevador(String elevador) {
        this.elevador = elevador;
    }

    public void setAreaComum() {
        this.areaComum = true;
    }

    public void setSistemaInternet() {
        this.sistemaInternet = true;
    }

    public void setSistemaTelevisao() {
        this.sistemaTelevisao = true;
    }

    public void setEstacionamento() {
        this.estacionamento = true;
    }

    public void setPortaria(String portaria) {
        this.portaria = portaria;
    }
}


