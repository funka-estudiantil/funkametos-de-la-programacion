import java.util.Scanner;

public class carros2 {
    public static void main(String[] args) {
        Scanner funka = new Scanner(System.in);
        int op;
        int s = 0;
        int R;
        int hc, pago;
        int cm = 0, ca = 0, cc = 0, t;
        int ganancias = 0;

        do {
            System.out.println("Estacionamiento");
            System.out.println("Ingrese el numero de la opcion que quiera realizar");
            System.out.println("1.- Registrar un vehiculo");
            System.out.println("2.- Consultar resumen");
            System.out.println("3.- Salir");
            op = funka.nextInt();
            switch (op) {
                case 1:
                    do {
                        System.out.println("Que vehiculo desea registrar");
                        System.out.println("1.- Camioneta -> 30$");
                        System.out.println("2.- Automovil -> 20$");
                        System.out.println("3.- Motocicleta -> 10$");
                        R = funka.nextInt();
                        switch (R) {
                            case 1:
                                System.out.println("Usted ha registrado una camioneta");
                                System.out.println("Ingrese las horas de su estadia");
                                hc = funka.nextInt();
                                pago = hc * 30;
                                System.out.println("Su pago total es de " + pago);
                                System.out.println("");
                                cc = cc + 1;
                                ganancias = ganancias + pago;
                                break;
                            case 2:
                                System.out.println("Usted ha registrado un automovil");
                                System.out.println("Ingrese las horas de su estadia");
                                hc = funka.nextInt();
                                pago = hc * 20;
                                System.out.println("Su pago total es de " + pago);
                                System.out.println("");
                                ca = ca + 1;
                                ganancias = ganancias + pago;
                                break;
                            case 3:
                                System.out.println("Usted ha registrado una motocicleta");
                                System.out.println("Ingrese las horas de su estadia");
                                hc = funka.nextInt();
                                pago = hc * 10;
                                System.out.println("Su pago total es de " + pago);
                                System.out.println("");
                                cm = cm + 1;
                                ganancias = ganancias + pago;
                                break;
                            default:
                                System.out.println("Esa no es una opcion, vuelve a escoger una opcion");
                        }
                    } while (R < 1 || R > 3);

                    System.out.println("Si desea salir del auto cobro presione 1");
                    System.out.println("De otro modo presione otro numero para regresar al menu");
                    s = funka.nextInt();
                    break;

                case 2:
                    System.out.println("========== El resumen del dia ===========");
                    t = cm + ca + cc;
                    System.out.println("El total de vehiculos es " + t);
                    System.out.println("Camionetas: " + cc);
                    System.out.println("Automoviles: " + ca);
                    System.out.println("Motocicletas: " + cm);
                    System.out.println("Y el total del beneficio es de " + ganancias);
                    System.out.println("Si desea salir del auto cobro presione 1");
                    System.out.println("De otro modo presione otro numero para regresar al menu");
                    s = funka.nextInt();
                    break;

                case 3:
                    System.out.println("Usted ha querido salir del auto cobro");
                    System.out.println("Que tenga un buen dia");
                    s = 1;
                    break;

                default:
                    System.out.println("Eso no es una opcion valida, porfavor intentalo de nuevo");
                    s = 0;
            }
        } while (s != 1);
    }
}