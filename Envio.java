// Actividad #10 · Ejercicio 1 · if-else anidado
// Costo de envío: hasta 1 kg → $50 · de más de 1 kg a 5 kg → $120 · más de 5 kg → $200
// Ejemplo: con 3 tiene que escribir  Costo de envío: $120

import java.util.Scanner;

public class Envio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el peso del paquete en kg:");
        double peso = sc.nextDouble();

        int costo;
        // ===== ESCRIBE AQUÍ EL if-else ANIDADO =====
        // Según el peso, guarda en costo 50, 120 o 200.
        if (peso <= 1) {
            costo = 50;
        }else if (peso > 1 && peso <= 5) { 
            costo = 120;
        }else{
            costo = 200;
        }
            
        // ===========================================

        System.out.println("Costo de envío: $" + costo);

        sc.close();
    }
}