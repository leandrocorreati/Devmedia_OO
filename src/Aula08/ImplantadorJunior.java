package Aula08;

public class ImplantadorJunior extends  Implantador
{
    public  double calculaSalario()
    {
        return (getSalario() * 0.10) + getSalario();
    }
}
