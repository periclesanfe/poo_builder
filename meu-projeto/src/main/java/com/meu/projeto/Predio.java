package com.meu.projeto;

public class Predio {
    private String nomTipo;
    private int numAndares;
    private String nomMaterial;
    private boolean sistemaEletrico;
    private boolean sistemaHidraulico;
    private boolean pinturaExterna;
    private boolean pinturaInterna;

    interface ConstrutorDePredios {
        void construirEstrutura();
        void instalarSistemas();
        void finalizar();
        Predio getPredio();
    }

    public String GET() {
        String retorno = "- Tipo: " + this.nomTipo + "\n- Andares: " + this.numAndares + "\n- Material: " + this.nomMaterial + "\n";
        if (this.sistemaEletrico) {retorno += "- Sistema elétrico instalado\n";}
        if (this.sistemaHidraulico) {retorno += "- Sistema hidráulico instalado\n";}
        if (this.pinturaExterna && this.pinturaInterna) {retorno += "- Pintura interna e externa finalizadas\n";}
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

    public void setSistemaEletrico(boolean sistemaEletrico) {
        this.sistemaEletrico = sistemaEletrico;
    }

    public void setSistemaHidraulico(boolean sistemaHidraulico) {
        this.sistemaHidraulico = sistemaHidraulico;
    }

    public void setPinturaExterna(boolean pinturaExterna) {
        this.pinturaExterna = pinturaExterna;
    }

    public void setPinturaInterna(boolean pinturaInterna) {
        this.pinturaInterna = pinturaInterna;
    }

}


