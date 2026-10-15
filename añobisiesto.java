import java.util.Scanner;
public class añobisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el año: ");
        int año = sc.nextInt();

        System.out.println((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0) ? "Es bisiesto" : "No es bisiesto");
        sc.close();
    }
}
