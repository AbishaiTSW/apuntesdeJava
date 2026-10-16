import java.util.Scanner;

public class calificacionesCalcular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántas calificaciones se van a capturar? ");
        int n = scanner.nextInt();
        
        double suma = 0;
        int validas = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            double calificacion = scanner.nextDouble();
            if (calificacion < 0 || calificacion > 10) {
                continue;
            }
            suma += calificacion;
            validas++;
        }
        if (validas == 0) {
            System.out.println("No hay calificaciones válidas");
        } else {
            double promedio = suma / validas;
            System.out.println("Válidas: " + validas + " · Promedio: " + promedio);
        }
        scanner.close();
    }
}