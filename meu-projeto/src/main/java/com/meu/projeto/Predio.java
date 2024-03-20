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
    }

    public String GET() {
        String retorno = "- Tipo: " + this.nomTipo + "\n- Andares: " + this.numAndares + "\n- Material: " + this.nomMaterial + "\n- Elevador: "+this.elevador+"\n- Portaria: " + this.portaria + "\n- Decoração: " + this.decoracao;
        if (this.areaComum) {System.out.println("O prédio conta com uma área comum para os moradores, com piscina e parquinho infantil.");}
        if (this.sistemaEletrico) {System.out.println("O prédio conta com sistema elétrico.");}
        if (this.sistemaHidraulico) {System.out.println("O prédio conta com sistema hidráulico.");}
        if (this.pinturaExterna && this.pinturaInterna) {System.out.println("O prédio conta com pintura interna e externa.");}
        if (this.sistemaPrevencaoIncendio) {System.out.println("O prédio conta com sistema de prevenção de incêndio.");}
        if (this.sistemaSeguranca) {System.out.println("O prédio conta com sistema de segurança.");}
        if (this.sistemaArCondicionado) {System.out.println("O prédio conta com sistema de ar condicionado.");}
        if (this.sistemaInternet) {System.out.println("O prédio conta com sistema de internet.");}
        if (this.sistemaTelevisao) {System.out.println("O prédio conta com sistema de televisão.");}
        if (this.estacionamento) {System.out.println("O prédio conta com estacionamento.");}
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


