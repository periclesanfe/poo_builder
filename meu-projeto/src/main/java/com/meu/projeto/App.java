package com.meu.projeto;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String tipo;
        Supervisor supervisor = new Supervisor();
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Informe o tipo de prédio que deseja construir (comercial ou residencial): ");
        tipo = Scanner.next();

        while (!tipo.equals("comercial") && !tipo.equals("residencial")) {
            System.out.println("Tipo inválido. Informe o tipo de prédio que deseja construir (comercial ou residencial): ");
            tipo = Scanner.next();
        }

        Scanner.close();

        if (tipo.equals("comercial")) {
            ConstrutorDePrediosComerciais construtor = new ConstrutorDePrediosComerciais();
            supervisor.setConstrutorDePredios(construtor);
        } else if (tipo.equals("residencial")){
            ConstrutorDePrediosResidenciais construtor = new ConstrutorDePrediosResidenciais();
            supervisor.setConstrutorDePredios(construtor);
        }

        Predio predio = supervisor.construirPredio();
        System.out.println(predio.GET());
    }
}

