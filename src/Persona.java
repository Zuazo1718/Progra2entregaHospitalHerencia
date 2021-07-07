import java.util.Date;

public class Persona {
    protected String nombre;
    protected String primerApellido;
    protected String segundoApellido;
    protected String dni;
    protected Date fechaNacimiento;

    public Persona(String nombre, String primerApellido, String segundoApellido, String dni, Date fechaNacimiento) {
        this.setNombre(nombre);
        this.setPrimerApellido(primerApellido);
        this.setSegundoApellido(segundoApellido);
        this.setDni(dni);
        this.setFechaNacimiento(fechaNacimiento);
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

    @Override
    public String toString() {
        String nombreCompleto = primerApellido;
        if (segundoApellido != null){
            nombreCompleto += " " + segundoApellido;
        }
        nombreCompleto += " " + nombre;
        nombreCompleto += " " + dni;
        nombreCompleto += " " + fechaNacimiento;
        return nombreCompleto;
    }
}
