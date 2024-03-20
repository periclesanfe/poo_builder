package com.meu.projeto;

import com.meu.projeto.Predio.ConstrutorDePredios;
import java.util.Scanner;

public class ConstrutorDePrediosComerciais implements ConstrutorDePredios{
    private Predio predio;

    public ConstrutorDePrediosComerciais() {
        this.predio = new Predio();
    }

    public void construirEstrutura() {
        predio.setTipo("Comercial");
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Construindo estrutura do prédio comercial...\n");
        System.out.println("\nInfome o número de andares: ");
        predio.setNumAndares(Scanner.nextInt());
        System.out.println("\nInforme o material do prédio: ");
        predio.setMaterial(Scanner.next());
        Scanner.close();
    }

    public void instalarSistemas() {
        System.out.println("Instalando sistemas no prédio comercial...\n");
        predio.setSistemaEletrico();
        predio.setSistemaHidraulico();
        predio.setSistemaPrevencaoIncendio();
        predio.setSistemaSeguranca();
        predio.setSistemaArCondicionado();
        predio.setSistemaInternet();
        predio.setEstacionamento();
    }

    public void construirUtilidades() {
        System.out.println("Construindo utilidades no prédio comercial...\n");
        predio.setElevador("Elevador panorâmico com capacidade para 20 pessoas.");
        predio.setPortaria("Atendente em horário comercial e sistema de segurança 24h.");
    }

    public void finalizar() {
        System.out.println("Finalizando prédio comercial...\n");
        predio.setPinturaExterna();
        predio.setPinturaInterna();
        predio.setDecoracao("Decoração moderna e sofisticada, com obras de arte e plantas ornamentais.");
    }

    public Predio getPredio() {
        return predio;
    }
}
