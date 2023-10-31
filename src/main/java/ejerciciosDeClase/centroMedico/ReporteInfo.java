package ejerciciosDeClase.centroMedico;

public class ReporteInfo {

    private static StringBuilder reporte = new StringBuilder();

    public static void crearReporte(Persona persona) {

        if (persona instanceof Paciente) {
            Paciente p1 = (Paciente) persona;
            reporte.append("Nombre: " + p1.getNombre() + "\n");
            reporte.append("Apellido: " + p1.getApellido() + "\n");
            reporte.append("Numero de identificacion: " + p1.getNumeroIdentificacion() + "\n");
            reporte.append("Telefono: " + p1.getTelefono() + "\n");
            reporte.append("Fecha de nacimiento: " + p1.getFechaNacimiento() + "\n");
            reporte.append("Tipo de sangre: " + p1.getTipoSangre() + "\n");
            reporte.append("paciente.txt");
        } else if (persona instanceof Medico) {
            Medico m1 = (Medico) persona;
            reporte.append("Nombre: " + m1.getNombre() + "\n");
            reporte.append("Apellido: " + m1.getApellido() + "\n");
            reporte.append("Numero de identificacion: " + m1.getNumeroIdentificacion() + "\n");
            reporte.append("Telefono: " + m1.getTelefono() + "\n");
            reporte.append("Especialidad: " + m1.getEspecialidad() + "\n");
            reporte.append("medico.txt");
        } else {
            System.out.println("No se puede crear el reporte");
        }

        System.out.println(reporte);

    }

}
