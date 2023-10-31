package ejerciciosDeClase.centroMedico;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Evento {

    private String numeroAutorizacion;
    private Integer codigoEvento;
    private CentroMedico centroMedico;
    private Medico medico;
    private Paciente paciente;

    @Builder(builderMethodName = "eventoBuilder")
    public Evento(String numeroAutorizacion, Integer codigoEvento) {
        this.numeroAutorizacion = numeroAutorizacion;
        this.codigoEvento = codigoEvento;
    }

    public void insertarEvento(CentroMedico centroMedico, Paciente paciente, Medico medico, String especialidad) {
        System.out.println("Simulando insersion consumo BD");
        this.centroMedico = centroMedico;
        this.paciente = paciente;
        this.medico = medico;
        System.out.println(this.toString());
        System.out.println(centroMedico);
        System.out.println(paciente);
        System.out.println(medico);
    }

}
