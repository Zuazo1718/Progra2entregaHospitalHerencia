import java.util.Date;

public class Paciente extends Persona{
    private String cosPaciente;
    private String numeroSeguridadSicioal;

    //mrtodo constructor

    public Paciente(String cosPaciente, String nombre, String primerApellido, String segundoApellido, String dni, Date fechaNacimiento, String numeroSeguridadSicioal) {
       super(nombre,primerApellido,segundoApellido, dni ,fechaNacimiento);
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


    public String getNumeroSeguridadSicioal() {
        return numeroSeguridadSicioal;
    }

    public void setNumeroSeguridadSicioal(String numeroSeguridadSicioal) {
        this.numeroSeguridadSicioal = numeroSeguridadSicioal;
    }
}
