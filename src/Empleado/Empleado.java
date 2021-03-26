package Empleado;

import Persona.Persona;
import Fecha.Fecha;

public class Empleado extends Persona{
    private int id;
    private long nss;
    private String fechaingreso;


    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }


    public void setNss(long nss){
        this.nss = nss;
    }


    public long getNss(){
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
        System.out.println("ID de Empleado: " + id);
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Apellido: " + super.getApellido());
        System.out.println("NSS: " + nss);
        this.setFechaIngreso(Fecha.getFechaHoy());
        System.out.println("Fecha de Ingreso: " + fechaingreso);
    }


}