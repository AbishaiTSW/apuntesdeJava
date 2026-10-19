import java.util.Scanner;

public class variablesJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad = 0;
        double altura = 0.0;
        
        String nombre = "";
        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();
        System.out.print("Ingrese su altura en metros: ");
        altura = sc.nextDouble();
        System.out.println("Hola, " + nombre + "!");
        System.out.println("Tienes " + edad + " años y mides " + altura + " metros.");
        sc.close();
    }
}