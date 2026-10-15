import java.util.Scanner;
public class metodoAhorro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el monto a ahorrar: ");
        double monto = sc.nextDouble();
        System.out.print("Ingrese cuanto dinero reunes cada semana:");
        double dineroSemanal = sc.nextDouble();
        int semana = 0;
        while (monto > 0) {
            monto -= dineroSemanal;
            semana++;
        }
        System.out.println("El tiempo que tardara en ahorrar es de: " + semana + " semanas");
        sc.close();
    }
    
}