package Main;

import Empleado.Empleado;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nPre-registro de nuevos empleados\nIntroduzca el nombre del empleado y presione la tecla Enter");

        Empleado nvoemp = new Empleado();
        nvoemp.setNombre("Juan");
        nvoemp.setApellido("Cuerdas");
        nvoemp.setId(12345);
        nvoemp.setNss(12345678910L);
        nvoemp.imprimirDetalles();

    }
}
