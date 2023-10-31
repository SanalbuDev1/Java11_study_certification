package ejerciciosDeClase.centroMedico;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Paciente extends Persona {
    private LocalDate fechaNacimiento;
    private String tipoSangre;

    @Builder(builderMethodName = "pacienteBuilder")
    public Paciente(String nombre, String telefono, String apellido, Integer numeroIdentificacion,
            LocalDate fechaNacimiento, String tipoSangre) {
        super(nombre, apellido, numeroIdentificacion, telefono);
        this.fechaNacimiento = fechaNacimiento;
        this.tipoSangre = tipoSangre;
    }

    public Paciente() {
        super();
    }

    public void decirAlgo() {
        super.decirAlgo();
        System.out.println("Hola soy un paciente");
    }

}
