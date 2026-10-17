import java.util.Scanner;

public class gasolineria {
    public static void main (){
        Scanner funka = new Scanner(System.in);
        double litros, precio , pago , pagof=0;
        String respuesta ;
        double AC = 0, NC = 0 ,AP =0 , NP=0 ,AD = 0 , IP ;


        do {
            System.out.println("hola bienvendido al auto cobro de funkagas  ");
            System.out.println("profavor ingrese el total de litro que ha caragado ");
            do {
                litros = funka.nextDouble();
            }while (litros < 0);




            System.out.println("porfavor ingrese el precio por litro ");
            precio = funka.nextDouble();

            pago = litros * precio;
            AC = AC+litros;
            AP = AP + pago;
            NP = NP + 1;
            NC = NC + 1;
            System.out.println("tu total a pagar es de " + pago);

            if (litros >= 40){

              /*  pago = (litros*0.5);*/
                pagof = pago*0.5;
                AD = AD+1;
                System.out.println("pero como has cargado 40 o mas litros tu nuevo total a pagar es de "+pagof);
            }

            funka.nextLine();// para poder hacer la compar'tacion de texto :D
            System.out.println("desea ingresar otra craga (si/no) ");
            respuesta = funka.nextLine();


                System.out.println("tu total a pagar es de "+pagof);


        }while (respuesta.equals("si"));
        IP = AP/NP;

        System.out.println("ya salio del programa");
        System.out.println("el total de litros vendidos es de "+AC);
        System.out.println("el importe promedio es de "+IP );
        System.out.println("el total de cargas fue de "+NP);
        System.out.println("y se le aplicaron descuento a " +AD);



    }

}
