package ejerciciosDeClase.equipo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Equipo {
    private List<Jugador> jugadores;
    private String nombreEquipo;

    static final String DELANTERO = "delantero";
    static final String DEFENSA = "Defensa";
    static final String MEDIO = "Medio";
    static final String PORTERO = "Portero";

    public Equipo(List<Jugador> jugadores, String nombreEquipo) {
        this.jugadores = jugadores;
        this.nombreEquipo = nombreEquipo;
    }

    public void agregarJugadores() {
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new Jugador("Messi", DELANTERO, 10, this));
        jugadores.add(new Jugador("Suarez", DELANTERO, 9, this));
        jugadores.add(new Jugador("Pique", DEFENSA, 3, this));
        jugadores.add(new Jugador("Ter Stegen", DEFENSA, 1, this));
        jugadores.add(new Jugador("Busquets", MEDIO, 5, this));
        jugadores.add(new Jugador("Rakitic", MEDIO, 4, this));
        jugadores.add(new Jugador("Coutinho", MEDIO, 7, this));
        jugadores.add(new Jugador("Alba", DEFENSA, 18, this));
        jugadores.add(new Jugador("Semedo", DEFENSA, 2, this));
        jugadores.add(new Jugador("Vidal", MEDIO, 22, this));
        jugadores.add(new Jugador("Lenglet", DEFENSA, 15, this));
        this.jugadores = jugadores;
    }

    public void agregarPosicion(Jugador jugador) {
        this.jugadores.add(jugador);
    }

    public static int validarPosiciones(Equipo equipo) {
        Jugador portero = equipo.getJugadores().stream()
                .filter((j) -> j.getPosicion().equals(PORTERO))
                .findFirst().orElse(null);

        int contadorErrores = 0;

        if (portero == null) {
            System.out.println("\n No hay portero");
            contadorErrores++;
        }

        List<Jugador> defensa = equipo.getJugadores().stream()
                .filter((j) -> j.getPosicion().equals(DEFENSA))
                .collect(Collectors.toList());

        if (defensa.size() < 2) {
            System.out.println("No hay 2 o mas defensas");
            contadorErrores++;
        }

        List<Jugador> delantero = equipo.getJugadores().stream()
                .filter((j) -> j.getPosicion().equals(DELANTERO))
                .collect(Collectors.toList());

        if (delantero.size() < 1) {
            System.out.println("No hay 1 o mas delanteros");
            contadorErrores++;
        }

        return contadorErrores++;

    }

    public static void mostrarJugadores(Equipo equipo) {
        equipo.getJugadores().forEach((jugador) -> {
            System.out.println(jugador.getNombre() + " " + jugador.getPosicion());
        });
    }

    public void cambiarPosicion(List<Jugador> lJugador, String posicion, Jugador jugador)
            throws Exception {
        switch (posicion) {
            case PORTERO:
                // validar si hay portero
                Long cantidad = lJugador.stream().filter((jugado) -> jugado.getPosicion().equals(PORTERO))
                        .count();

                if (cantidad >= 1) {
                    System.out.println("Ya hay un portero, debe cambiarlo antes de agregar otro");
                } else {
                    Jugador j = lJugador
                            .stream()
                            .filter((jugado) -> jugado.equals(jugador))
                            .map((x) -> {
                                x.setPosicion(PORTERO);
                                return x;
                            }).findFirst().get();

                    System.out.println(j);
                }
                break;
            case DEFENSA:
                Jugador j = lJugador
                        .stream()
                        .filter((jugado) -> jugado.equals(jugador))
                        .map((x) -> {
                            x.setPosicion(DEFENSA);
                            return x;
                        }).findFirst().get();

                System.out.println(j);
                break;
            case MEDIO:
                Jugador j2 = lJugador
                        .stream()
                        .filter((jugado) -> jugado.equals(jugador))
                        .map((x) -> {
                            x.setPosicion(MEDIO);
                            return x;
                        }).findFirst().get();

                System.out.println(j2);
                break;
            case DELANTERO:
                Jugador j3 = lJugador
                        .stream()
                        .filter((jugado) -> jugado.equals(jugador))
                        .map((x) -> {
                            x.setPosicion(DELANTERO);
                            return x;
                        }).findFirst().get();

                System.out.println(j3);
                break;
            default:
                throw new Exception("La posicion no esta parametrizada");
        }
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

}