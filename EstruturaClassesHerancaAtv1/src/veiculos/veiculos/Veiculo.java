package veiculos;

public class Veiculo {
    // Atributos comuns a todos os veículos
    protected String marca;
    protected String modelo;
    protected int ano;

    // Construtor da classe Veiculo
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método para exibir os detalhes do veículo
    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
