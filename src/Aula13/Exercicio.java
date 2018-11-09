package Aula13;

public class Exercicio
{
    static int a = 0;
    int b = 2;

    static
    {
        System.out.println(a); // 1º  a = 0
        a = a + 1;
    }

    {
        System.out.println(b); // 3º b = 2
        b = b + a;
    }

    public static void main(String[] args)
    {
        System.out.println(a); // 2º a = 1
        Exercicio ex = new Exercicio();
        System.out.println(ex.b); // 3º b = 3
        ex.b = ex.b + a ;
        System.out.println(ex.b); //4º b = 4
    }
}
