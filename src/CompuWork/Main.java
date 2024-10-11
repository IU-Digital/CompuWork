package CompuWork;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        boolean flag = true;
        ArrayList<EmpleadoPermanente> ListaEmpleadosPermanentes = new ArrayList<>();
        ArrayList<EmpleadoTemporal> ListaEmpleadosTemporales = new ArrayList<>();
        ArrayList<Departamento> ListaDepartamentos = new ArrayList<>();
        ArrayList<ReporteDesempeno> ListaReportes = new ArrayList<>();

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CompuWorkGUI().setVisible(true);
            }
        });

        while (flag) {

            System.out.println("\n ***** Bienvenido a CompuWork *****");
            System.out.println("\n ***** Opciones: ******************");
            System.out.println("\n * 1 - Crear Departamento");
            System.out.println("\n * 2 - Crear Empleado");
            System.out.println("\n * 3 - Crear Reporte de Rendimiento");
            System.out.println("\n * 4 - Salir del sistema");
            System.out.println("\n * Digite el númer de la opción que desea realizar:");

            n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("\n Creando Departamento");
                    System.out.println("\n ingrese codigo del departamento:");
                    int codD = sc.nextInt();

                    System.out.println("\n ingrese nombre del departamento:");
                    String nomD = sc.next();

                    System.out.println("\n ingrese nombre del Jefe:");
                    String jefeD = sc.next();

                    Departamento D = new Departamento(codD, nomD, jefeD);

                    ListaDepartamentos.add(D);

                    System.out.println("\n Departamento creado con éxito");

                    break;
                case 2:
                    System.out.println("\n Creando Empleado");

                    System.out.println("\n ingrese codigo del empleado");
                    int codE = sc.nextInt();

                    System.out.println("\n ingrese nombre del empleado");
                    String nomE = sc.next();

                    System.out.println("\n ingrese nombre del departamento");
                    String depE = sc.next();

                    System.out.println("\n ingrese salario del empleado");
                    double sal = sc.nextDouble();

                    System.out.println("\n ingrese desempeño del empleado");
                    String des = sc.next();

                    System.out.println("\n tipo de empleado: ingrese 1 si es Permanente o 2 si es temporal ");
                    int tipo = sc.nextInt();

                    switch (tipo) {
                        case 1:
                            EmpleadoPermanente EP = new EmpleadoPermanente( codE, nomE, depE, sal, des, "Permanente", null);
                            ListaEmpleadosPermanentes.add(EP);
                            break;
                        case 2:
                            EmpleadoTemporal ET = new EmpleadoTemporal( codE, nomE, depE, sal, des, "Temporal", null);
                            ListaEmpleadosTemporales.add(ET);
                            break;
                        default:
                            System.out.println("\n Opción no válida");
                            break;
                    }


                    break;
                case 3:
                    System.out.println("\n Creando Reporte de Rendimiento");

                    System.out.println("\n ingrese codigo del reporte");
                    int codR = sc.nextInt();

                    System.out.println("\n ingrese el nombre del empleado");
                    String nomR = sc.next();

                    System.out.println("\n ingrese la fecha del reporte");
                    String fecha = sc.next();

                    System.out.println("\n ingrese el rendimiento del empleado");
                    String rend = sc.next();

                    ReporteDesempeno RD = new ReporteDesempeno(codR, nomR, fecha, rend);


                    break;
                case 4:
                    System.out.println("\n Saliendo del sistema...");
                    flag = false;
                    break;

                default:
                    System.out.println("\n Opción no válida");
                    break;
            }
        }



    }
}