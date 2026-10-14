public class diasSemana {
    public static void main(String[] args) {
        System.out.print("Ingresa tu día de la semana (1-7): ");
        int dia = Integer.parseInt(System.console().readLine());

        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Es día laboral");
                break;

            case 6: // Sábado
            case 7: // Domingo
                System.out.println("¡Es fin de semana!");
                break;

            default:
                System.out.println("Día no válido");
                break;
        }
    }
}
