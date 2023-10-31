package ejerciciosDeClase.centroMedico;

import java.time.LocalDate;

import org.example.Main;

public class Prueba {

    public static void main(String[] args) {

        Persona persona = Persona.builder()
                .nombre("Juan")
                .apellido("Alvarez")
                .telefono("3155738811")
                .numeroIdentificacion(1111)
                .build();

        Paciente paciente = Paciente.pacienteBuilder()
                .nombre("Juan")
                .apellido("Pérez")
                .numeroIdentificacion(123456789)
                .telefono("555-1234")
                .fechaNacimiento(LocalDate.now())
                .tipoSangre("O+")
                .build();

        Persona persona2 = Paciente.pacienteBuilder()
                .nombre("Juan")
                .apellido("Pérez")
                .numeroIdentificacion(123456789)
                .telefono("555-1234")
                .fechaNacimiento(LocalDate.now())
                .tipoSangre("O+")
                .build();

        Persona medico = Medico.medicoBuilder()
                .nombre("Juan")
                .apellido("Pérez")
                .numeroIdentificacion(123456789)
                .telefono("555-1234")
                .especialidad(Especialidades.MEDICINA_GENERAL)
                .build();
        ReporteInfo.crearReporte(medico);

        Evento eve = Evento.eventoBuilder()
                .numeroAutorizacion("123456789")
                .codigoEvento(1)
                .build();

        CentroMedico centroMetdi = new CentroMedico();
        centroMetdi.agregarMedico((Medico) medico);
        centroMetdi.agregarPaciente(paciente);
        centroMetdi.agregarPaciente((Paciente) persona2);
        centroMetdi.setNombreCentroMedico("Centro Medico de Occidente");
        centroMetdi.inserEvento(eve);

        paciente.decirAlgo();

    }

}
