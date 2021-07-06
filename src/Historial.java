public class Historial {
    private String codHistorial;
    private Paciente paciente;
    //generamos constructor por defecto

    public Historial(String codHistorial, Paciente paciente) {
        this.setCodHistorial(codHistorial);
        this.setPaciente(paciente);
    }
    public String getCodHistorial() {
        return codHistorial;
    }

    public void setCodHistorial(String codHistorial) {
        this.codHistorial = codHistorial;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
