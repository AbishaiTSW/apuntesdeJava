import java.util.Scanner;
public class conversionUnidades {
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de conversion de unidades");
        System.out.println("1. Kilometros a metros");
        System.out.println("2. Metros a centimetros");
        System.out.println("3. Kilometros a centimetros");
        System.out.println("4. Salir");
        System.out.println("----------------------");
        System.out.print("Ingrese la opción: ");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
            switch (opcion) {
                case 1 : System.out.print("Ingrese los kilometros: ");
                double km = sc.nextDouble();
                double metros = km * 1000;
                System.out.println("Los kilometros a metros son: " + metros);
                break;
                case 2 : System.out.print("Ingrese los metros: ");
                double m = sc.nextDouble();
                double centimetros = m * 100;
                System.out.println("Los metros a centimetros son: " + centimetros);
                break;
                case 3 : System.out.print("Ingrese los kilometros: ");
                double km2 = sc.nextDouble();
                double centimetros2 = km2 * 100000;
                System.out.println("Los kilometros a centimetros son: " + centimetros2);
                break;
                case 4 : System.out.println("---Saliendo del sistema---");
                break;
                default : System.out.println("No existe");
            }
        sc.close();
    }
}