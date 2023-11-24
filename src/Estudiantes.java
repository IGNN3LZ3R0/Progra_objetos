public class Estudiantes {
    //Atributos
    public String nombre;
    public int edad;
    public String facultad;
    public int semestre;

    public Estudiantes(String _nombre, int _edad, String _facultad, int _semestre) {
        this.nombre = _nombre;
        this.edad = _edad;
        this.facultad = _facultad;
        this.semestre = _semestre;
    }

    public void saludar() {
        System.out.println("Hola " + nombre + " que tengas un buen dia!");
        //System.out.println("Edad: " +edad);

    }

    public static void main(String[] args) {
        Estudiantes estudiantes = new Estudiantes("Jose", 25, "ESFOT", 3);
        Estudiantes estudiantes2 = new Estudiantes("Mario", 24, "CCR", 4);
        estudiantes.saludar();
        System.out.print("El nombre es " + estudiantes.nombre + " la edad es " + estudiantes.edad + " su facultad es " + estudiantes.facultad + " su semestre es " + estudiantes.semestre);
        System.out.print("\nEl nombre es " + estudiantes2.nombre + " la edad es " + estudiantes2.edad + " su facultad es " + estudiantes2.facultad + " su semestre es " + estudiantes2.semestre);
    }
}
