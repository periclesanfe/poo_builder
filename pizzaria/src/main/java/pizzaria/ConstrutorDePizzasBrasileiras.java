package pizzaria;

import java.util.Scanner;

import pizzaria.Pizza.ConstrutorDePizzas;

public class ConstrutorDePizzasBrasileiras implements ConstrutorDePizzas {
    private Pizza pizza;

    public ConstrutorDePizzasBrasileiras() {
        this.pizza = new Pizza();
    }

    public void prepararMassa() {
        System.out.println("Informe o tipo de massa: ");
        Scanner scanner = new Scanner(System.in);
        pizza.setMassa(scanner.next());
        scanner.close();
    }

    public void adicionarMolho() {
        System.out.println("\nInforme o tipo de molho:");
        Scanner scanner = new Scanner(System.in);
        pizza.setMolho(scanner.next());
        scanner.close();
    }

    public void adicionarCobertura() {
        System.out.println("\nInforme o tipo de cobertura:");
        Scanner scanner = new Scanner(System.in);
        pizza.setCobertura(scanner.next());
        scanner.close();
    }

    public void adicionarBordaRecheada() {
        System.out.println("\nDeseja adicionar borda recheada? (s/n)");
        Scanner scanner = new Scanner(System.in);
        String resultado = scanner.next().toUpperCase();
        while (!resultado.equals("S") && !resultado.equals("N")) {
            System.out.println("Opção inválida. Informe 's' para sim ou 'n' para não.");
            resultado = scanner.next().toUpperCase();
        }
        if (resultado == "S") {
            pizza.setBordaRecheada(true);
        }
        scanner.close();
    }

    public Pizza getPizza() {
        return pizza;
    }
}
