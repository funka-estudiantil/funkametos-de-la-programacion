import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner funka = new Scanner(System.in);
        String otra;

        do {
            System.out.print("¿Cuántos participantes hay?: ");
            int cuantos = funka.nextInt();
            while (cuantos <= 0) {
                System.out.print("Tiene que haber al menos uno, escribe otra vez: ");
                cuantos = funka.nextInt();
            }

            double kmTotales = 0;
            int bajas = 0;
            int medias = 0;
            int altas = 0;
            double mayor = 0;
            int ganador = 0;

            for (int persona = 1; persona <= cuantos; persona++) {
                System.out.println();
                System.out.println("Participante " + persona);
                double kmPersona = 0;

                for (int ronda = 1; ronda <= 5; ronda++) {
                    System.out.print("Km recorridos en la ronda " + ronda + ": ");
                    double km = funka.nextDouble();
                    while (km < 0) {
                        System.out.print("No puede ser negativo, escribe otra vez: ");
                        km = funka.nextDouble();
                    }

                    kmPersona += km;

                    if (km < 2) {
                        bajas++;
                        System.out.println("Rendimiento bajo");
                    } else if (km <= 4) {
                        medias++;
                        System.out.println("Rendimiento medio");
                    } else {
                        altas++;
                        System.out.println("Rendimiento alto");
                    }
                }

                System.out.println("El participante " + persona + " recorrió " + kmPersona + " km en total");
                System.out.println("Promedio por ronda: " + (kmPersona / 5) + " km");

                kmTotales += kmPersona;

                if (kmPersona > mayor) {
                    mayor = kmPersona;
                    ganador = persona;
                }
            }

            System.out.println();
            System.out.println("¿Qué quieres ver?");
            System.out.println("1. Distancia total de todos");
            System.out.println("2. Promedio por participante");
            System.out.println("3. Cuántas rondas fueron bajas, medias y altas");
            System.out.println("4. Quién recorrió más");
            System.out.print("Opción: ");
            int op = funka.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Entre todos recorrieron " + kmTotales + " km");
                    break;
                case 2:
                    System.out.println("Cada participante recorrió en promedio " + (kmTotales / cuantos) + " km");
                    break;
                case 3:
                    System.out.println("Rondas bajas: " + bajas);
                    System.out.println("Rondas medias: " + medias);
                    System.out.println("Rondas altas: " + altas);
                    break;
                case 4:
                    System.out.println("El que más recorrió fue el participante " + ganador + " con " + mayor + " km");
                    break;
                default:
                    System.out.println("Esa opción no existe");
            }

            System.out.print("¿Quieres registrar otra competencia? (s/n): ");
            otra = funka.next();
        } while (otra.equals("s"));

        System.out.println("Fin del programa");
    }
}