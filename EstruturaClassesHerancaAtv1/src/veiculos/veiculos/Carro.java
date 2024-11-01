package veiculos;

public class Carro extends Veiculo {
    private int numeroDePortas; // Atributo específico para carros

    // Construtor da classe Carro que inclui o número de portas
    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano); // Chama o construtor da superclasse
        this.numeroDePortas = numeroDePortas;
    }

    // Método sobrescrito para exibir os detalhes do carro
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de Portas: " + numeroDePortas);
    }
}
