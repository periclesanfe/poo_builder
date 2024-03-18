package pizzaria;

import pizzaria.Pizza.ConstrutorDePizzas;

class Supervisor {
    private ConstrutorDePizzas construtorDePizzas;

    public void setConstrutorDePizzas(ConstrutorDePizzas construtorDePizzas) {
        this.construtorDePizzas = construtorDePizzas;
    }

    public Pizza construirPizza(){
        construtorDePizzas.prepararMassa();
        return construtorDePizzas.getPizza();
    }
}
