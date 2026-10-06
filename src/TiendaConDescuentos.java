import java.util.Scanner;

public class TiendaConDescuentos {
    public static void main(String[] args){
        Scanner funka = new Scanner(System.in);
        int R ;
        double C,TC ,TD ;
        final double DESCUENTO_FRECUENTE = 0.10;
        final double DESCUENTO_VIP = 0.20;
        final double DESCUENTO_ADICIONAL = 0.05;
        final double LIMITE_COMPRA = 2000;
        String nombre ;

        System.out.println("hola bienvenido a la funkaabarotes , cual es su nombre ?");
        nombre = funka.nextLine();
        System.out.println("muy bien "+ nombre+"y qe tipo de cliente es usted");
        System.out.println("1.-cliente normal");
        System.out.println("2.-cliente frecuente");
        System.out.println("3.-cliente vip");
        R = funka.nextInt();
        System.out.println("y cual es el monto de su compra ?");
        C = funka.nextDouble();
        if (R<4 && R>0) {

            if (R == 1) {
                TC = C;
                System.out.println("su total neto es de  " + C);
                if (C > LIMITE_COMPRA) {
                    TC = TC - (TC * DESCUENTO_ADICIONAL);
                    System.out.println("y por su compra se le aplicara el 5% de descuento adicional");
                }
                System.out.println("su total con descuento es de  " + TC);


            }
            if (R == 2) {
                TC = C - (C * DESCUENTO_FRECUENTE);
                System.out.println("su total neto es de  " + C);
                if (C > LIMITE_COMPRA) {
                    TC = TC - (TC * DESCUENTO_ADICIONAL);
                    System.out.println("y por su compra se le aplicara el 5% de descuento adicional");
                }
                System.out.println("y por se cliente frecuente se le aplicara un decuento de 10%");
                System.out.println("su total con descuento es de  " + TC);

            }
            if (R == 3) {
                TC = C - (C * DESCUENTO_VIP);
                System.out.println("su total neto es de  " + C);
                if (C > LIMITE_COMPRA) {
                    TC = TC - (TC * DESCUENTO_ADICIONAL);
                    System.out.println("y por su compra se le aplicara el 5% de descuento adicional");
                }
                System.out.println("y por se cliente VIP se le aplicara un decuento de 20%");
                System.out.println("su total con descuento es de  " + TC);

            }
        }
        else {
            System.out.println("ese valor no existe ");
        }





    }
}
