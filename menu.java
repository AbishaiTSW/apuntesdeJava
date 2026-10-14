import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Saludar🐙");
            System.out.println("2. Hora del examen😭");
            System.out.println("3. Salir");
            System.out.println("----------------------");
            opcion = sc.nextInt();
            System.out.println("---------El sistema dice-------------");
                switch (opcion) {
                    case 1 : System.out.println("Hola😊");
                    break;
                    case 2 : System.out.println("7:00 ⌚");
                    break;
                    case 3 : System.out.println("Adiós😡");
                    break;
                    default : System.out.println("No existe");
                }
                System.out.println("----------------------");
        }while (opcion != 3);
        sc.close();
    }
}