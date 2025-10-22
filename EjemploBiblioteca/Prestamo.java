package EjemploBiblioteca;

public class Prestamo {
    private int idPrestamo;
    private Usuario usuario; // Corregido: tipo debe ser minúsculas por convención, pero Usuario está bien
                             // aquí.
    private Libro nombreLibro; // Corregido: aunque se llama nombreLibro, es un objeto Libro.
    private String fechaPrestamo;
    private String fechaDevolucion;
    private boolean devuelto;

    // Constructor
    public Prestamo(int idPrestamo, Usuario usuario, Libro nombreLibro, String fechaPrestamo, String fechaDevolucion,
            boolean devuelto) {
        this.idPrestamo = idPrestamo;
        this.usuario = usuario;
        this.nombreLibro = nombreLibro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.devuelto = devuelto;
    }

    // getters
    public int getIdPrestamo() {
        return this.idPrestamo;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public Libro getNombreLibro() {
        return this.nombreLibro;
    }

    public String getFechaPrestamo() {
        return this.fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return this.fechaDevolucion;
    }

    public boolean getDevuelto() {
        return this.devuelto;
    }

    // setyers
    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setNombreLibro(Libro nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }

    // Método de clase corregido para calcular multa de forma lógica
    public float calcularMulta() {
        // Supondremos un retraso de 3 días para este ejemplo (en un código real se
        // calcularía con fechas)
        int diasRetraso = 3;
        float costoDiario = 10000;
        float precioMulta = 0;

        if (this.devuelto) {
            System.out.println("El libro ya fue devuelto. Calculando multa...");
            if (diasRetraso > 0) {
                precioMulta = costoDiario * diasRetraso;
                System.out.println("El precio de la multa es:" + precioMulta);
                return precioMulta;
            } else {
                System.out.println("No tienes multas");
                precioMulta = 0;
                return precioMulta;
            }
        } else {
            System.out.println("El préstamo está activo. No se puede calcular la multa final.");
            return precioMulta;
        }
    }

    public void actualizarDisponibilidad() {
        if (this.devuelto) {
            System.out.println("El libro ha sido devuelto.");
        } else {
            System.out.println("El libro no ha sido devuelto. Disponibilidad no actualizada.");
        }
    }
}
