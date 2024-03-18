package com.meu.projeto;

public class App {
    public static void main(String[] args) {
        Supervisor supervisor = new Supervisor();
        ConstrutorDePrediosResidenciais construtor = new ConstrutorDePrediosResidenciais();
        supervisor.setConstrutorDePredios(construtor);
        Predio predio = supervisor.construirPredio();

        System.out.println(predio.GET());
    }
}

