package org.example;

import java.time.Duration;
import java.time.LocalDateTime;

public class EjemploDuration {
    public static void main(String[] args) {
        LocalDateTime fecha1 = LocalDateTime.now();
        LocalDateTime fecha2 = LocalDateTime.now().plusHours(1).plusMinutes(30).plusDays(1);
        Duration lapsus = Duration.between(fecha1, fecha2);
        System.out.println("Lapso entre fechas: " + lapsus);
        System.out.println("Pasado a minutos: " + lapsus.toMinutes());
    }
}
