package aulas.poo;

public class CarroTeste {
    // A main serve pra testar a classe
    public static void main(String[] args) {
        Carro carro1 = new Carro("XY", "Ferrari", 2019, true, 4, 40);
        Carro carro2 = new Carro("Z", "Ford", 2000, false, 2, 50);

        System.out.println(carro1.combustivelAtual);
        carro1.abastecer(5);
        System.out.println(carro1.combustivelAtual);

        System.out.println(carro1.estaLigado);
        carro1.ligar();
        System.out.println(carro1.estaLigado);

        System.out.println(carro1.ano); // 2019
        carro1.ano = 2022;
        System.out.println(carro1.ano); // 2022

        boolean viajou = carro1.viajar("Fortaleza", 30000);
        System.out.println(viajou);
    }
}
