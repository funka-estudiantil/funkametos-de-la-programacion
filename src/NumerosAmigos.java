import java.util.Scanner;

public class NumerosAmigos {
    public static void main(String[] args) {

        Scanner funka = new Scanner(System.in);

        int continuar;

        do {

            int numero1 = 0;
            int numero2 = 0;

            while (numero1 <= 0) {
                System.out.print("Ingrese el primer numero: ");
                numero1 = funka.nextInt();
            }

            while (numero2 <= 0) {
                System.out.print("Ingrese el segundo numero: ");
                numero2 = funka.nextInt();
            }

            int sumaDiv1 = 0;
            int sumaDiv2 = 0;
            int contador1 = 0;
            int contador2 = 0;

            for (int i = 1; i < numero1; i++) {

                if (numero1 % i == 0) {
                    sumaDiv1 = sumaDiv1 + i;
                    contador1++;
                }
            }

            for (int i = 1; i < numero2; i++) {

                if (numero2 % i == 0) {
                    sumaDiv2 = sumaDiv2 + i;
                    contador2++;
                }
            }

            System.out.println("\n1. Mostrar sumas de divisores");
            System.out.println("2. Mostrar si son amigos");
            System.out.print("Seleccione una opcion: ");
            int opcion = funka.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Suma divisores de " + numero1 + ": " + sumaDiv1);
                    System.out.println("Cantidad divisores encontrados: " + contador1);

                    System.out.println("Suma divisores de " + numero2 + ": " + sumaDiv2);
                    System.out.println("Cantidad divisores encontrados: " + contador2);
                    break;

                case 2:

                    if (sumaDiv1 == numero2 && sumaDiv2 == numero1) {
                        System.out.println("Los numeros son amigos.");
                    } else {
                        System.out.println("Los numeros no son amigos.");
                    }

                    break;

                default:
                    System.out.println("Opcion incorrecta.");
            }

            System.out.print("\n¿Desea revisar otros numeros? (1=Si, 0=No): ");
            continuar = funka.nextInt();

        } while (continuar == 1);
    }
}