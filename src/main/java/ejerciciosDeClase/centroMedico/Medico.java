package ejerciciosDeClase.centroMedico;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Medico extends Persona {

    private String especialidad;

    @Builder(builderMethodName = "medicoBuilder")
    public Medico(String nombre, String telefono, String apellido, Integer numeroIdentificacion,
            String especialidad) {
        super(nombre, apellido, numeroIdentificacion, telefono);
        this.especialidad = especialidad;
    }

    protected void decirAlgo() {
        System.out.println("Hola soy un medico");
    }

}
