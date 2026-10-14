// Actividad #10 · Ejercicio 3 · switch-case
// El menú principal de un sistema. Cada caso lleva su break, y hay un default.
// Cada opción escribe su texto seguido de punto y espacio, con print (no println):
//    1 → "Registrar venta. "   ·   2 → "Ver ticket. "   ·   3 → "Salir. "
//    cualquier otro número → "Opción no válida. "
// Ejemplo: con 2 tiene que escribir  Ver ticket. Gracias por utilizar el sistema.

import java.util.Scanner;

public class Venta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Registrar venta");
        System.out.println("2. Ver ticket");
        System.out.println("3. Salir");
        System.out.println("Elige una opción:");
        int opcion = sc.nextInt();

        // ===== ESCRIBE AQUÍ EL switch-case =====
        // Un case por opción, con su break, y un default.
    switch(opcion) {
        case 1 : System.out.println("Has seleccionado : Registrar venta");
        break;
        case 2 : System.out.println("Has seleccionado : Ver ticket");
        break;
        case 3 : System.out.println("Has seleccionado : Salir");
        break;
        default : System.out.println("Reintroduce un numero valido");
        break;
    }
        // =======================================

        System.out.println("Gracias por utilizar el sistema.");

        sc.close();
    }
}