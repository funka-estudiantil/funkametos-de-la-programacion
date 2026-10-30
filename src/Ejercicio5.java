import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner funka = new Scanner(System.in);
        int op;
        int num;

        do {
            System.out.println();
            System.out.println("--- MENÚ ---");
            System.out.println("1. Cuadrado de un número");
            System.out.println("2. Cubo de un número");
            System.out.println("3. Saber si un número es par o impar");
            System.out.println("4. Sumar del 1 hasta un número");
            System.out.println("5. Salir");
            System.out.print("¿Qué quieres hacer?: ");
            op = funka.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Escribe un número: ");
                    num = funka.nextInt();
                    if (num > 0) {
                        System.out.println(num + " al cuadrado es " + (num * num));
                    } else {
                        System.out.println("Error: tiene que ser un número positivo");
                    }
                    break;
                case 2:
                    System.out.print("Escribe un número: ");
                    num = funka.nextInt();
                    if (num > 0) {
                        System.out.println(num + " al cubo es " + (num * num * num));
                    } else {
                        System.out.println("Error: tiene que ser un número positivo");
                    }
                    break;
                case 3:
                    System.out.print("Escribe un número: ");
                    num = funka.nextInt();
                    if (num > 0) {
                        if (num % 2 == 0) {
                            System.out.println("El " + num + " es par");
                        } else {
                            System.out.println("El " + num + " es impar");
                        }
                    } else {
                        System.out.println("Error: tiene que ser un número positivo");
                    }
                    break;
                case 4:
                    System.out.print("Escribe un número: ");
                    num = funka.nextInt();
                    if (num > 0) {
                        int suma = 0;
                        for (int i = 1; i <= num; i++) {
                            suma += i;
                        }
                        System.out.println("La suma del 1 al " + num + " es " + suma);
                    } else {
                        System.out.println("Error: tiene que ser un número positivo");
                    }
                    break;
                case 5:
                    System.out.println("Gracias por usar el programa, ¡hasta luego!");
                    break;
                default:
                    System.out.println("Esa opción no existe, intenta otra vez");
            }
        } while (op != 5);
    }
}