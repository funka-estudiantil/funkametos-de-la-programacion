import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner funka = new Scanner(System.in);
        String otra;

        do {
            System.out.print("Dame el primer número: ");
            int num1 = funka.nextInt();
            while (num1 <= 0) {
                System.out.print("Tiene que ser positivo, escríbelo otra vez: ");
                num1 = funka.nextInt();
            }

            System.out.print("Dame el segundo número: ");
            int num2 = funka.nextInt();
            while (num2 <= 0) {
                System.out.print("Tiene que ser positivo, escríbelo otra vez: ");
                num2 = funka.nextInt();
            }

            // divisores del primer número
            int suma1 = 0;
            int cantidad1 = 0;
            for (int i = 1; i < num1; i++) {
                if (num1 % i == 0) {
                    suma1 += i;
                    cantidad1++;
                }
            }

            // divisores del segundo número
            int suma2 = 0;
            int cantidad2 = 0;
            for (int i = 1; i < num2; i++) {
                if (num2 % i == 0) {
                    suma2 += i;
                    cantidad2++;
                }
            }

            boolean sonAmigos = false;
            if (suma1 == num2 && suma2 == num1 && num1 != num2) {
                sonAmigos = true;
            }

            System.out.println();
            System.out.println("¿Qué quieres ver?");
            System.out.println("1. La suma de los divisores de cada número y el resultado");
            System.out.println("2. Solo el resultado (si son amigos o no)");
            System.out.print("Opción: ");
            int opcion = funka.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El " + num1 + " tiene " + cantidad1 + " divisores y suman " + suma1);
                    System.out.println("El " + num2 + " tiene " + cantidad2 + " divisores y suman " + suma2);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Esa opción no existe");
            }

            if (opcion == 1 || opcion == 2) {
                if (sonAmigos) {
                    System.out.println("Sí son números amigos");
                } else {
                    System.out.println("No son números amigos");
                }
            }

            System.out.print("¿Quieres probar con otra pareja? (s/n): ");
            otra = funka.next();
        } while (otra.equals("s"));

        System.out.println("Fin del programa");
    }
}