package Aula07;

public class Aluno extends Pessoa
{
    public Aluno(String nome, String matricula)
    {
        super(nome, matricula);

    }

    public Aluno(String nome)
    {
        super(nome);
    }

    @Override
    public void setMatricula(String matricula)
    {
        if(matricula.length() == 10 )
        {
            super.setMatricula(matricula);
        }
        else
        {
            System.out.println("Matricula Invalida");
        }
//  f v v v f v
    }
}
