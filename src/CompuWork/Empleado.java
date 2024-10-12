package CompuWork;

import java.util.Date;

public class Empleado {

    private int codigo;
    private String nombre;
    private String departamento;
    private double salario;
    private String desempeño;
    private String tipo;
    private Date fechaInicio;

    // Constructores, getters y setters

    public Empleado(int codE, String nomE, String dep, double sal, String des, String tip, Date fecha) {
       codigo = codE;
       nombre = nomE;
       departamento = dep;
       salario = sal;
       desempeño = des;
       tipo = tip;
       fechaInicio = fecha;

    }

    public void modificarEmpleado() {
        // Lógica para modificar un empleado existente
    }

    public void eliminarEmpleado() {
        // Lógica para eliminar un empleado
    }

    public void verEmpleado() {
        // Lógica para mostrar información del empleado
    }

    public int getCodigo() {
        return codigo;
    }
}
