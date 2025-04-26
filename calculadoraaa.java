import java.util.Scanner;

public class Calculadora {

    public static void mostrarMenu() {
        System.out.println("\n--- Calculadora ---");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Potencia");
        System.out.println("6. Salir");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        // Instancias de las operaciones
        Operacion suma = new Suma();
        Operacion resta = new Resta();
        Operacion multiplicacion = new Multiplicacion();
        Operacion division = new Division();
        Operacion potencia = new Potencia();

        while (opcion != 6) {
            mostrarMenu();
            System.out.print("Selecciona una opción (1-6): ");
            opcion = scanner.nextInt();

            if (opcion == 6) {
                System.out.println("¡Hasta luego!");
                break;
            }

            // Solicitar números
            System.out.print("Ingresa el primer número: ");
            double a = scanner.nextDouble();

            System.out.print("Ingresa el segundo número: ");
            double b = scanner.nextDouble();

            // Seleccionar la operación
            double resultado = 0;
            switch (opcion) {
                case 1:
                    resultado = suma.realizarOperacion(a, b);
                    break;
                case 2:
                    resultado = resta.realizarOperacion(a, b);
                    break;
                case 3:
                    resultado = multiplicacion.realizarOperacion(a, b);
                    break;
                case 4:
                    resultado = division.realizarOperacion(a, b);
                    break;
                case 5:
                    resultado = potencia.realizarOperacion(a, b);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    continue;
            }

            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}
