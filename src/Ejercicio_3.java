// Interfaz con un metodo abstracto
interface Persona {
    void trabajar();
}

// Clase inconcreta que implementa la interfaz Persona
/*class Empleado implements Persona{
    //Faltante implementar el método trabajar
    //Esto generará un error de compilación
}*/
//Solucion correcta

class Empleado implements Persona{
    @Override
    public void trabajar() {
        System.out.println("El empleado está trabajando.");
    }
}

// clase abstracta
abstract class SerVivo {
    // Método abstracto: debe ser implementado por las subclases
    public abstract void respirar();
}

//clase incorrecta: no implementa el método abstracto respirar
/*class Humano extends SerVivo {
    //Faltante implementar el método respirar
    //Esto generará un error de compilación
}*/

//Solucion correcta
class Humano extends SerVivo {
    @Override
    public void respirar() {
        System.out.println("El humano está respirando.");
    }
}
public class Ejercicio_3 {
    public static void main(String[] args) {
        // Para evitar errores de compilación, usamos las versiones corregidas de las clases
        Empleado emp = new Empleado();
        emp.trabajar();

        Humano hum = new Humano();
        hum.respirar();
    }
}