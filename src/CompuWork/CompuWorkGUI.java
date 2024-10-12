package CompuWork;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

ArrayList<Empleado> ListaEmpleados = new ArrayList<Empleado>();
ArrayList<Departamento> ListaDepartamentos = new ArrayList<Departamento>();
ArrayList<ReporteDesempeno> ListaReportes = new ArrayList<ReporteDesempeno>();


public class CompuWorkGUI extends JFrame {

    private JTextField codigoDepartamentoField;
    private JTextField nombreDepartamentoField;
    private JTextField codigoEmpleadoField;
    private JTextField nombreEmpleadoField;
    private JTextField departamentoEmpleadoField;
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
        setLayout(new GridLayout(0, 1 ));

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

        add(new JLabel("Departamento Empleado:"));
        departamentoEmpleadoField = new JTextField();
        add(departamentoEmpleadoField);

        add(new JLabel("Salario Empleado:"));
        salarioEmpleadoField = new JTextField();
        add(salarioEmpleadoField);


        JButton crearEmpleadoButton = new JButton("Crear Empleado");
        crearEmpleadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int codE = Integer.parseInt(codigoEmpleadoField.getText());
                String nomE = nombreEmpleadoField.getText();
                String depE = departamentoEmpleadoField.getText();
                double sal = Double.parseDouble(salarioEmpleadoField.getText());
                Empleado E = new Empleado(codE, nomE, depE, sal, null, "Tipo", new Date());
                ListaEmpleados.add(E);

                JOptionPane.showMessageDialog(null, "Empleado Creado con exito:\n" +
                        "Código: " + codE + "\n" +
                        "Nombre: " + nomE + "\n" +
                        "Departamento: " + depE + "\n" +
                        "Salario: " + sal + "\n");
            }
        });
        add(crearEmpleadoButton);

        add(Box.createVerticalStrut(10));

        // Departamento
        add(new JLabel("2. GESTIÓN DE DEPARTAMENTOS"));

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
                JOptionPane.showMessageDialog(null, "Departamento creado con éxito"+
                        "Código: " + codD + "\n" +
                        "Nombre: " + nomD + "\n" );
            }
        });
        add(crearDepartamentoButton);

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
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CompuWorkGUI().setVisible(true);
            }
        });
    }
}
