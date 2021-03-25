package Fecha;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fecha {

    public static String getFechaHoy(){
        return LocalDate.now().format(DateTimeFormatter.ofPattern("dd MMM yyyy"));
    }

}