package pizzaria;

public class App 
{
    public static void main( String[] args ) {
        Supervisor supervisor = new Supervisor();
        ConstrutorDePizzasBrasileiras construtor = new ConstrutorDePizzasBrasileiras();
        supervisor.setConstrutorDePizzas(construtor);
        Pizza pizza = supervisor.construirPizza();

        System.out.println(pizza.GET());
    }
}
