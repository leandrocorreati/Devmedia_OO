package Aula08;

public class Principal
{
    protected  double calc()
    {
        return 0;
    }

    public static void main(String[] args)
    {
        Programador p = new Programador();
        p.setNome("Joao Nascimento");
        p.setSalario(2800.90);
        System.out.printf("Programador: %s - R$: %.2f", p.getNome(), p.calculaSalario());

        System.out.println("\n===============================");

        Analista a = new Analista();
        a.setNome("Leandro Correa");
        a.setSalario(3500.90);
        System.out.printf("Analista : %s - R$: %.2f", a.getNome(), a.calculaSalario());

        System.out.println("\n===============================");

        ImplantadorJunior i = new ImplantadorJunior();
        i.setNome("Larissa Correa");
        i.setSalario(3500.90);
        System.out.printf("Implantador : %s - R$: %.2f", i.getNome(), i.calculaSalario());
    }
}
