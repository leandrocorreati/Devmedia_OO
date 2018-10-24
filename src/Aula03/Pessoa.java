package Aula03;

public class Pessoa
{
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade)
    {
        if (idade >= 18)
        {
            this.idade = idade;
        }
        else {
            System.out.println("Idade invalida"); }
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
