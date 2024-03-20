package com.meu.projeto;

import com.meu.projeto.Predio.ConstrutorDePredios;

public class Supervisor {
    private ConstrutorDePredios construtorDePredios;
    
    public void setConstrutorDePredios(ConstrutorDePredios construtorDePredios) {
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
