package modulo10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Fechas {

    public static void main(String[] args) {

        // creame una fecha LocalDate con fecha YYYY-MM-DD:hh:mm:ss
        LocalDate fecha = LocalDate.of(2019, 12, 31);
        System.out.println(fecha);

        // creame una fecha LocalDate con fecha YYYY::MM::DD
        LocalDate fecha2 = LocalDate.parse("2019-12-31");
        System.out.println(fecha2);

        // MUESTRA TIPO FORMATO DE FECHAS
        System.out.println(fecha2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(fecha2.format(DateTimeFormatter.ofPattern("dd/MMM/yyyy")));
        System.out.println(fecha2.format(DateTimeFormatter.ofPattern("dd/MMMM/yyyy")));
        System.out.println(fecha2.format(DateTimeFormatter.ofPattern("dd/MMMM/yyyyy")));
        System.out.println(fecha2.format(DateTimeFormatter.ofPattern("dd/MMMM/yy")));

        // Creame una fecha con formato ISO_WEEK_DATE
        LocalDateTime fecha3 = LocalDateTime.parse("2019-W01-1", DateTimeFormatter.ISO_WEEK_DATE);
        System.out.println(fecha3);

    }
}
