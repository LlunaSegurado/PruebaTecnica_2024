import java.util.List;

public class Cd implements Almacenamiento{

    private String nombre;
    private int capacidad;
    private List<String> contenido;
    private String tipo;
    public static final int VELOCIDAD_GIRO = 2000;

    public Cd(String nombre, int capacidad, List<String> contenido, String tipo) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.contenido = contenido;
        this.tipo = tipo;
    }

    @Override
    public void girar() {
        System.out.println("CD girando a " + VELOCIDAD_GIRO + "...");
    }
    public void almacenarDatos() {
        System.out.println("Almacenando datos en el CD...");
    }
    public void escribirDatos() {
        System.out.println("Escribiendo datos en el CD...");
    }
    public void leerDatos() {
        System.out.println("Leyendo datos del CD...");
    }
    public void reportarInformacion() {
        System.out.println("Información del CD: " + "Nombre: " + nombre + ", Capacidad: " + capacidad + ", Contenido: " + contenido+ ", Tipo: " + tipo);
    }
}
