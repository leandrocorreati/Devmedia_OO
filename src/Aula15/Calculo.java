package Aula15;

public class Calculo implements Adicao, Multiplicacao
{

    @Override
    public int somar(int a, int b) {
        return a + b;
    }

    @Override
    public int multiplicacao(int a, int b) {
        return a * b;
    }
}
