package Aula14;

public class Aula14 {
    public static void main(String[] args)
    {
        System.out.println("Soma = " + new Aula14().getCalculo(5,6));
    }

    int getCalculo(int x, int y) {

        System.out.println("Valor de X = " + x);
        System.out.println("Valor de y = " + y);
        class Calculo
        {
            private int a;
            private int b;

            public Calculo(int a, int b) {
                this.a = a;
                this.b = b;
            }

            int soma()
            {
                return x + y;
            }
             int multiplicador()
             {
                 return a*b;
             }

        }
        return new Calculo(10,20).soma();
    }
}
