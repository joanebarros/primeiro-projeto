package aulas.poo;

public class Calculadora {

    // Atributo static
    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtracao(double a, double b) {
        return a - b;
    }
    public  static double multiplicacao(double a, double b) {
        return a * b;
    }
    public static double divisao(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        double resultadoSoma = Calculadora.soma(1, 2);
        double resultadoSub = Calculadora.subtracao(10, 5);
        double resultadoMult = Calculadora.multiplicacao(10, 2);
        double resultadoDiv = Calculadora.divisao(10, 5);

    }
}
