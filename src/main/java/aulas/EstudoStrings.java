package aulas;

import java.util.Arrays;
import java.util.Scanner;

public class EstudoStrings {
    public static void main(String[] args) {
       // Strings são cadeia de caracteres
        // "Joane" -> J = 0, O = 1, A = 2, N = 3, E = 4

        String nome = "Pedro";

        if(nome == "Pedro") { // Compara o enderço
            System.out.println("São iguais! ");

        }
        System.out.println("Digite seu sobremome: ");
        Scanner entrada = new Scanner(System.in);
        String sobrenome = entrada.nextLine();

        if(sobrenome.equals("Pereira")) { // Compara os conteudos das Strings
            System.out.println("São iguais");
        } else {
            System.out.println("São digerentes");
        }

        // Outros Medatos
        String java = "java";
        String ja = java.substring(0, 2); // Começa do '0'e vai até o '2' (Não incluso)
        String va = java.substring(2); // Corta do 2 até o final da String

        System.out.println(ja);
        System.out.println(va);

        // Exemplo 2
        System.out.println("Digite o nome: ");
        String seuNome = entrada.nextLine();

        if(seuNome.toUpperCase().equals("JOSÉ")) {

        }
        String data = "13/10/2022";
        String[] valores = data.split("/");
        System.out.println(valores[0]);

        String email = "joane.barros@hotmail.com";
        String[] valoresEmail = email.split("@");
        System.out.println(Arrays.toString(valoresEmail));

        String nome2 = "José Almir";
        String[] nomesSeparados = nome2.split("");
        System.out.println(nomesSeparados[0]);

        String teste = "Amanhã é sexta";
        String[] teste2 = teste.split("");
        System.out.println(Arrays.toString(teste2));
    }
}


