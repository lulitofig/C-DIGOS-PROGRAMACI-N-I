package EjemploBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Libro> librosTotales = new ArrayList<>();
        List<Libro> librosDisponibles = new ArrayList<>();
        List<Usuario> usuariosRegistrados = new ArrayList<>();
        List<Prestamo> prestamosEnUso = new ArrayList<>();

        Biblioteca biblioteca = new Biblioteca("Biblioteca U cundinamarca", "calle 15", librosTotales,
                librosDisponibles, usuariosRegistrados, prestamosEnUso);

        System.out.println("BIENVENIDO A LA BIBLIOTECA");
        System.out.println("Biblioteca" + biblioteca.getNombre());

        Libro libroA = new Libro(1, "Lulucuentos para dormir", "Edit. lola", "dormir", "yo");
        Usuario userB = new Usuario("Santiago cuellar", "Medicina", 0);

        biblioteca.registraraLibro(libroA);
        biblioteca.registrarUsuario(userB);

        System.out.println("ESTADO INICIAL");
        userB.MostrarInformacion();
        System.out.println("Libros disponibles: " + biblioteca.getListaLibrosDisponibles().size());

        // aqui se simula como si tuviera un prestamo
        System.out.println("Prestamo en proceso");
        // verrifica la disponibilidad
        biblioteca.buscarLibro(libroA);
        // hace le prestamo
        Prestamo prestamo1 = new Prestamo(1001, userB, libroA, "21/10/2025", "25/10/2025", false);
        biblioteca.hacerPrestamo(prestamo1);
        System.out.println("Estado despues de adquririr el libro");
        userB.MostrarInformacion();
        System.out.println("Prestamos: " + biblioteca.getPrestamos().size());
        System.out.println("Libros disponibles:" + biblioteca.getListaLibrosDisponibles().size());

        // devolucoin del libro
        System.out.println("PROCESO DE DEVOLUCION");
        // aqui es como si se hubiese retrasado 3 dias
        prestamo1.calcularMulta();
        biblioteca.libroRecibido(prestamo1);
        System.out.println("ESTADO FINAL ");
        userB.MostrarInformacion();
        System.out.println("Prestamos:" + biblioteca.getPrestamos().size());
        System.out.println("Libros disponibles:" + biblioteca.getListaLibrosDisponibles().size());
        biblioteca.buscarLibro(libroA);
    }
}