import tiempo.Hora;
import libros.*;
import tiempo.Fecha;


public class App {
    public static void pruebaHoras() {
        Hora test = new Hora(1, 15, 3);
        Hora test2 = new Hora(3, 15, 10);
        Hora test3 = new Hora(0, 0, 0);
        Hora test4 = new Hora(1, 15, 3);
        test3.deSegundos(test.segundosDesde(test2));
        System.out.println("Probamos segundosDesde " + test3);
        Hora testIncremento = new Hora(0, 59, 59);
        testIncremento.siguiente();
        System.out.println("Probamos siguiente " + testIncremento);
        Hora testDecremento = new Hora(1, 0, 0);
        testDecremento.anterior();
        System.out.println("Probamos anterior " + testDecremento);
        testDecremento = new Hora(0, 0, 0);
        testDecremento.anterior();
        System.out.println("Probamos anterior con 0,0,0 " + testDecremento);
        System.out.println("Probamos copia " + test.copia());
        System.out.println(test.igualQue(test4));
        System.out.println(test.menorQue(test2));
        System.out.println(test.mayorQue(test3));

    }

    public static void pruebaFechas() {
        Fecha test = new Fecha(2, 12, 2004);

    
        System.out.println(test);
        System.out.println(test.diasMes(2));
        test.fechaCorta();
        test.fechaLarga();
        test.anterior();
        System.out.println(test);
        test.siguienteDia();
        test.siguienteDia();
        System.out.println(test);
    }

    public static void pruebaLibro(){
        Persona autor1 = new Persona("Juan", "2182182F");
        
        Libro test = new Libro("El Quijote", autor1, "8219281", 12, "3ª", "Teide", "Albacete", new Fecha(23, 12, 1900));
        Libro test2 = new Libro("El Quijote2", autor1, "8219282", 13, "4ª", "Teide", "Albacete", new Fecha(23, 12, 1900));
        ListaLibros lista = new ListaLibros();
        lista.anadirLibro(test);
        lista.anadirLibro(test2);
        lista.listarLibros();
        lista.eliminarLibro("El Quijote2");
        lista.modificarDatos("El Quijote");
        lista.listarLibros();
    }

    public static void main(String[] args) {
        //pruebaHoras();
        //pruebaFechas();
        pruebaLibro();
        
    }
}
