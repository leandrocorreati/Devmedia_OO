package Aula01;

public class Exercicio
{
    void tabuada (int n)
    {
        for (int i = 1; i <=10; i++ )
        {
            System.out.println(n + " X " +  i + " = " + n * i);
        }
    }

    public static void main(String[] args)
    {
        Exercicio e = new Exercicio();
        e.tabuada(4);
    }

}
