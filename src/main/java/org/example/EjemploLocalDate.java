package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class EjemploLocalDate {
    public static void main(String[] args) {

        LocalDate fechaActual = LocalDate.now();
        System.out.println(fechaActual);
        
        LocalDate mañana = LocalDate.now().plusDays(1);
        System.out.println("mañana = " + mañana);
        
        LocalDate mesSiguiente = LocalDate.now().plusMonths(1);
        System.out.println("mesSiguiente = " + mesSiguiente);
        
        LocalDate añoSiguiente = LocalDate.now().plusYears(1);
        System.out.println("añoSiguiente = " + añoSiguiente);
        
        LocalDate ayer = LocalDate.now().minusDays(1);
        System.out.println("ayer = " + ayer);
        
        LocalDate mesPasado = LocalDate.now().minusMonths(1);
        System.out.println("mesPasado = " + mesPasado);
        
        LocalDate añoPasado = LocalDate.now().minusYears(1);
        System.out.println("añoPasado = " + añoPasado);

        DayOfWeek diaDelMes = LocalDate.parse("2023-06-05").getDayOfWeek();
        System.out.println("diaDelMes = " + diaDelMes);

        boolean esBisiesto = LocalDate.now().isLeapYear();
        System.out.println("esBisiesto = " + esBisiesto);

        boolean esAntes = LocalDate.now().isBefore(LocalDate.parse("2023-06-08"));
        System.out.println("esAntes = " + esAntes);
        
        boolean esDespues = LocalDate.now().isAfter(LocalDate.parse("2023-06-04"));
        System.out.println("esDespues = " + esDespues);
    }
}