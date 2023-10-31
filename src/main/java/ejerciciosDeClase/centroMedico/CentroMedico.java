package ejerciciosDeClase.centroMedico;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CentroMedico {

    private String nombreCentroMedico;
    private List<Paciente> listaPacientes = new ArrayList<>();
    private List<Medico> listaMedicos = new ArrayList<>();
    private Especialidades listaEspecialidades;

    public CentroMedico() {

    }

    public void agregarPaciente(Paciente paciente) {
        listaPacientes.add(paciente);
    }

    public void agregarMedico(Medico medico) {
        listaMedicos.add(medico);
    }

    public void inserEvento(Evento evento) {
        evento.insertarEvento(this, listaPacientes.get(0), listaMedicos.get(0), listaEspecialidades.MEDICINA_GENERAL);
    }

}
