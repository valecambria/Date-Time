package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EjemploLocalTime {
    public static void main(String[] args) {
        LocalTime ahora = LocalTime.now();
        System.out.println(ahora);
        System.out.println("Hora " + ahora.getHour());
        System.out.println("Minutos " + ahora.getMinute());
        System.out.println("Segundos " + ahora.getSecond());

        LocalTime seisTreinta = LocalTime.of(6, 30);
        System.out.println(seisTreinta);
        seisTreinta = LocalTime.parse("06:30");
        System.out.println("seisTreinta = " + seisTreinta);

        LocalTime sieteTreinta = LocalTime.of(6, 30).plusHours(1);
        System.out.println("sieteTreinta = " + sieteTreinta);

        boolean isBefore = seisTreinta.isBefore(sieteTreinta);
        System.out.println("isBefore = " + isBefore);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String ahoraFormateado = ahora.format(df);
        System.out.println("ahoraFormateado = " + ahoraFormateado);
    }
}
