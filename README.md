---

# Projeto de estudo Herança

Este projeto é uma aplicação Java de linha de comando que implementa uma estrutura de classes para diferentes tipos de veículos, usando conceitos de herança e polimorfismo. Ele foi desenvolvido para demonstrar a criação de uma hierarquia de classes, onde uma superclasse (`Veiculo`) compartilha atributos e métodos comuns com subclasses específicas (`Carro` e `Moto`), que contêm funcionalidades adicionais.

## Estrutura de Classes e Funcionalidades

### 1. Classe `Veiculo`
A superclasse `Veiculo` contém:
- **Atributos**:
  - `String marca`: representa a marca do veículo.
  - `String modelo`: representa o modelo do veículo.
  - `int ano`: representa o ano de fabricação.
- **Métodos**:
  - `void exibirDetalhes()`: exibe os detalhes comuns do veículo.
  - **Construtor**: inicializa os atributos `marca`, `modelo`, e `ano`.

### 2. Classe `Carro` (Subclasse de `Veiculo`)
A classe `Carro` representa veículos do tipo carro e adiciona:
- **Atributo**:
  - `int numeroDePortas`: representa o número de portas.
- **Métodos**:
  - `void exibirDetalhes()`: sobrescreve o método da classe pai para exibir o número de portas além dos atributos comuns.
  - **Construtor**: inicializa os atributos da classe `Veiculo` e o número de portas.

### 3. Classe `Moto` (Subclasse de `Veiculo`)
A classe `Moto` representa veículos do tipo moto e adiciona:
- **Atributo**:
  - `boolean temSidecar`: indica se a moto possui um sidecar.
- **Métodos**:
  - `void exibirDetalhes()`: sobrescreve o método da classe pai para exibir a presença do sidecar.
  - **Construtor**: inicializa os atributos da classe `Veiculo` e a presença do sidecar.

### 4. Classe `Main`
A classe `Main` cria instâncias de `Carro` e `Moto`, demonstra o funcionamento dos métodos e exibe os detalhes de cada veículo.

## Estrutura de Pastas

A estrutura de diretórios do projeto está organizada da seguinte forma:

```
VeiculoProject/
│
├── src/
│   ├── veiculos/ 
│   │   ├── Veiculo.java
│   │   ├── Carro.java
│   │   ├── Moto.java
│   │
│   └── Main.java
```


## Exemplo de Saída Esperada

O programa exibe detalhes do carro e da moto instanciados na classe `Main`. A saída deverá ser semelhante a:

```
Detalhes do Carro:
Marca: Toyota
Modelo: Corolla
Ano: 2020
Número de Portas: 4

Detalhes da Moto:
Marca: Harley-Davidson
Modelo: Street 750
Ano: 2019
Tem Sidecar: Sim
```
