import java.util.Scanner;
public class mientrasque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, contador = 1;
        int res;

        do {
            System.out.println("Ingrese un número");
            n = scanner.nextInt();

            while (contador <= n) {
                if (contador % 2 == 0) { // ¿n dividido entre dos tiene residuo cero?
                    System.out.println("El número: " + contador + " es par");
                } else {
                    System.out.println("El número: " + contador + " es impar");
                }
                contador++; // contador = contador + 1
            }

            System.out.println("¿Desea ingresar otro número? 1) Si , 2) No");
            res = scanner.nextInt();
        } while(res == 1);

        scanner.close();
    }
}