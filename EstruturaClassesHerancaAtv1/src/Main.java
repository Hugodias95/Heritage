import veiculos.Carro;
import veiculos.Moto;

public class Main {
    public static void main(String[] args) {
        // Instancia um carro e exibe seus detalhes
        Carro carro = new Carro("Toyota", "Corolla", 2020, 4);
        System.out.println("Detalhes do Carro:");
        carro.exibirDetalhes();

        // Instancia uma moto e exibe seus detalhes
        Moto moto = new Moto("Harley-Davidson", "Street 750", 2019, true);
        System.out.println("\nDetalhes da Moto:");
        moto.exibirDetalhes();
    }
}
