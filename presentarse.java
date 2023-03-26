public class Persona{
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void presentarse() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }
}

public class Programa{
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 30);
        Persona persona2 = new Persona("María", 25);

        persona1.presentarse();
        persona2.presentarse();

        persona1.setEdad(31);
        persona2.setNombre("Ana");

        persona1.presentarse();
        persona2.presentarse();
    }
}
