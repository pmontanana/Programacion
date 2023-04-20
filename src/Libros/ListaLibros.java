package Libros;
import Libros.*;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.SingleSelectionModel;

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
            if (titulo == lista.get(i).getTitulo()){
                lista.remove(i);
            }
        }

        
    }

    public void modificarDatos(String titulo){
        Libro ejemplar;
        for(int i = 0; i < lista.size(); i++){
            ejemplar = lista.get(i);
            if (titulo == ejemplar.getTitulo()){
                String nuevoTitulo, nuevaEditorial;
                int paginas;
                Scanner sc = new Scanner(System.in);
                System.out.println("Libro encontrado.");
                System.out.println("Introudzca nuevo título");
                nuevoTitulo = sc.nextLine();
                ejemplar.setTitulo(nuevoTitulo);
                System.out.println("Introduzca nueva editorial");
                nuevaEditorial = sc.nextLine();
                ejemplar.setEditorial(nuevaEditorial);
                System.out.println("Introduce nuevo numero de paginas");
                paginas = Integer.parseInt(sc.nextLine());
                ejemplar.setPaginas(paginas);
            }
        }
    }

    public void listarLibros(){
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
}
