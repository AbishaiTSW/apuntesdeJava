import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double saldo = 1000.0; // El cajero empieza con un saldo de $1000
        int opcion;
        
        do {
            // Mostrar el menú
            System.out.println("\n--- CAJERO AUTOMÁTICO ---");
            System.out.println("1 · Consultar saldo");
            System.out.println("2 · Depositar");
            System.out.println("3 · Retirar");
            System.out.println("4 · Salir");
            System.out.print("Elija una opción: ");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Saldo: $" + saldo);
                    break;
                    
                case 2:
                    double deposito;
                    // Al depositar, la cantidad tiene que ser mayor que cero: mientras no lo sea, se vuelve a pedir
                    do {
                        System.out.print("Ingrese la cantidad a depositar (> 0): ");
                        deposito = scanner.nextDouble();
                        if (deposito <= 0) {
                            System.out.println("La cantidad debe ser mayor a cero.");
                        }
                    } while (deposito <= 0);
                    
                    saldo += deposito;
                    System.out.println("Saldo: $" + saldo);
                    break;
                    
                case 3:
                    double retiro;
                    // Al retirar, la cantidad tiene que ser mayor que cero: mientras no lo sea, se vuelve a pedir
                    do {
                        System.out.print("Ingrese la cantidad a retirar (> 0): ");
                        retiro = scanner.nextDouble();
                        if (retiro <= 0) {
                            System.out.println("La cantidad debe ser mayor a cero.");
                        }
                    } while (retiro <= 0);
                    
                    // No se puede retirar más de lo que hay: en ese caso se muestra «Saldo insuficiente»
                    if (retiro > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= retiro;
                        System.out.println("Saldo: $" + saldo);
                    }
                    break;
                    
                case 4:
                    System.out.println("Hasta luego");
                    break;
                    
                default:
                    // Una opción que no existe muestra «Opción no válida» y el menú vuelve[cite: 3]
                    System.out.println("Opción no válida");
                    break;
            }
            
        } while (opcion != 4); // El menú se vuelve a mostrar hasta que se elija salir[cite: 3]
        
        scanner.close();
    }
}