import java.util.Scanner;

public class AreaFigura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al calculador de áreas");

        System.out.println("1. Calcular área de un rectángulo");
        System.out.println("2. Calcular área de un círculo");
        System.out.println("Ingrese su opción:");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.println("Ingrese la base del rectángulo: ");
            double base = scanner.nextDouble(); // Error: Método incorrecto para leer decimales
            System.out.println("Ingrese la altura del rectángulo: ");
            double altura = scanner.nextDouble();

            double area = base * altura;
            System.out.printf("El área del rectángulo es: %.2f",area); // Error: Error al formatear salida
        } else if (opcion == 2) { // Error: Asignación en lugar de comparación
            System.out.println("Ingrese el radio del círculo: ");
            double radio = scanner.nextDouble(); // Error: Método incorrecto para leer decimales

            double area = 3.1416 * radio*radio;
            System.out.printf("El área del círculo es: %.2f",area);
        } else {
            System.out.println("Opción inválida!"); // Error: No se cierra el scanner
        }
        scanner.close();
    }
}
