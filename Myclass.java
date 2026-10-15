import java.util.Scanner;

public class Myclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el largo: ");
        double largo = sc.nextDouble();
        System.out.print("Ingrese el alto: ");
        double alto = sc.nextDouble();

        double area = largo * alto;
        double litros = area / 10.0;

        System.out.printf("Área: " + area + " m² x Litros: " + litros);

        sc.close();
    }
}