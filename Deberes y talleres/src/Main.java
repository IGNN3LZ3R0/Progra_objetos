class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }

    public void hacerSonido(int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.println("Guau");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear un perro
        Perro miPerro = new Perro("Buddy");

        // Acceder y modificar el nombre usando encapsulamiento
        System.out.println("Nombre del perro: " + miPerro.getNombre());
        miPerro.setNombre("Max");
        System.out.println("Nuevo nombre del perro: " + miPerro.getNombre());

        // Llamar al método sobreescrito
        miPerro.hacerSonido();

        // Llamar al método sobrecargado
        miPerro.hacerSonido(3);

        // Utilizar un array para almacenar varios animales
        Animal[] animales = new Animal[2];
        animales[0] = new Animal("Gato");
        animales[1] = miPerro;

        // Iterar sobre el array y llamar al método hacerSonido
        for (Animal animal : animales) {
            try {
                animal.hacerSonido();
            } catch (Exception e) {
                System.out.println("Error al hacer sonido para un animal");
            }
        }
    }
}
