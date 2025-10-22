package EjemploBiblioteca;

import java.util.List;

public class Libro {
    private int id;
    private String nombre;
    private String editorial;
    private String tema;
    private String autor;
    private List<Libro> listaLibrosDisponibles;

    // constructor
    public Libro(int id, String nombre, String editorial, String tema, String autor) {
        this.id = id;
        this.nombre = nombre;
        this.editorial = editorial;
        this.tema = tema;
        this.autor = autor;
    }

    // metodos de clase
    // getters
    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getEditorial() {
        return this.editorial;
    }

    public String getTema() {
        return this.tema;
    }

    public String getAutor() {
        return this.autor;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void actualizarDisponibilidad() {
        // codigo para actualizar disponibilidad
        Prestamo prestamo = new Prestamo(0, null, this, null, null, false);
        if (prestamo.getDevuelto() == true) {
            listaLibrosDisponibles.add(this);
            System.out.println("El libro ha sido devuelto y está disponible.");
        } else {
            listaLibrosDisponibles.remove(this);
            System.out.println("El libro está en préstamo y no está disponible.");
        }
    }
}