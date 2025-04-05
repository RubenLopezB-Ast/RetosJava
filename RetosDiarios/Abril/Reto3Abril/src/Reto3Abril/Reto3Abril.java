package Reto3Abril;
//Crear dos variables utilizando los objetos fecha
//En la primera se representa la fecha (día, mes, año) actual.
//En la segunda se representa la fecha de nacimiento.
//
//Calcular cuántos años han transcurrido entre ambas fechas y muestra su resultado de
//maneras diferentes
//Día, mes y año.
//        Hora, minuto y segundo.
//Día de año.
//Día de la semana.
//Nombre del mes.
//
//        Pistas: buscar sobre el paquete java.time para para fechas y horas.

import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.Period;
import java.time.ZonedDateTime;
import java.util.Locale;
import java.time.format.TextStyle;
public class Reto3Abril {
    public static void main(String[] args) {
        Scanner fechas = new Scanner(System.in);

        LocalDate fechaActual = LocalDate.now();
        System.out.println("Introduce fecha de nacimiento: (dd/mm/aaaa): ");
        LocalDate nacimientoFecha = LocalDate.parse(fechas.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Period diferencia = Period.between(nacimientoFecha,fechaActual);
        System.out.println("Tienes: " + diferencia.getDays() + " días " + diferencia.getMonths() + " meses y " + diferencia.getYears() + " años.");
        System.out.println("Tienes: " + diferencia.getYears()*365 + " días " + diferencia.getMonths()*43800.048 + " minutos y " + diferencia.getDays()*86400 + " segundos.");
        System.out.println("Son las " + LocalTime.now().getHour() + " Horas, " + LocalTime.now().getMinute() + " Minutos y " + LocalTime.now().getSecond() + " Segundos");
        System.out.println("Hoy es el día " + fechaActual.getDayOfYear() + " del año.");
        System.out.println("Es el día " + fechaActual.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("es-ES")) + " de la semana.");
        System.out.println("Es el mes de " + fechaActual.getMonth().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("es-ES")));

        fechas.close();
    }
}
