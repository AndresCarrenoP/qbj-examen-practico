package Main;

import Empleado.Empleado;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws InterruptedException {

        Empleado nvoemp = new Empleado();
        Scanner reader = new Scanner(System.in);

        System.out.println("\nPre-registro de nuevos empleados");
        System.out.println("Introduzca el nombre del empleado (sin apellidos) y presione la tecla Enter");

        while (reader.hasNextLine()) {
            String inputnombre = reader.nextLine();
            if (!inputnombre.matches("[a-zA-Z\s]+")) {
                System.out.println("Sólo se admiten letras y espacios");
                continue;
            }
            else if (inputnombre.matches(" +")){
                System.out.println("Por favor introduzca un nombre válido");
                continue;
            }
            else if (inputnombre.length() < 2){
                System.out.println("Por favor introduzca mínimo dos characteres");
                continue;
            }
            else {
                nvoemp.setNombre(inputnombre.toUpperCase().trim().replaceAll(" +", " "));
                break;
            }
        }


        System.out.println("\nIntroduzca el(los) apellido(s) del empleado y presione la tecla Enter");

        while (reader.hasNextLine()) {
            String inputapellido = reader.nextLine();
            if (!inputapellido.matches("[a-zA-Z\s]+")) {
                System.out.println("Sólo se admiten letras y espacios");
                continue;
            }
            else if (inputapellido.matches(" +")){
                System.out.println("Por favor introduzca un nombre válido");
                continue;
            }
            else if (inputapellido.length() < 2){
                System.out.println("Por favor introduzca mínimo dos characteres");
                continue;
            }
            else {
                nvoemp.setApellido(inputapellido.toUpperCase().trim().replaceAll(" +", " "));
                break;
            }
        }


        System.out.println("\nSi conoce en NSS del empleado introduzca s, de lo contrario introduzca n");

        while (reader.hasNext()) {
            String yn = reader.nextLine().toLowerCase();
            if (yn.equals("n")) {
                nvoemp.setNss("Desconocido. Deberá proporcionar el NSS del empleado en un máximo de 5 días hábilies");
                break;
            }
            else if (yn .equals("s")) {
                System.out.println("Introduzca el NSS del empleado. Deben ser 11 dígitos");

                while (reader.hasNext()) {
                    String inputnss = reader.nextLine();
                    if (!inputnss.matches("[0-9]+")) {
                        System.out.println("Sólo se admiten números");
                        continue;
                    }
                    else if (inputnss.length() < 11 || inputnss.length() > 11) {
                        System.out.println("Deben ser 11 dígitos");
                        continue;
                    }
                    else {
                        nvoemp.setNss(inputnss);
                        break;
                    }
                }
                break;
            }
            else {
                System.out.println("Por favor introduzca sólo s para 'Sí' o n para 'No'");
            }
        }


        //agregando sleep para simular que el sistema está corriendo un proceso
        Thread.sleep(500);
        System.out.print("\nProcesando");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.println(".\n");
        Thread.sleep(500);


        nvoemp.imprimirDetalles();

    }
}
