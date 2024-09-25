package CompuWork;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        Empleado[] ListaEmpleados = new Empleado[10];
        Departamento[] ListaDepartamentos = new Departamento[10];


        System.out.println("\n Bienvenido a CompuWork");
        System.out.println("\n Seleccione una opción");
        System.out.println("\n 1 - Crear Departamento");
        System.out.println("\n 2 - Crear Empleado");
        System.out.println("\n 3 - Crear Reporte de Rendimiento");

        n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.println("\n Creando Departamento");

                break;
            case 2:
                System.out.println("\n Creando Empleado");
                break;
            case 3:
                System.out.println("\n Creando Reporte de Rendimiento");
                break;
            default:
                System.out.println("\n Opción no válida");
                break;
        }


    }
}