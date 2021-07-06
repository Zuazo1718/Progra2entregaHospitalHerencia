import java.util.Date;

public class Paciente {
    private String cosPaciente;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String dni;
    private Date fechaNacimiento;
    private String numeroSeguridadSicioal;

    //mrtodo constructor

    public Paciente(String cosPaciente, String nombre, String primerApellido, String segundoApellido, String dni, Date fechaNacimiento, String numeroSeguridadSicioal) {
        this.setCosPaciente(cosPaciente);
        this.setNombre(nombre);
        this.setPrimerApellido(primerApellido);
        this.setSegundoApellido(segundoApellido);
        this.setDni(dni);
        this.setFechaNacimiento(fechaNacimiento);
        this.setNumeroSeguridadSicioal(numeroSeguridadSicioal);
    }

    @Override
    public String toString() {
        return "PACIENTE \n" +
                "cosPaciente='" + cosPaciente + '\'' +
                ", nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", numeroSeguridadSicioal='" + numeroSeguridadSicioal ;
    }

    public String getCosPaciente() {
        return cosPaciente;
    }

    public void setCosPaciente(String cosPaciente) {
        this.cosPaciente = cosPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumeroSeguridadSicioal() {
        return numeroSeguridadSicioal;
    }

    public void setNumeroSeguridadSicioal(String numeroSeguridadSicioal) {
        this.numeroSeguridadSicioal = numeroSeguridadSicioal;
    }
}
