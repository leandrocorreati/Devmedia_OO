package Aula06;

import java.time.LocalDate;

public class Aluno extends  Pessoa
{
private Turno turno;



   // 1 º FORMA

    public Aluno(String nome, String sobrenome, LocalDate dataNascimento, char sexo, Turno turno)
    {
        super(nome, sobrenome, dataNascimento, sexo);
        this.turno = turno;
    }




    // 2 º FORMA
//
//    public Aluno(Turno turno, String nome, String sobrenome, char sexo, LocalDate dataNascimento)
//    {
//        this.turno = turno;
//        this.setNome(nome);
//        this.setSexo(sexo);
//        this.setSobrenome(sobrenome);
//        this.setDataNascimento(dataNascimento);
//    }



    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    @Override
    public String toString()
    {
        return  super.toString() +  " turno = " + turno;
    }
}
