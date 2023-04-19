package Libros;

public class Persona {
    String nombre, dni;

    public Persona(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    public String toString(){
        return nombre;
    }
}
