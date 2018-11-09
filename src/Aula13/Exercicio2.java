package Aula13;

public class Exercicio2
{
    private class MyInnerClass
    {
        public void hello()
        {
            System.out.println("Olá , eu sou uma classe interna regular !!");
        }
    }

    public  MyInnerClass retorna() // 1º FORMA DE TER ACESSO A CLASSE INTERNA "MYINNERCLASS"
    {
        return new MyInnerClass();
    }


    public static void main(String[] args)
    {
        Exercicio2 e = new Exercicio2();
        e.retorna().hello();

        MyInnerClass mic = new Exercicio2().new MyInnerClass(); // 2º FORMA DE TER ACESSO A CLASSE INTERNA "MYINNERCLASS"
        mic.hello();

    }
}
