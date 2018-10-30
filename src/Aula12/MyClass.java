package Aula12;

public class MyClass
{
    void imprime()
    {
        System.out.println(Principal.nome + " " + new Principal().sobrenome);

        Principal.show();

        new Principal().imprime();
    }

    static void show ()
    {
        System.out.println(Principal.nome + " " + new Principal().sobrenome);
    }
}
