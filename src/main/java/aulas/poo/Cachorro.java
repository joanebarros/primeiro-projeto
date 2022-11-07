package aulas.poo;

public class Cachorro extends Pet {
    private String comidaFavorita;
    private String raca;

    public Cachorro(String nome, int idade, double peso, String comidaFavorita, String raca) {
        // Representa a class Pet
        super(nome, idade, peso); // Chamando o construtor da class pai -> superClass
        this.comidaFavorita = comidaFavorita;
        this.raca = raca;
    }

    @Override // Vamos subescrever a ação de fazer som
    public void fazerSom() {
        System.out.println("Au, auuuuu");
    }

    @Override
    public void brincar() { // O cachorro late na hora de brincar
        this.fazerSom(); // Chamar o fazer som do cachorro, que foi subescrito
        this.brincar(); // Esta chamando o brincar do Pet
        this.dormir(); // Chamar o dormir do Pet, pois não foi subescrito
    }

    @Override
    public void comer(String comida) { // Custumizar a forma de comer
        // Verificar se a comida é favorita
        if(comida.equals(this.comidaFavorita)) {
            super.comer(comida); // Chama o comer() da class Pet
            this.peso += 0.2;
        } else {
            System.out.println("Quero " + comida + "não! ");
        }
    }

    public void correrAtrasDaMoto() { // Metado especifico do cachorro
        this.fazerSom();
        System.out.println("Correndo atrás da moto");
    }

    public static void main(String[] args) { // Testar a herança
        Pet pet1 = new Pet("Fred", 3, 12.5);
        pet1.dormir();
        pet1.comer("Batata");
        pet1.fazerSom();

        System.out.println("=============");

        Cachorro batata = new Cachorro("Max", 5, 25, "Osso", "Caramelo");
        batata.dormir();
        batata.fazerSom();
        batata.comer("Feijão");
        batata.setPeso(20);
        batata.comer("Osso");
        batata.correrAtrasDaMoto();

    }

}
