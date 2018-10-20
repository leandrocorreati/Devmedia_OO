package Aula03;

public class Principal
{

    private boolean ativo;

    public boolean isAtivo()
    {
        return ativo;
    }

    public void setAtivo(boolean ativo)
    {
        this.ativo = ativo;
    }

    public static void main(String[] args)
    {
        Pessoa p1 = new Pessoa();
        p1.setIdade(20);
        p1.setNome("Larissa");
        System.out.println(p1.toString());

        System.out.println("++++++++++++++++++++++++++++++++++");

        Pessoa p2= new Pessoa();
        p2.setIdade(10);
        p2.setNome("Leandro");
        System.out.println(p2.toString());

        Exercicio e1 = new Exercicio();

        e1.setAutor("Leandro ");
        e1.setLanacamento(true);
        e1.setTitulo("A vida de Leandro");
        e1.setPaginas(220);
        System.out.println(e1.toString());



    }
}
