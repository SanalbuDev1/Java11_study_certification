package ejerciciosDeClase.centroMedico;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Persona {

    protected String nombre;
    protected String apellido;
    protected Integer numeroIdentificacion;
    protected String telefono;

    public Persona() {
    }

    @Builder
    public Persona(String nombre, String apellido, Integer numeroIdentificacion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroIdentificacion = numeroIdentificacion;
        this.telefono = telefono;
    }

    protected void decirAlgo() {
        System.out.println("Hola soy una persona");
    }
}
