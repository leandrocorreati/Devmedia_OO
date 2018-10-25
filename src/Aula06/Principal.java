package Aula06;

import java.time.LocalDate;

public class Principal
{
    public static void main(String[] args)
    {
        Aluno a1 = new Aluno("Leandro", "Correa", LocalDate.of(1987, 8, 11),'M',Turno.MANHA);
        System.out.println(a1.toString());

        Professor p1 = new Professor("Larissa", "Pedroso", LocalDate.of(1985, 1, 21),'M',Horas.VINTE_HORAS);
        System.out.println(p1.toString());


    }
}
