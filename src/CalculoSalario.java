import java.util.Scanner;

public class CalculoSalario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Constante
        final int HORAS_NORMALES = 40;

        // Variables
        String nombre;
        int horasTrabajadas;
        double pagoPorHora;
        int horasExtra;
        double pagoNormal;
        double pagoExtra;
        double salarioTotal;

        // Entrada de datos
        System.out.print("Nombre: ");
        nombre = sc.nextLine();

        System.out.print("Horas trabajadas: ");
        horasTrabajadas = sc.nextInt();

        System.out.print("Pago por hora: $");
        pagoPorHora = sc.nextDouble();

        // Cálculo
        if (horasTrabajadas <= HORAS_NORMALES) {

            horasExtra = 0;
            pagoNormal = horasTrabajadas * pagoPorHora;
            pagoExtra = 0;
            salarioTotal = pagoNormal;

        } else {

            horasExtra = horasTrabajadas - HORAS_NORMALES;
            pagoNormal = HORAS_NORMALES * pagoPorHora;
            pagoExtra = horasExtra * pagoPorHora * 2;
            salarioTotal = pagoNormal + pagoExtra;
        }

        // Mostrar resultados
        System.out.println();
        System.out.println("=== RESULTADO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Horas normales: " + (horasTrabajadas - horasExtra));
        System.out.println("Horas extra: " + horasExtra);
        System.out.println("Pago normal: $" + pagoNormal);
        System.out.println("Pago por horas extra: $" + pagoExtra);
        System.out.println("Salario total: $" + salarioTotal);

        sc.close();
    }
}
