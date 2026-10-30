import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner funka = new Scanner(System.in);
        final double INTERES = 0.01;
        String repetir;

        do {
            System.out.print("Cantidad inicial: ");
            double inicial = funka.nextDouble();
            while (inicial <= 0) {
                System.out.print("Debe ser positiva. Cantidad inicial: ");
                inicial = funka.nextDouble();
            }

            System.out.print("Meta de ahorro: ");
            double meta = funka.nextDouble();
            while (meta <= 0) {
                System.out.print("Debe ser positiva. Meta de ahorro: ");
                meta = funka.nextDouble();
            }

            System.out.print("Ahorro mensual: ");
            double mensual = funka.nextDouble();
            while (mensual <= 0) {
                System.out.print("Debe ser positivo. Ahorro mensual: ");
                mensual = funka.nextDouble();
            }

            System.out.println("Elige el plazo:");
            System.out.println("1. 6 meses");
            System.out.println("2. 12 meses");
            System.out.println("3. 24 meses");
            System.out.print("Opción: ");
            int opcion = funka.nextInt();

            int plazo;
            switch (opcion) {
                case 1:
                    plazo = 6;
                    break;
                case 2:
                    plazo = 12;
                    break;
                case 3:
                    plazo = 24;
                    break;
                default:
                    System.out.println("Opción no válida, se usarán 6 meses");
                    plazo = 6;
            }

            double saldo = inicial;
            double intereses = 0;
            int mesesMeta = 0;

            for (int mes = 1; mes <= plazo; mes++) {
                saldo = saldo + mensual;
                double interesMes = saldo * INTERES;
                saldo = saldo + interesMes;
                intereses = intereses + interesMes;

                System.out.printf("Mes %d: saldo $%.2f%n", mes, saldo);

                if (saldo >= meta && mesesMeta == 0) {
                    mesesMeta = mes;
                }
            }

            System.out.printf("Saldo final: $%.2f%n", saldo);
            System.out.printf("Intereses generados: $%.2f%n", intereses);

            if (mesesMeta > 0) {
                System.out.println("Meta alcanzada en " + mesesMeta + " meses");
            } else {
                System.out.println("No se alcanzó la meta");
            }

            System.out.print("¿Quieres hacer otra simulación? (s/n): ");
            repetir = funka.next();
        } while (repetir.equals("s"));

        System.out.println("Fin del programa");
    }
}