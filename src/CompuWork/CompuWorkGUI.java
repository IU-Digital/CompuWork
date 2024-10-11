package CompuWork;

import java.util.Date;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompuWorkGUI extends JFrame {

    private JTextField codigoDepartamentoField;
    private JTextField nombreDepartamentoField;
    private JTextField codigoEmpleadoField;
    private JTextField nombreEmpleadoField;
    private JTextField departamentoEmpleadoField;
    private JTextField salarioEmpleadoField;
    private JTextField desempenoEmpleadoField;
    private JTextField codigoReporteField;
    private JTextField nombreReporteField;
    private JTextField fechaReporteField;
    private JTextField rendimientoReporteField;

    public CompuWorkGUI() {
        setTitle("CompuWork");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 2));

        // Departamento
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
                // Lógica para crear departamento
                int codD = Integer.parseInt(codigoDepartamentoField.getText());
                String nomD = nombreDepartamentoField.getText();
                Departamento D = new Departamento(codD, nomD, null);
                // Agregar a la lista de departamentos
                // ListaDepartamentos.add(D);
                JOptionPane.showMessageDialog(null, "Departamento creado con éxito");
            }
        });
        add(crearDepartamentoButton);

        // Empleado
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

        add(new JLabel("Desempeño Empleado:"));
        desempenoEmpleadoField = new JTextField();
        add(desempenoEmpleadoField);

        JButton crearEmpleadoButton = new JButton("Crear Empleado");
        crearEmpleadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para crear empleado
                int codE = Integer.parseInt(codigoEmpleadoField.getText());
                String nomE = nombreEmpleadoField.getText();
                String depE = departamentoEmpleadoField.getText();
                double sal = Double.parseDouble(salarioEmpleadoField.getText());
                String des = desempenoEmpleadoField.getText();
                Empleado E = new Empleado(codE, nomE, depE, sal, des, "Tipo", new Date());
                // Agregar a la lista de empleados
                // ListaEmpleados.add(E);
                JOptionPane.showMessageDialog(null, "Empleado creado con éxito");
            }
        });
        add(crearEmpleadoButton);

        // Reporte de Desempeño
        add(new JLabel("Código Reporte:"));
        codigoReporteField = new JTextField();
        add(codigoReporteField);

        add(new JLabel("Nombre Empleado:"));
        nombreReporteField = new JTextField();
        add(nombreReporteField);

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
                String nomR = nombreReporteField.getText();
                String fecha = fechaReporteField.getText();
                String rend = rendimientoReporteField.getText();
                ReporteDesempeno RD = new ReporteDesempeno(codR, nomR, fecha, rend);
                // Agregar a la lista de reportes
                // ListaReportes.add(RD);
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
