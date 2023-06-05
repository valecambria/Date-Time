package org.example;

import java.time.LocalDate;
import java.time.Period;

public class EjemploPeriod {
    public static void main(String[] args) {

        LocalDate fecha1 = LocalDate.of(2011, 9, 23);
        LocalDate fecha2 = LocalDate.of(2020, 11, 25);

        Period periodo = Period.between(fecha1, fecha2);

        System.out.println(periodo);
        System.out.printf("Periodo entre %s y %s hay %d años, %d meses, %d dias",
                fecha1, fecha2, periodo.getYears(), periodo.getMonths(), periodo.getDays());
    }
}
