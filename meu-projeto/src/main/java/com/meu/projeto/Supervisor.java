package com.meu.projeto;

public class Supervisor {
    private ContrutorPredioProtocolo construtorDePredios;
    
    public void setConstrutorDePredios(ContrutorPredioProtocolo construtorDePredios) {
        this.construtorDePredios = construtorDePredios;
    } 

    public Predio construirPredio(){
        construtorDePredios.construirEstrutura();
        construtorDePredios.instalarSistemas();
        construtorDePredios.construirUtilidades();
        construtorDePredios.finalizar();
        construtorDePredios.closeScanner();
        return construtorDePredios.getPredio();

    }
}
