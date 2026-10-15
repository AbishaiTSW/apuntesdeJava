import java.util.Scanner;
public class adivinaNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numSecreto = 27;
        int num;
        int intentos = 0;
        System.out.println("¡Adivina el número secreto!");
        do {
            System.out.print("Ingrese un número: ");
            num = sc.nextInt();
            intentos++;
            if (num < numSecreto) {
                System.out.println("El número es mayor");
                System.out.println("-----------------------");
            } else if (num > numSecreto) {
                System.out.println("El número es menor");
                System.out.println("-----------------------");
            } else {
                System.out.println("Felicidades, adivinaste el número en " + intentos + " intentos");
                System.out.println("-----------------------");
            }
        } while (num != numSecreto);
        sc.close();
    }
}