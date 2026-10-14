// Actividad #10 · Ejercicio 2 · Operador ternario
// Total de 500 o más → Envío gratis · en caso contrario → Envío con costo
// El resultado se guarda en la variable mensaje usando ÚNICAMENTE el operador ternario.
// Ejemplo: con 650 tiene que escribir  Envío gratis

import java.util.Scanner;

public class Compra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el total de la compra:");
        double total = sc.nextDouble();

        // ===== ESCRIBE AQUÍ LA LÍNEA DEL OPERADOR TERNARIO =====
        // Declara la variable mensaje y guarda en ella el texto que corresponde.
        String mensaje = (total >= 500) ? "gratis" : "con costo";

        // =======================================================

        System.out.println ("El envio es : " + mensaje);

        sc.close();
    }
}