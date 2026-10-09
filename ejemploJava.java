import java.util.Scanner; // Importación para leer desde teclado [5]
public class ejemploJava { // El nombre de la clase coincide con el archivo [3, 4]
    public static void main(String[] args) { // Método de inicio obligatorio [3, 4]
        Scanner sc = new Scanner(System.in); // Creación de un objeto Scanner para leer desde teclado [5]
        System.out.println("Ingrese su nombre: "); // Solicita al usuario que ingrese su nombre [5]
        String nombre = sc.nextLine(); // Lee la línea ingresada por el usuario y la almacena en la variable 'nombre' [5]
        System.out.println("Hola, " + nombre + "!"); // Imprime un saludo personalizado usando el nombre ingresado [5]
        sc.close(); // Cierra el objeto Scanner para liberar recursos [5]
    }
}