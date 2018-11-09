package Aula14;

public class Principal
{
    private int a ;
    private static int valor = 1000;

    public Principal(int a) {
        this.a = a;
    }

    public MyStaticClass getMyStaticClass()
    {
        return new MyStaticClass(a);
    }
    private static class MyStaticClass
    {
        private int valor ;
        public MyStaticClass(int valor)
        {
            this.valor = valor;
        }

        public void imprime()
        {
            System.out.println(valor);
        }
    }

    public static void main(String[] args)
    {
        int a = Principal.valor;
        MyStaticClass m = new  Principal.MyStaticClass(1200);
        m.imprime();

        Principal p = new Principal(3000);
        p.getMyStaticClass().imprime();
    }

}
