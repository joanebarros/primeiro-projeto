package aulas.poo;

public class Pet {
    private String nome;
    private int idade;
    protected double peso;

    // Nas subclasses o atributo

    public Pet (String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }


    public void fazerSom() {
        System.out.println("...");
    }
    public void comer(String comida) {
        System.out.println("Estou comendo " + comida);
    }
    public void dormir() {
        System.out.println("zzzzzzzz");
    }
    public void brincar() {
        System.out.println("Estou bricando... ");
    }

    public double getPeso() { // Apenas leitura do peso
        return this.peso;
    }
    public void setPeso(double novoPeso) { // Possibilidade de altera o peso
        this.peso = novoPeso;
    }
}
