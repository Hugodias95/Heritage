package veiculos;

public class Moto extends Veiculo {
    private boolean temSidecar; // Atributo específico para motos

    // Construtor da classe Moto que inclui o atributo sidecar
    public Moto(String marca, String modelo, int ano, boolean temSidecar) {
        super(marca, modelo, ano); // Chama o construtor da superclasse
        this.temSidecar = temSidecar;
    }

    // Método sobrescrito para exibir os detalhes da moto
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tem Sidecar: " + (temSidecar ? "Sim" : "Não"));
    }
}
