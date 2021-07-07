import java.util.Date;
import java.util.List;

public class Medico extends Persona{
    private String codMedico;
    private List<Servicio> servicios;
    private Hospital hospital;


    //metodo constructor
    public Medico(String codMedico, String nombre, String primerApellido, String segundoApellido, String dni, Date fechaNacimiento, List<Servicio> servicios, Hospital hospital) {
        super(nombre,primerApellido,segundoApellido,dni,fechaNacimiento);
        this.setCodMedico(codMedico);
        this.setServicios(servicios);
        this.setHospital(hospital);
    }

    //sobrecarga de constructore


    public Medico(String codMedico, String nombre, String primerApellido, String segundoApellido, String dni, Date fechaNacimiento, Hospital hospital) {
        super(nombre,primerApellido,segundoApellido,dni,fechaNacimiento);
        this.setCodMedico(codMedico);
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
