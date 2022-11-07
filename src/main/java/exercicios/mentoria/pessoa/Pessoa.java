package exercicios.mentoria.pessoa;

public class Pessoa {
    // Atributos
   private String nome;
   private String endereco;
   private String telefone;

    // Construtor
   public Pessoa(String nome, String endereco, String telefone) {
            this.nome = nome;
            this.endereco = endereco;
            this.telefone = telefone;
   }

   // Metados Especiais

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    // Metados de trabalho

    public void receberInformacoes() {
       System.out.println("nome: " + getNome());
       System.out.println("telefone " + this.getEndereco());
       System.out.println("endereco " + this.getEndereco());
    }
}
