import java.util.Scanner;

public class switchJava {

    // Método que evalúa el mes y devuelve la estación
    public static String obtenerEstacion(String mes) {
        String estacion;

        switch (mes.toLowerCase()) {
            // Casos agrupados que comparten el mismo resultado (Fall-through)
            case "diciembre":
            case "enero":
            case "febrero":
                estacion = "Invierno";
                break;

            case "marzo":
            case "abril":
            case "mayo":
                estacion = "Primavera";
                break;

            case "junio":
            case "julio":
            case "agosto":
                estacion = "Verano";
                break;

            case "septiembre":
            case "octubre":
            case "noviembre":
                estacion = "Otoño";
                break;

            default:
                estacion = "Mes no válido";
        }

        return estacion;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre de un mes: ");
        String entradaMes = scanner.nextLine();

        String resultado = obtenerEstacion(entradaMes);
        System.out.println("La estación es: " + resultado);

        scanner.close();
    }
}