package Aula11;

public class Pessoa
{
    private  String nome;

    public Pessoa()
    {
        super();
        System.out.println("Pessoa()");
    }

    public Pessoa(String nome) {
        super();
        this.nome = nome;
        System.out.println("Pessoa String Nome");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
