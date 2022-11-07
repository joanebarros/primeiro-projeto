package aulas.poo.zoo;

// Na interface você define um conjunto de metados
// É a classe que "HERDA deve implementar estes metados

public interface Animal {
    void dormir(); // Definição de metados apenas
    void fazerSom();
    void comer(String comida);

}
class Gato implements Animal {
    @Override
    public void dormir() {
        System.out.println("ZZZZZZ Miau ");
    }

    @Override
    public void fazerSom() {
        System.out.println("Miau ");
    }

    @Override
    public void comer(String comida) {
        if (comida.equals("Peixe")) {
        } else {
            System.out.println("Marcia você sabe que eu só como peixe ");
        }

    }

}
    class Galinha implements Animal {
        @Override
        public void dormir() {
            System.out.println("ZZZZZZ có, có");
        }

        @Override
        public void fazerSom() {
            System.out.println("Có, có, có, có");
        }

        @Override
        public void comer(String comida) {
            System.out.println("Hummmmm có, có" + comida);
        }

        public static void main(String[] args) {
            Galinha galinha = new Galinha();
            Gato gato = new Gato();

            galinha.fazerSom();
            galinha.dormir();
            galinha.comer("Milho");

            gato.fazerSom();
            gato.dormir();
            gato.comer("Peixe");

        }
}


