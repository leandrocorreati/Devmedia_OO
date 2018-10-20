package Aula03;

public class Exercicio
{
    private String titulo;
    private  String autor;
    private int paginas;
    private boolean lanacamento;

    @Override
    public String toString() {
        String txt ;
        if(lanacamento == true )
        {
            txt = "sim";
        }else { txt = "Não";}
        return "Descrição: \n" +
                "Titulo='" + titulo + '\'' +
                ", Autor='" + autor + '\'' +
                ", Paginas=" + paginas +
                ", Lanacamento=" + txt +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public boolean isLanacamento() {
        return lanacamento;
    }

    public void setLanacamento(boolean lanacamento) {
        this.lanacamento = lanacamento;
    }
}
