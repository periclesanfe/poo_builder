package pizzaria;

import java.util.Scanner;

import pizzaria.Pizza.ConstrutorDePizzas;

public class ConstrutorDePizzasBrasileiras implements ConstrutorDePizzas {
    private Pizza pizza;

    public ConstrutorDePizzasBrasileiras() {
        this.pizza = new Pizza();
    }

    public void prepararMassa() {
        System.out.println("Montando a pizza...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tipo de massa: ");
        pizza.setMassa(scanner.next());
        System.out.println("\nInforme o tipo de molho:");
        pizza.setMolho(scanner.next());
        System.out.println("\nInforme o tipo de cobertura:");
        pizza.setCobertura(scanner.next());
        System.out.println("\nDeseja adicionar borda recheada? (s/n)");
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
