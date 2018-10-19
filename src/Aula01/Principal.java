package Aula01;

public class Principal {
    int x = 1;
    String y = "olá";
    String z = "Mundo!";

    void soma (int a, int b)
    {
        int soma = a + b;
        System.out.println("A soma é: " + soma );
    }

    int subtrair (int a, int b)
    {
        return a-b;
    }



    public static void main(String[] args) {
        Principal p = new Principal();
        int x2 = (p.x) + 2;
        System.out.println("Valor de x : " + p.x);
        System.out.println("Valor de x2: " + x2);
        System.out.println("Valor de x: " + p.x);

        System.out.println(p.y + " " + p.z);
        p.soma(4,5);

        System.out.println("Resultado: " + p.subtrair(10,2));

        for (int i = 0; i <  5; i ++)
        {
            p.soma(x2,1);
        }






    }
}