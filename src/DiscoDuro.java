import java.util.List;

public class DiscoDuro implements Almacenamiento {

    private String nombre;
    private int capacidad;
    private List<String> contenido;
    private String tipo;
    public static final int VELOCIDAD_GIRO = 7000;

    public DiscoDuro(String nombre, int capacidad, List<String> contenido, String tipo) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.contenido = contenido;
        this.tipo = tipo;
    }

    @Override

    public void girar() {
        System.out.println("Disco duro girando a " + VELOCIDAD_GIRO + "...");
    }
    public void almacenarDatos() {
        System.out.println("Almacenando datos en el DiscoDuro...");
    }
    public void escribirDatos() {
        System.out.println("Escribiendo datos en el DiscoDuro...");
    }
    public void leerDatos() {
        System.out.println("Leyendo datos del DiscoDuro...");
    }
    public void reportarInformacion() {
        System.out.println("Información del Disco Duro: " + "Nombre: " + nombre + ", Capacidad: " + capacidad + ", Contenido: " + contenido+ ", Tipo: " + tipo);
    }
}
