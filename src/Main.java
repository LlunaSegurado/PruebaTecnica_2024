import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cd cd = new Cd("CD 1", 500, List.of("Dato 1", "Dato 2", "Dato 3"), "CD");
        cd.girar();
        cd.almacenarDatos();
        cd.escribirDatos();
        cd.leerDatos();
        cd.reportarInformacion();

        DiscoDuro discoDuro = new DiscoDuro( "DiscoDuro 1", 1000, List.of("Dsto 1", "Dato 2", "Dato 3"), "DiscoDuro");
        discoDuro.girar();
        discoDuro.almacenarDatos();
        discoDuro.escribirDatos();
        discoDuro.leerDatos();
        discoDuro.reportarInformacion();
    }
}