package Aula09;

public class Principal
{
    private Veiculo veiculo;
    private Carro carro;
    private Moto moto;

    void veiculos()
    {
        veiculo = new Ford();
        veiculo.setCor("Amarelo");
        veiculo.setPeso(600);
        System.out.println(veiculo.toString());

        veiculo = new Yamaha();
        veiculo.setCor("Marrom");
        veiculo.setPeso(1200);
        System.out.println(veiculo.toString());
    }


    void carroEMotos()
    {
        carro = new Ford();
        carro.setCor("Preta");
        carro.setPeso(800);
        System.out.println(carro.toString());

        moto = new Yamaha();
        moto.setCor("Preta");
        moto.setPeso(800);
        moto.setNome("Fazer 250");
        System.out.println(moto.toString() + moto.getNome());

    }



    public static void main(String[] args)
    {
        new Principal ().carroEMotos();

        Ford f = new Ford();
        f.setCor("Preto");
        f.setPeso(600);
        System.out.println(f.toString());

        Yamaha y = new Yamaha();
        y.setCor("Vermelho");
        y.setPeso(500);
        System.out.println(y.toString());
    }

}
