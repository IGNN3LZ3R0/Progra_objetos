import java.util.Scanner;
public class Deporte {
    private String nombre;
    public Deporte(String nombre){
        this.nombre=nombre;
    }
}
class Edad extends Deporte {
    private int edad;
    public Edad(String nombre, int edad) {
        super(nombre);
        this.edad = edad;
    }
}
class Revisiones extends Deporte{
    private String sanciones;
    private String examen_m;
    public Revisiones(String nombre,String sanciones, String examen_m) {
        super(nombre);
        this.sanciones=sanciones;
        this.examen_m=examen_m;
    }
}
class Prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Introduce el nombre del jugador:");
            String nombre = scanner.nextLine();
            System.out.println("Introduce la edad del jugador:");
            int edad= scanner.nextInt();
            scanner.nextLine();  // consume the leftover newline
            if (validar_edad(edad)) {
                System.out.println("Es mayor de 18 años.");
            } else {
                System.out.println("No es mayor de 18 años.");
            }
            System.out.println("¿Está sancionado? si/no:");
            String sanciones = scanner.nextLine();
            if (sanciones.equalsIgnoreCase("no")) {
                System.out.println("No ha tenido ninguna sancion.");
            } else {
                System.out.println("Ha tenido sanciones previas");
            }
            System.out.println("Se ha relizado el exmamen medico (si/no):");
            String examen_m = scanner.nextLine();
            if (examen_m.equalsIgnoreCase("si")) {
                System.out.println("Se ha realizado el exmamen medico");
            } else {
                System.out.println("No se ha realizado el exmamen medico");
            }
        } catch (Exception e) {
            System.out.println("Error en la entrada de datos: " + e.getMessage());
        }
    }
    public static boolean validar_edad(int edad) {
        return edad >= 18;
    }

}
