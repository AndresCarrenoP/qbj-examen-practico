package Persona;

public abstract class Persona {
    private static String nombre;
    private static String apellido;


    //constructor default
    public Persona (){}

    //"un constructor que acepte el nombre de la persona como parámetro de entrada"
    //YAGNI :D
    public Persona (String nombre){
        this.nombre =  nombre;
    }


    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }


    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getApellido(){
        return apellido;
    }


    /* "finalmente agrega un Comportamiento llamado imprimirNombre y que imprima el nombre y el apellido."
    En lugar de imprimirNombre se llamará imprimirDetalles */
    public abstract void imprimirDetalles();

}
