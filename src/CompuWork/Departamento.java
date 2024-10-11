package CompuWork;

public class Departamento {

        private int codigo;
        private String nombre;
        private Empleado JefeDepartamento;

        public Departamento(int codD, String nomD, Empleado jefe) {
                codigo = codD;
                nombre = nomD;
                JefeDepartamento = jefe;
        }

        public void modificarDepartamento() {
            // Lógica para modificar un departamento existente
        }

        public void eliminarDepartamento() {
            // Lógica para eliminar un departamento
        }

        public void verEmpleados() {
            // Lógica para mostrar la lista de empleados del departamento
        }


}
