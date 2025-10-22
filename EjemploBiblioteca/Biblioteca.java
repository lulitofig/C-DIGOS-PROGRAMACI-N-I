package EjemploBiblioteca;

import java.util.List;

public class Biblioteca {
    private String nombre;
    private String direccion;
    private List<Libro> libros;
    private List<Libro> listaLibrosDisponibles;
    private List<Usuario> usuarios;
    private List<Prestamo> listaLibrosUso;

    // constructor
    public Biblioteca(String nombre, String direccion, List<Libro> libros, List<Libro> listaLibrosDisponibles,
            List<Usuario> usuarios, List<Prestamo> listaLibrosUso) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.libros = libros;
        this.listaLibrosDisponibles = listaLibrosDisponibles;
        this.usuarios = usuarios;
        this.listaLibrosUso = listaLibrosUso;
    }

    // metodos de clase
    // getters
    public String getNombre() {
        return this.nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public List<Libro> getLibros() {
        return this.libros;
    }

    public List<Libro> getListaLibrosDisponibles() {
        return this.listaLibrosDisponibles;
    }

    public List<Usuario> getUsuarios() {
        return this.usuarios;
    }

    public List<Prestamo> getPrestamos() {
        return this.listaLibrosUso;
    }

    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public void setListaLibrosDisponibles(List<Libro> listaLibrosDisponibles) {
        this.listaLibrosDisponibles = listaLibrosDisponibles;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void setPrestamos(List<Prestamo> listaLibrosUso) {
        this.listaLibrosUso = listaLibrosUso;
    }

    public void registraraLibro(Libro libro) {
        this.libros.add(libro);
        this.listaLibrosDisponibles.add(libro);
    }

    public void registrarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public void buscarLibro(Libro nombreLibro) {
        for (Libro libro : this.libros) {
            if (libro.getNombre().equals(nombreLibro)) {
                System.out.println("Libro encontrado: " + libro.getNombre());
                return;
            }
        }
        System.out.println("No tenemos este libro en biblioteca");
    }

    public void hacerPrestamo(Prestamo prestamo) {
        this.listaLibrosUso.add(prestamo);
        this.listaLibrosDisponibles.remove(prestamo.getNombreLibro());
    }

    public void libroRecibido(Prestamo prestamo) {
        prestamo.setDevuelto(true);
        this.listaLibrosDisponibles.add(prestamo.getNombreLibro());

    }

}