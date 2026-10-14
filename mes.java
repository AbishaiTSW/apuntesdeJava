// Actividad #10 · Ejercicio 4 · Control de flujo (break)
// La temporada del año según el mes. Varios case comparten un bloque, y cada grupo cierra con break.
//    12, 1 y 2 → Invierno  ·  3, 4 y 5 → Primavera  ·  6, 7 y 8 → Verano  ·  9, 10 y 11 → Otoño
//    otro número → Mes no válido
// Ejemplo: con 4 tiene que escribir  Primavera

import java.util.Scanner;

public class mes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el número del mes (1 a 12):");
        int numeroMes = sc.nextInt();
        String estacion = "";
        
        switch (numeroMes) {// ===== ESCRIBE AQUÍ EL switch CON CASOS AGRUPADOS =====
        case 1 : case 2 : case 12 : estacion = "Invierno" ;
            break;
        case 3 : case 4 : case 5 : estacion = "primavera" ;
            break;
        case 6 : case 7 : case 8 : estacion = "verano" ;
            break;
        case 9 : case 10 : case 11: estacion = "otoño" ;
            break;
        default:
            System.out.println("Mes no valido");
        }
        System.out.println("La estacion es :" + estacion);
            // Los case de cada temporada van seguidos, y un break cierra cada grupo.
        // No olvides el default.
        // ======================================================

        sc.close();
    }
}
