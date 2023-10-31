package ejerciciosDeClase.equipo;

public class Jugador {
    private String nombre;
    private String posicion;
    private Integer numero;
    private Equipo equipo;

    public Jugador(String nombre, String posicion, Integer numero, Equipo equipo) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.numero = numero;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((posicion == null) ? 0 : posicion.hashCode());
        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
        result = prime * result + ((equipo == null) ? 0 : equipo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Jugador other = (Jugador) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (posicion == null) {
            if (other.posicion != null)
                return false;
        } else if (!posicion.equals(other.posicion))
            return false;
        if (numero == null) {
            if (other.numero != null)
                return false;
        } else if (!numero.equals(other.numero))
            return false;
        if (equipo == null) {
            if (other.equipo != null)
                return false;
        } else if (!equipo.equals(other.equipo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Jugador [nombre=" + nombre + ", posicion=" + posicion + ", numero=" + numero + ", equipo=" + equipo
                + "]";
    }

}