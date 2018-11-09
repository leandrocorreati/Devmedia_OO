package Aula13;

public class Principal
{

    static int vStatic = 1;
    int vInstance = 1;

    static // O BLOCO STATIC INICIA SUAS INSTRUÇÕES ASSIM QUE o projeto é executado
    {
        System.out.println("Bloco Estatico -- 1º");
        System.out.println(vStatic + " --- 2º");
        System.out.println(new Principal().vInstance + " --- 5º");
    }

    // O BLOCO de instancia  INICIA SUAS INSTRUÇÕES ASSIM QUE e instanciado um objeto da classe
    {
        System.out.println("Bloco DE ESTANCIA --- 3º ");
        System.out.println(vStatic + vInstance + "--- 4º ");

    }

    public Principal()
    {
        super();
       this.vInstance = 9;
        System.out.println("metodo construtor");
    }

    public static void main(String[] args)
    {
        Principal p = new Principal();
        p.vInstance = 5;
        System.out.println(p.vInstance);
    }
}
