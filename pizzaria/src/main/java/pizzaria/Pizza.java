package pizzaria;

public class Pizza {
    private String massa;
    private String molho;
    private String cobertura;
    private boolean bordaRecheada;

    interface ConstrutorDePizzas {
        void prepararMassa();
        void adicionarMolho();
        void adicionarCobertura();
        void adicionarBordaRecheada();
        Pizza getPizza();
    }

    public String GET() {
        String retorno = "Massa: " + this.massa + "\nMolho: " + this.molho + "\nCobertura: " + this.cobertura + "\n";
        if (this.bordaRecheada) {retorno += "Borda recheada\n";}
        return retorno;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }
    
    public void setMolho(String molho) {
        this.molho = molho;
    }
    
    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }
    
    public void setBordaRecheada(boolean bordaRecheada) {
        this.bordaRecheada = bordaRecheada;
    }
    
}
