import java.util.Scanner;

public class multipleIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();
        int precio = 0;
        if (edad < 12) {
            precio = 40;
        } else if (edad >= 60) {
            precio = 50;
        } else {
            precio = 80;
        }
        System.out.println("Pago: " + precio);
        sc.close();
    }
}