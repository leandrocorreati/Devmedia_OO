package Aula15;

public class Principal
{
    public static void main(String[] args)
    {
        Calculo c = new Calculo();
        System.out.println("Soma = " + c.somar(10, 5));
        System.out.println("Multiplicação = " + c.multiplicacao(20,8));
        Principal p = new Principal();
        System.out.println("My Soma = " + p.mySoma(8,5));

        p.imprime(new Executa()
        {
            @Override
            public void executar()
            {

            }
        });
    }

    void imprime(Executa e)
    {
        e.executar();
    }

    int mySoma (int z, int y)
    {
        Adicao a = new Adicao()
        {
            @Override
            public int somar(int a, int b)
            {
                return b + a ;
            }
        };

        return a.somar(z,y);
    }
}
