package org.example;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class EjemploLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime fechaCompleta = LocalDateTime.now();
        System.out.println("fechaCompleta = " + fechaCompleta);
        fechaCompleta = LocalDateTime.of(2023, Month.JUNE, 5, 12, 35, 20);
        System.out.println("fechaCompleta = " + fechaCompleta);
        
        LocalDateTime fechaCompleta2 = fechaCompleta.plusDays(1).plusHours(3);
        System.out.println("fechaCompleta2 = " + fechaCompleta2);

        Month mes = fechaCompleta.getMonth();
        System.out.println("mes = " + mes);
        
        int dia = fechaCompleta.getDayOfMonth();
        System.out.println("dia = " + dia);

        int año = fechaCompleta.getYear();
        System.out.println("año = " + año);

        String formato = fechaCompleta.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println("formato = " + formato);
    }
}
