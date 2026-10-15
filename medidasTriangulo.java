import java.util.Scanner;

public class medidasTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Leer los tres lados del triángulo
        System.out.print("Ingrese el primer lado del triángulo: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese el segundo lado del triángulo: ");
        double b = sc.nextDouble();
        System.out.print("Ingrese el tercer lado del triángulo: ");
        double c = sc.nextDouble();

        // 2. Verificar si los lados cumplen la regla de existencia
        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            
          
            if (a == b && b == c) {
                System.out.println("El triangulo es equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("El triangulo es isósceles");
            } else {
                System.out.println("El triangulo es escaleno");
            }

        } else {
            // Si no cumple la regla de existencia, mostrar un mensaje de error
            System.out.println("Esas medidas no forman un triángulo");
        }

        sc.close();
    }
}