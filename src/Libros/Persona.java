
package libros;

public class Persona {
    
    String nombre;
    long DNI;
    char letraDNI;
    
    public Persona(String nombre, long DNI){
        this.nombre = nombre;
        this.DNI = DNI;
        letraDNI = calculaLetra(DNI);
    }
    
    private char calculaLetra(long DNI){
        long resto;
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        
        resto = DNI % 23;
        return letras.charAt((int)resto);
    }
    
    public void muestraPersona(){
        System.out.println(nombre+"_____"+DNI+"-"+letraDNI);
    }
}
