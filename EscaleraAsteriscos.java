import java.util.Scanner;

public class EscaleraAsteriscos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();
        
        if (numero <= 0) {
            System.out.println("Número no válido");
        } else {
            for (int i = 1; i <= numero; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        
        scanner.close();
    }
}