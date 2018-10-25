package Aula05;

public class Principal
{
    public  enum option // ENUM
    {
        YES, NO     // CONSTANTES
    }

    public static void main(String[] args)
    {
        TrueOrFalse t = TrueOrFalse.FALSE;
        System.out.println(t);
        System.out.println("=====================================================================");
        System.out.println(t.getIndex());
        System.out.println(t.getDesc());


        for (TrueOrFalse t2 : TrueOrFalse.values())
        {
            System.out.println(t2);
        }


        Carta carta = Carta.COPAS;

        switch (carta)
        {
            case OURO:
                System.out.println("Sua carta é de ouro");
                break;

            case COPAS:
                System.out.println("Sua carta é de copas");
                break;

            case ESPADAS:
                System.out.println("Sua carta é de espadas");
                break;

            case PAUS:
                System.out.println("Sua carta é de paus");
                break;

                default:
                    System.out.println("nenhum naipe definido");
                    break;
        }



        //String naipe = Constante.COPAS;

        /*switch (naipe)
        {
            case Constante.OURO:
                System.out.println("Sua carta é de ouro");
                break;

            case Constante.COPAS:
                System.out.println("Sua carta é de copas");
                break;

            case Constante.ESPADAS:
                System.out.println("Sua carta é de espadas");
                break;

            case Constante.PAUS:
                System.out.println("Sua carta é de paus");
                break;

            default:
                System.out.println("nenhum naipe definido");
                break;
        }
        */


        }
}
