import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        if (numero <= 1) {
            System.out.println("Número no válido");
        } else {
            boolean esPrimo = true;
            int primerDivisor = 0;
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    esPrimo = false; 
                    primerDivisor = i;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println(numero + " es primo");
            } else {
                System.out.println(numero + " no es primo: se divide entre " + primerDivisor);
            }
        }
        
        scanner.close();
    }
}