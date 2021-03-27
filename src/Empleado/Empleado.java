package Empleado;

import Persona.Persona;
import Fecha.Fecha;
import java.util.Random;

public class Empleado extends Persona{
    private static String id;
    private static String nss;
    private static String fechaingreso;


    public void setId(String id){
        this.id = id;
    }

    public void generarId () {
        Random rand = new Random();
        int i = rand.nextInt(9000)+1000;
        StringBuilder s1 = new StringBuilder();
        s1.append(super.getNombre().charAt(0));
        s1.append(super.getApellido().charAt(0));
        s1.append(i);
        String idgenerado = s1.toString();
        setId(idgenerado);
    }

    public String getId(){
        return id;
    }


    public void setNss(String nss){
        this.nss = nss;
    }

    public String getNss(){
        return nss;
    }


    public void setFechaIngreso(String fechaingreso){
        this.fechaingreso = fechaingreso;
    }

    public String getFechaIngreso(){
        return fechaingreso;
    }


    @Override
    public void imprimirDetalles(){
        this.generarId();
        System.out.println("ID de Empleado: " + id);
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Apellido: " + super.getApellido());
        System.out.println("NSS: " + nss);
        this.setFechaIngreso(Fecha.getFechaHoy());
        System.out.println("Fecha de Ingreso: " + fechaingreso);
    }
}