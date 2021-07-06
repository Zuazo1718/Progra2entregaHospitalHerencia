import java.util.Date;
import java.util.List;

public class Medico {
    private String codMedico;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String dni;
    private Date fechaNacimiento;
    private List<Servicio> servicios;
    private Hospital hospital;


    //metodo constructor
    public Medico(String codMedico, String nombre, String primerApellido, String segundoApellido, String dni, Date fechaNacimiento, List<Servicio> servicios, Hospital hospital) {
        this.setCodMedico(codMedico);
        this.setNombre(nombre);
        this.setPrimerApellido(primerApellido);
        this.setSegundoApellido(segundoApellido);
        this.setDni(dni);
        this.setFechaNacimiento(fechaNacimiento);
        this.setServicios(servicios);
        this.setHospital(hospital);
    }

    //sobrecarga de constructore


    public Medico(String codMedico, String nombre, String primerApellido, String segundoApellido, String dni, Date fechaNacimiento, Hospital hospital) {
        this.setCodMedico(codMedico);
        this.setNombre(nombre);
        this.setPrimerApellido(primerApellido);
        this.setSegundoApellido(segundoApellido);
        this.setDni(dni);
        this.setFechaNacimiento(fechaNacimiento);
        this.setHospital(hospital);
    }

    @Override
    public String toString() {
        return "MEDICO\n" +
                "codMedico='" + codMedico + '\'' +
                ", nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", hospital=" + hospital.getNombre() +"\n\n";

    }

    public String getCodMedico() {
        return codMedico;
    }

    public void setCodMedico(String codMedico) {
        this.codMedico = codMedico;
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

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
