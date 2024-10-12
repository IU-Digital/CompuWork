import CompuWork.Departamento;
import CompuWork.Empleado;
import CompuWork.ReporteDesempeno;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

public static void main(String[] args) {
    ArrayList<Empleado> ListaEmpleados = new ArrayList<Empleado>();
    ArrayList<Departamento> ListaDepartamentos = new ArrayList<Departamento>();
    ArrayList<ReporteDesempeno> ListaReportes = new ArrayList<ReporteDesempeno>();


    class CompuWorkGUI extends JFrame {

        private JTextField codigoDepartamentoField;
        private JTextField nombreDepartamentoField;
        private JTextField codigoEmpleadoField;
        private JTextField nombreEmpleadoField;
        private JTextField salarioEmpleadoField;
        private JTextField codigoReporteField;
        private JTextField empleadoReporteField;
        private JTextField fechaReporteField;
        private JTextField rendimientoReporteField;

        public CompuWorkGUI() {
            setTitle("CompuWork");
            setSize(400, 600);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setLayout(new GridLayout(0, 2));

            JLabel bienvenido = new JLabel("BIENVENIDO A COMPUWORK");
            bienvenido.setHorizontalAlignment(SwingConstants.CENTER); // Centrar JLabel
            add(bienvenido);

            add(Box.createVerticalStrut(10));

            // Empleado

            JLabel gestionEmpleados = new JLabel("GESTIÓN DE EMPLEADOS");
            gestionEmpleados.setHorizontalAlignment(SwingConstants.CENTER); // Centrar JLabel
            add(gestionEmpleados);

            add(Box.createVerticalStrut(10));

            add(new JLabel("CREAR EMPLEADO"));


            add(Box.createVerticalStrut(10));

            add(new JLabel("Código Empleado:"));
            codigoEmpleadoField = new JTextField();
            add(codigoEmpleadoField);

            add(new JLabel("Nombre Empleado:"));
            nombreEmpleadoField = new JTextField();
            add(nombreEmpleadoField);

            add(new JLabel("Salario Empleado:"));
            salarioEmpleadoField = new JTextField();
            add(salarioEmpleadoField);


            JButton crearEmpleadoButton = new JButton("Crear Empleado");
            crearEmpleadoButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int codE = Integer.parseInt(codigoEmpleadoField.getText());
                    String nomE = nombreEmpleadoField.getText();
                    double sal = Double.parseDouble(salarioEmpleadoField.getText());
                    Empleado E = new Empleado(codE, nomE, null, sal, null, "Tipo", new Date());
                    ListaEmpleados.add(E);

                    JOptionPane.showMessageDialog(null, "Empleado Creado con exito:\n" +
                            "Código: " + codE + "\n" +
                            "Nombre: " + nomE + "\n" +
                            "Departamento: Sin Asignar"+
                            "Salario: " + sal + "\n");
                }
            });
            add(crearEmpleadoButton);

            JButton asignarDepartamentoButton = new JButton("Asignar Empleado a Departamento");
            asignarDepartamentoButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showInputDialog("Ingrese el código del empleado");
                    JOptionPane.showInputDialog("Ingrese el código del departamento");

                }

            });
            add(asignarDepartamentoButton);

            JButton eliminarEmpleadoButton = new JButton("Eliminar Empleado");
            eliminarEmpleadoButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String codEE = JOptionPane.showInputDialog("Ingrese el código del empleado a Eliminar");
                    int codE = Integer.parseInt(codEE);
                    for (Empleado E : ListaEmpleados) {
                        if (E.getCodigo() == codE) {
                            ListaEmpleados.remove(E);
                            JOptionPane.showMessageDialog(null, "Empleado eliminado con éxito");
                        }
                    }
                }

            });
            add(eliminarEmpleadoButton);

            add(Box.createVerticalStrut(10));

            // Departamento
            add(new JLabel("GESTIÓN DE DEPARTAMENTOS"));

            add(Box.createVerticalStrut(10));

            add(new JLabel("Crear Departamento"));

            add(Box.createVerticalStrut(10));


            add(new JLabel("Código Departamento:"));
            codigoDepartamentoField = new JTextField();
            add(codigoDepartamentoField);

            add(new JLabel("Nombre Departamento:"));
            nombreDepartamentoField = new JTextField();
            add(nombreDepartamentoField);

            JButton crearDepartamentoButton = new JButton("Crear Departamento");
            crearDepartamentoButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int codD = Integer.parseInt(codigoDepartamentoField.getText());
                    String nomD = nombreDepartamentoField.getText();
                    Departamento D = new Departamento(codD, nomD, null);
                    ListaDepartamentos.add(D);
                    JOptionPane.showMessageDialog(null, "Departamento creado con éxito" +
                            "Código: " + codD + "\n" +
                            "Nombre: " + nomD + "\n");
                }
            });
            add(crearDepartamentoButton);

            JButton eliminarDepartamentoButton = new JButton("Eliminar Departamento");
            eliminarDepartamentoButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showInputDialog("Ingrese el código del Departamento a Eliminar");

                }

            });
            add(eliminarDepartamentoButton);

            JButton jefeDepartamentoButton = new JButton("Asignar Jefe de Departamento");
            jefeDepartamentoButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showInputDialog("Ingrese el código del Departamento");
                    JOptionPane.showInputDialog("Ingrese el código del Empleado a Asignar como jefe de Departamento");

                }

            });
            add(jefeDepartamentoButton);


            add(Box.createVerticalStrut(10));

            // Reporte de Desempeño

            add(new JLabel("3. GESTIÓN DE REPORTES DE DESEMPEÑO"));

            add(Box.createVerticalStrut(10));

            add(new JLabel("Código Reporte:"));
            codigoReporteField = new JTextField();
            add(codigoReporteField);

            add(new JLabel("Código del Empleado:"));
            empleadoReporteField = new JTextField();
            add(empleadoReporteField);

            add(new JLabel("Fecha Reporte:"));
            fechaReporteField = new JTextField();
            add(fechaReporteField);

            add(new JLabel("Rendimiento Empleado:"));
            rendimientoReporteField = new JTextField();
            add(rendimientoReporteField);

            JButton crearReporteButton = new JButton("Crear Reporte");
            crearReporteButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Lógica para crear reporte
                    int codR = Integer.parseInt(codigoReporteField.getText());
                    String nomR = empleadoReporteField.getText();
                    String fecha = fechaReporteField.getText();
                    String rend = rendimientoReporteField.getText();
                    ReporteDesempeno RD = new ReporteDesempeno(codR, nomR, fecha, rend);
                    ListaReportes.add(RD);
                    JOptionPane.showMessageDialog(null, "Reporte creado con éxito");
                }
            });
            add(crearReporteButton);

            add(Box.createVerticalStrut(50));

        }
    }

    new CompuWorkGUI().setVisible(true);
}
