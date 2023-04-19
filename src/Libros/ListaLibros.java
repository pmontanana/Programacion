package Libros;
import Libros.*;
import java.util.ArrayList;

public class ListaLibros {
    ArrayList<Libro> lista;

    public ListaLibros(){
        lista  = new ArrayList<Libro>();
    }

    public void anadirLibro(Libro temp){
        lista.add(temp);
    }

    public void eliminarLibro(String titulo){
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));

            if (titulo == lista.get(i).getTitulo()){
                lista.remove(i);
            }
        }

        
    }
}
