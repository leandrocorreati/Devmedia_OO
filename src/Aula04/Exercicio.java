package Aula04;

public class Exercicio
{
    private  String nome;
    private String  sobrenome;
    private int idade;
    private char sexo;

    public Exercicio()
    {
        super();
    }

    public Exercicio(String nome, String sobrenome, int idade) {
        super();
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public Exercicio(char sexo) {
        super();
        this.sexo = sexo;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
