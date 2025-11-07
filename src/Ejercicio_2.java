// Interfaz volador

interface Volador {
    void volar();
}

// Interfaz nadador
interface Nadador {
    void nadar();
}

// Clase que implementa ambas interfaces

class Animal implements Volador, Nadador{
    @Override

    public void volar() {
        System.out.println("El animal está volando.");
    }
    @Override
    public void nadar() {
        System.out.println("El animal está nadando.");
    }

}

// Clase de prueba
public class Ejercicio_2 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.volar();
        animal.nadar();
    }
}