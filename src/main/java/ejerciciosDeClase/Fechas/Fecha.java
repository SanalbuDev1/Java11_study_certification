package ejerciciosDeClase.Fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.time.Period;

public class Fecha {

    public static final String FECHA_COVID = "2020-03-06";

    public static void main(String[] args) {
        fechaCovid();
        fechaNacimiento();
    }

    public static void fechaCovid() {

        List<LocalDate> fechas = new ArrayList<>();
        fechas.add(LocalDate.of(2020, 3, 1));
        fechas.add(LocalDate.of(2020, 3, 31));
        fechas.add(LocalDate.of(2021, 4, 30));
        fechas.add(LocalDate.of(2019, 5, 31));

        fechas.stream()
                .filter((fechaActual) -> fechaActual.isAfter(LocalDate.of(2020, 3, 6)))
                .forEach((x) -> System.out.println("Fecha posterior a la fecha de inicio de la pandemia: " + x));

        fechas.stream()
                .filter((fechaActual) -> fechaActual.isBefore(LocalDate.of(2020, 3, 6)))
                .forEach((x) -> System.out.println("Fecha anterior a la fecha de inicio de la pandemia: " + x));
    }

    public static void fechaNacimiento() {
        List<LocalDate> fechas = new ArrayList<>();
        fechas.add(LocalDate.of(2020, 3, 1));
        fechas.add(LocalDate.of(2020, 3, 31));
        fechas.add(LocalDate.of(2021, 4, 30));
        fechas.add(LocalDate.of(2019, 5, 31));
        fechas.add(LocalDate.of(1998, 5, 31));
        fechas.add(LocalDate.of(1998, 5, 31));
        fechas.add(LocalDate.of(2005, 10, 14));

        List<LocalDate> mayoresDeEdad = fechas.stream()
                .filter((fecha) -> Period.between(fecha, LocalDate.now()).getYears() > 17)
                .collect(Collectors.toList());

        mayoresDeEdad.stream()
                .forEach((x) -> {
                    Integer edad = Period.between(x, LocalDate.now()).getYears();
                    if (edad >= 18 && edad <= 25) {
                        System.out.println("Joven mayor de edad");
                    } else if (edad >= 26 && edad <= 40) {
                        System.out.println("Adulto joven");
                    } else if (edad >= 41 && edad <= 70) {
                        System.out.println("Adulto mayor");
                    } else {
                        System.out.println("Elemento no encontrado");
                    }
                });

        System.out.println(LocalDate.now().minusYears(18));

    }

}
