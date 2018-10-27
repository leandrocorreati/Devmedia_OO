package Aula11;

public class PessoaFisica extends  Pessoa {
    public PessoaFisica() {
        super();
        System.out.println("Pessoa Fisica");
    }

    public PessoaFisica(String nome) {
        super(nome);
        System.out.println("Pessoa Fisica (String Nome)");
    }
}
