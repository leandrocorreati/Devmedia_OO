package Aula12;

public class Principal
{
    static String nome = "Ana";
    String sobrenome = "Monteiro";
    void imprime()
    {
        System.out.println(nome + " " + sobrenome);
    }

    public static void main(String[] args)
    {
        //System.out.println(nome + ""+sobrenome);
        new Principal().imprime();
        Principal n = new Principal();
        System.out.println(nome + " "+n.sobrenome);

        MyClass my = new MyClass();
        my.imprime();

        MyClass.show();
        my.show();

        Principal a1 = new Principal();
        a1.sobrenome = "Da Silva";          ///          f f v f f v

        Principal a2 = new Principal();
        a2.sobrenome = "Costa";

        Principal a3 = new Principal();
        a3.sobrenome = "Moura";



        System.out.println("a1" + a1.sobrenome);
        System.out.println("a2" + a2.sobrenome);
        System.out.println("a3" + a3.sobrenome);
    }

    static void show ()
    {
        System.out.println(nome + " " + new Principal().sobrenome);
    }


}
