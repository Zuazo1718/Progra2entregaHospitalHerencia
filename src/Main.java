import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ciudad ciudad = new Ciudad("CR1879V","Cochabamba");
        //lista de hospitales
        Hospital viedma = new Hospital("VC7896","Viedman",ciudad,789615);
        Hospital VillaPagador = new Hospital("VPC5874","VillaPagador",ciudad,587496);
        //Medico
        Medico medico = new Medico("89654","Lucas","Perez","Gayardo","8596", Calendar.getInstance().getTime(),viedma);
        Medico smedico = new Medico("148954","Saul","Zeballos","Yucra","2598", Calendar.getInstance().getTime(),VillaPagador);

        //lista de servicios
        Servicio consultas = new Servicio("R110","Revision ",30,"Bienestar");
        Servicio tratamiento = new Servicio("T220","Tratamiento ",50,"Eficiente");
        Servicio atencionMedica = new Servicio("AT330","Atencion Medica ",90,"Exelente");
        List<Servicio> servicios = new ArrayList<>();
        servicios.add(consultas);
        servicios.add(tratamiento);
        servicios.add(atencionMedica);

        //pacientes
        Paciente julioMiranda = new Paciente("15789","Julio","Miranda","Claure","259784",Calendar.getInstance().getTime(),"963215");
        Paciente millerMamani = new Paciente("20365","Miller","Mamani","Choque","587469",Calendar.getInstance().getTime(), "587463");

        //historiales

        Historial historialJulio = new Historial("HJ7841",julioMiranda);
        Historial historialMiller = new Historial("12364",millerMamani);

        //visistas
        Visita julioM = new Visita("1440",Calendar.getInstance().getTime(),viedma,consultas,medico,"Poco Saludable","Ninguno",20,Calendar.getInstance().getTime(),historialJulio);
        Visita millerM = new Visita("1725",Calendar.getInstance().getTime(),VillaPagador,atencionMedica,smedico,"Saludable","Ninguno",14,Calendar.getInstance().getTime(),historialMiller);

        System.out.println(viedma);
        System.out.println(VillaPagador);
        System.out.print(servicios);
        System.out.print(medico);
        System.out.print(smedico);
        System.out.println(julioMiranda +" ,Historial "+ historialJulio.getCodHistorial());
        System.out.println("VISITA \n" + " Codigo= "+ julioM.getCodVisita()  + " Fecha Hora= " + julioM.getFechaHora() + " Hospital= " +
                viedma.getNombre() + " Consulta= " +consultas.getNombre() +" Codigo del Medico= "+ medico.getCodMedico() +
                " Diagnostico= " + julioM.getDiagnostico() + " Tratamiento= "+ julioM.getTratamiento() + " NRO de Cama= " + julioM.getNumeroCama() +
                " Fecha deSalida= " + julioM.getFechaSalida() + " Codigo del Historial= " +historialJulio.getCodHistorial() );

        System.out.println(millerMamani +" ,Historial "+ historialMiller.getCodHistorial());
        System.out.println("VISITA \n" + " Codigo= "+ millerM.getCodVisita()  + " Fecha Hora= " + millerM.getFechaHora() + " Hospital= " +
                VillaPagador.getNombre() + " Consulta= " +consultas.getNombre() +" Codigo del Medico= "+ medico.getCodMedico() +
                " Diagnostico= " + millerM.getDiagnostico() + " Tratamiento= "+ millerM.getTratamiento() + " NRO de Cama= " + millerM.getNumeroCama() +
                " Fecha deSalida= " + millerM.getFechaSalida() + " Codigo del Historial= " +historialMiller.getCodHistorial() );



    }


























}
