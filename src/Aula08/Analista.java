package Aula08;

public class Analista extends Funcionario
{
    @Override
    public double calculaSalario()
    {
        return (getSalario() * 0.50) + getSalario();
    }
}
