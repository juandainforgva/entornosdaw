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
            double base = scanner.nextDouble();
            System.out.println("Ingrese la altura del rectángulo: ");
            double altura = scanner.nextDouble();

            double area = base * altura;
            System.out.println("El área del rectángulo es " + area);
        } else if (opcion == 2) {
            System.out.println("Ingrese el radio del círculo: ");
            double radio = scanner.nextDouble();

            double area = Math.PI * Math.pow(radio,2);
            System.out.println("El área del círculo es: " + area);
        } else {
            System.out.println("Opción inválida!");
            scanner.close();
        }
    }
}
