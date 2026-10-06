import java.util.Scanner;

public class estacionamiento {
    public static void main(String[] args){
        Scanner funka =new Scanner(System.in);
        double horas;
        double horasT;
        final double PRIMERA_HORA_DESCEUTNO =0.10;
        final double SEGUNDA_HORA_DESCEUTNO =0.20;
        final int TRAIFAM = 10;
        final int TRAIFAA = 20;
        final int TRAIFAC = 30;
        int R;

        System.out.println("bienvenido al estacionamiento automatico ");
        System.out.println("cuento tiempo estuvo alojado en nuestro estacionamiento?");
        horas = funka.nextDouble();
                if(horas<=0){
                    System.out.println("las horas no pueden ser nagativas");
                }
                else {

                    System.out.println("las tarifas son las siguientes ");
                    System.out.println("1.-motocicleta 10$");
                    System.out.println("2.-automovil 20$");
                    System.out.println("3.-camioneta 30$");
                    R = funka.nextInt();

                    if (R < 4 && R > 0) {
                        if (R == 1) {

                            horasT = (horas * TRAIFAM);
                            System.out.println("usted a escogida la taria de moto ");
                            System.out.println("sus hora total de su estadia es de "+ horas);
                            System.out.println("su total a pagar es de "+horasT);
                            if (horas >5 && horas<10){
                                horasT = horasT - (horasT * PRIMERA_HORA_DESCEUTNO);
                                System.out.println("por estar mas de 5 horas se le aplicara un descuento de el 10%");
                            }
                            if (horas >= 10){
                                horasT = horasT - (horasT * SEGUNDA_HORA_DESCEUTNO);
                                System.out.println("por estar mas de 10 horas se le aplicara un descuento de el 20%");
                            }


                        }
                        if (R == 2) {
                            horasT = (horas * TRAIFAA);
                            System.out.println("usted a escogida la taria de automovil ");
                            System.out.println("sus hora total de su estadia es de "+ horas);
                            System.out.println("su total a pagar es de "+horasT);
                            if (horas >5 && horas<10){
                                horasT = horasT - (horasT * PRIMERA_HORA_DESCEUTNO);
                                System.out.println("por estar mas de 5 horas se le aplicara un descuento de el 10%");
                                System.out.println("y su nuevo total a pagar es de "+horasT);
                            }
                            if (horas >= 10){
                                horasT = horasT - (horasT * SEGUNDA_HORA_DESCEUTNO);
                                System.out.println("por estar mas de 10 horas se le aplicara un descuento de el 20%");
                                System.out.println("y su nuevo total a pagar es de "+horasT);
                            }

                        }
                        if (R == 3) {
                            horasT = (horas * TRAIFAC);
                            System.out.println("usted a escogida la taria de camioneta ");
                            System.out.println("sus hora total de su estadia es de "+ horas);
                            System.out.println("su total a pagar es de "+horasT);
                            if (horas >5 && horas<10){
                                horasT = horasT - (horasT * PRIMERA_HORA_DESCEUTNO);
                                System.out.println("por estar mas de 5 horas se le aplicara un descuento de el 10%");
                                System.out.println("y su nuevo total a pagar es de "+horasT);
                            }
                            if (horas >= 10){
                                horasT = horasT - (horasT * SEGUNDA_HORA_DESCEUTNO);
                                System.out.println("por estar mas de 10 horas se le aplicara un descuento de el 20%");
                                System.out.println("y su nuevo total a pagar es de "+horasT);
                            }

                        }

                    } else {
                        System.out.println("ese valor no existe ");
                    }
                }
    }
}
