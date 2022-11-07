package aulas.poo.escola;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Carlos José", "carlos.jose@gmail.com", "000000", 7.5);
        aluno.seApresentar();

        Professor prof = new Professor("João Pedro", "joao.pedro@gmail.com", "12121212", "TI");
        prof.seApresentar();

        Pessoa p1 = new Pessoa("Maria Antonia", "maria.antonia@gmail.com", "34343434");
        p1.seApresentar();

        // Aluno é uma pessoa
        Pessoa p2 = new Aluno("Joane Barros", "joane.barros@gmail.com", "56565656", 8.1);
        // Professor é uma pessoa
        Pessoa p3 = new Professor("Maria Clara", "maria.clara@gmail.com", "78787878", "Geografia");
        System.out.println("============");

        p2.seApresentar();
        p3.seApresentar();

        // Polimorfismo
        System.out.println("=== PESSOAS ===");
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(aluno);
        pessoas.add(prof);
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        for (Pessoa pessoa : pessoas) {
            pessoa.seApresentar();
        }
    }
}
