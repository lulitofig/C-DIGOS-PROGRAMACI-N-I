package EjemploBiblioteca;

public class Usuario {
    private String nombre;
    private String carrera;
    private int librosAdquiridos;

    // constructor
    public Usuario(String nombre, String carrera, int librosAdquiridos) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.librosAdquiridos = librosAdquiridos;
    }

    // getters
    public String getNombre() {
        return this.nombre;
    }

    public String getCarrera() {
        return this.carrera;
    }

    public int getLibrosAdquiridos() {
        return this.librosAdquiridos;
    }

    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setLibrosAdquiridos(int librosAdquiridos) {
        this.librosAdquiridos = librosAdquiridos;
    }

    public void MostrarInformacion() {
        System.out.println("Nombre:" + this.nombre);
        System.out.println("Carrera:" + this.carrera);
        System.out.println("Libros en uso:" + this.librosAdquiridos);
    }
}
