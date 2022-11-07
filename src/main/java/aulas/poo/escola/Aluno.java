package aulas.poo.escola;

public class Aluno extends Pessoa{
    private double media;

    public Aluno(String nome, String email, String cpf, double nota) {
        // Chamada do super deve vim em primeiro
        super(nome, email, cpf); // Estou chamando o construtor de pessoa
        this.media = media;
    }
    @Override
    public void seApresentar() { // Na subescrita mudamos o comportamento (apenas)
        super.seApresentar(); // super = pessoa
        System.out.println("Eu sou um aluno com media = " + this.media);

    }
    public double getMedia() {
        return this.media;
    }

}
