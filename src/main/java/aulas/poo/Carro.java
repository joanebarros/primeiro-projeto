package aulas.poo;


public class Carro {
    String modelo;
    private String marca;
    int ano;
   private boolean ehFlex;
   private int qtPortas;
   double combustivelAtual;

   private double consumo; // quantos km por litro

   boolean estaLigado;

    Carro(String modelo, String marca, int ano, boolean ehFlex, int qtPortas, double consumo) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.ehFlex = ehFlex;
        this.qtPortas = qtPortas;
        this.combustivelAtual = 30.0; // todos os carros começam com 30 L
        this.consumo = consumo;
        this.estaLigado = false; // todos os carros começam desligados
    }

    // Abastecer
    public void abastecer(double total) { // parâmetros do método
        this.combustivelAtual += total; // this.combustivelAtual = this.combustivelAtual + total;
    }

    // Ligar
    public void ligar() {
        this.estaLigado = true;
    }

    // Desligar
   public void desligar() {
        this.estaLigado = false;
    }

    // Viajar
    boolean viajar(String local, double distancia) { // tentar viajar, se conseguir true, senão false
        if(!this.estaLigado) {
            this.ligar();
        }
        // Calcula quantos litros serão necessários para a viagem
        double totalLitros = distancia / this.consumo;

        if(this.combustivelAtual - totalLitros > 0) {
            this.combustivelAtual -= totalLitros;
            System.out.println("A viagem p/ " + local + " aconteceu. Sobrou " + this.combustivelAtual + " L");
            return true; // a viagem aconteceu
        } else {
            System.out.println("A viagem não foi possível.");
            return false; // a viagem não será possível
        }
    }


}