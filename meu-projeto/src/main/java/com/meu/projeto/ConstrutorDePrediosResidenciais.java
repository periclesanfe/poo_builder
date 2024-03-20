package com.meu.projeto;

import com.meu.projeto.Predio.ConstrutorDePredios;
import java.util.Scanner;

class ConstrutorDePrediosResidenciais implements ConstrutorDePredios{
    private Predio predio;

    public ConstrutorDePrediosResidenciais() {
        this.predio = new Predio();
    }

    public void construirEstrutura() {
        predio.setTipo("Comercial");
        System.out.println("Construindo estrutura do prédio residencial...\n");
        Scanner Scanner = new Scanner(System.in);
        System.out.println("\nInfome o número de andares: ");
        predio.setNumAndares(Scanner.nextInt());
        System.out.println("\nInforme o material do prédio: ");
        predio.setMaterial(Scanner.next());
        Scanner.close();
    }

    public void instalarSistemas() {
        System.out.println("Instalando sistemas no prédio residencial...\n");
        predio.setSistemaEletrico();
        predio.setSistemaHidraulico();
        predio.setSistemaPrevencaoIncendio();
        predio.setSistemaSeguranca();
        predio.setSistemaInternet();
        predio.setSistemaTelevisao();
    }

    public void construirUtilidades() {
        System.out.println("Construindo utilidades no prédio residencial...\n");
        predio.setElevador(" elevadore social e de serviço.");
        predio.setPortaria("Portaria eletrônica e porteiro em horário comercial.");
        predio.setAreaComum();
        predio.setEstacionamento();
    }

    public void finalizar() {
        System.out.println("Finalizando prédio residencial...\n");
        predio.setPinturaExterna();
        predio.setPinturaInterna();
        predio.setDecoracao("Decoração classica e acomchegante, com foco na utilizade dos ambientes e maximização de espaço.");
    }

    public Predio getPredio() {
        return predio;
    }
}
