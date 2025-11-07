 abstract class Figura{
    // Método abstracto para calcular el área
    public abstract double C_area();

}
    // Clase derivada para el rectángulo
    class Rectangulo extends Figura{
        private double base;
        private double altura;

        public Rectangulo(double base, double altura){
            this.base = base;
            this.altura = altura;
        }

        @Override
        public double C_area(){
            return base * altura;
        }
    }

    // Clase derivada: Triángulo
    class Triangulo extends Figura{
        private double base;
        private double altura;

        public Triangulo(double base, double altura){
            this.base = base;
            this.altura = altura;
        }

        @Override
        public double C_area(){
            return (base * altura) / 2;
        }
    }

    // Clase de prueba




    public class Ejercicio_1 {
        public static void main(String[] args) {
            
            Figura rect = new Rectangulo(5, 10);
            Figura tri = new Triangulo(5, 10);
           
            
            System.out.println("Area del rectangulo: " + rect.C_area());
            System.out.println("Area del triangulo: " + tri.C_area());
        }
    }