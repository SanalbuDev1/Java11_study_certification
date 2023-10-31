package ejerciciosDeClase.equipo;

import java.util.ArrayList;

public class ImprimirEjecucionEquipo {
    public static void main(String[] args) throws Exception {
        Equipo equipo = new Equipo(new ArrayList<>(), "Barcelona");
        equipo.agregarJugadores();
        Equipo.mostrarJugadores(equipo);

        System.out.println("************************************************");
        equipo.cambiarPosicion(equipo.getJugadores(), Equipo.PORTERO, equipo.getJugadores().get(0));
        equipo.cambiarPosicion(equipo.getJugadores(), Equipo.DEFENSA, equipo.getJugadores().get(1));
        equipo.cambiarPosicion(equipo.getJugadores(), Equipo.DEFENSA, equipo.getJugadores().get(2));
        equipo.cambiarPosicion(equipo.getJugadores(), Equipo.DELANTERO, equipo.getJugadores().get(3));
        equipo.cambiarPosicion(equipo.getJugadores(), Equipo.DELANTERO, equipo.getJugadores().get(4));
        equipo.cambiarPosicion(equipo.getJugadores(), Equipo.DELANTERO, equipo.getJugadores().get(5));

        Equipo.mostrarJugadores(equipo);
        int contadorErrores = Equipo.validarPosiciones(equipo);

        System.out.println("************************************************");
        if (contadorErrores == 0) {
            long contadorDefensas = equipo.getJugadores().stream()
                    .filter((j) -> j.getPosicion().equals(Equipo.DEFENSA))
                    .count();
            long contadorDelanteros = equipo.getJugadores().stream()
                    .filter((j) -> j.getPosicion().equals(Equipo.DELANTERO))
                    .count();
            long contadorMedios = equipo.getJugadores().stream()
                    .filter((j) -> j.getPosicion().equals(Equipo.MEDIO))
                    .count();

            System.out.println("cantidad de defensas: " + contadorDefensas);
            System.out.println("cantidad de delanteros: " + contadorDelanteros);
            System.out.println("Poder de defensa: " + (10 % +(contadorDefensas * 5)));
            System.out.println("Poder de delanteros: " + (50 % +(contadorDelanteros * 5)));

            System.out.printf("Equipo x %s -> poder ataque -> %d, poder defensa -> %d",
                    contadorDefensas + "-" + contadorMedios + "-" + contadorDelanteros,
                    (50 % +(contadorDelanteros * 5)), (10 % +(contadorDefensas * 5)));

        } else {
            System.out.println("debe corregir los errores");
        }

    }

}
