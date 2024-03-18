package com.meu.projeto;

import com.meu.projeto.Predio.ConstrutorDePredios;
import java.util.Scanner;

class ConstrutorDePrediosResidenciais implements ConstrutorDePredios{
    private Predio predio;

    public ConstrutorDePrediosResidenciais() {
        this.predio = new Predio();
    }

    public void construirEstrutura() {
        System.out.println("Construindo estrutura do prédio residencial...\n");
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Informe o tipo do prédio: ");
        predio.setTipo(Scanner.next());
        System.out.println("\nInfome o número de andares: ");
        predio.setNumAndares(Scanner.nextInt());
        System.out.println("\nInforme o material do prédio: ");
        predio.setMaterial(Scanner.next());
        Scanner.close();
    }

    public void instalarSistemas() {
        System.out.println("Instalando sistemas no prédio residencial...\n");
        predio.setSistemaEletrico(true);
        predio.setSistemaHidraulico(true);
    }

    public void finalizar() {
        System.out.println("Finalizando prédio residencial...\n");
        predio.setPinturaExterna(true);
        predio.setPinturaInterna(true);
    }

    public Predio getPredio() {
        return predio;
    }
}
