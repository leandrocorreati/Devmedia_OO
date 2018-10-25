package Aula06;

import java.time.LocalDate;

public class Professor extends Pessoa
{
    private Horas horas;

    // 1 º FORMA

    public Professor(String nome, String sobrenome, LocalDate dataNascimento, char sexo, Horas horas)
    {
        super(nome, sobrenome, dataNascimento, sexo);
        this.horas = horas;
    }


    // 2 º FORMA

/*    public Professor(Horas horas, String nome, String sobrenome, char sexo, LocalDate dataNascimento)
    {
        this.horas = horas;
        this.setNome(nome);
        this.setSexo(sexo);
        this.setSobrenome(sobrenome);
        this.setDataNascimento(dataNascimento);
    }*/

    public Horas getHoras() {
        return horas;
    }

    public void setHoras(Horas horas) {
        this.horas = horas;
    }

    @Override
    public String toString()
    {
        return super.toString() + " horas =  " + horas ;
    }
}
