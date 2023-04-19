package Libros;

import tiempo.Fecha;
import Libros.Persona;

public class Libro {
    String titulo, ISBN, edicion, editorial, lugar;
    Persona autor;
    Fecha fechaDeEdicion;
    int paginas;

    public Libro(String titulo, Persona autor, String ISBN, int paginas, String edicion, String editorial, String lugar, Fecha fechaDeEdicion){
       this.titulo = titulo;
       this.autor = autor;
       this.ISBN = ISBN;
       this.paginas = paginas;
       this.edicion = edicion;
       this.editorial = editorial;
       this.lugar = lugar;
       this.fechaDeEdicion = fechaDeEdicion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getLugar() {
        return lugar;
    }

    public void setFechaDeEdicion(Fecha fechaDeEdicion) {
        this.fechaDeEdicion = fechaDeEdicion;
    }

    public Fecha getFechaDeEdicion() {
        return fechaDeEdicion;
    }

    public String toString(){
        return String.format("Titulo: %s\n%s edición\nAutor: %s\nISBN: %s\n%s, %s\n%d paginas", titulo, edicion, autor, ISBN, lugar, fechaDeEdicion.fechaLarga2(), paginas) ;

    }
}
