package CompuWork;
import java.util.Date;

public class ReporteDesempeno {

    private int codigo;
    private String empleado;
    private String fecha;
    private String metricaDesempeno;

    public ReporteDesempeno(int codR, String emp, String fec, String met) {
        codigo = codR;
        empleado = emp;
        fecha = fec;
        metricaDesempeno = met;
    }

}
