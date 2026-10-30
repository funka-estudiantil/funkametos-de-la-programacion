/*import javax.print.DocFlavor;
import java.util.Scanner;

public class CodigoCalverita {
    static void main (){
        Scanner funka = new Scanner(System.in);
        int num , ai=0, ap=0 , g=0 , ci=0 , cp=0;
        final String SI="s" , NO="n" ;
        char r;

        do{
            ai=0;
            ap=0 ;
            g=0 ;
            ci=0;
            cp=0;

            System.out.println("**********************************************************");
            System.out.println("HOla podrias ingresesar un numero entero mayor que 0 ");
            num = funka.nextInt();
            System.out.println("**********************************************************");

            if(num <= 0 ){
                do {
                    System.out.println("valor no mayor que 0 , intente de nuevo ");
                    num = funka.nextInt();
                }while (num <= 0);
            }else {
                num = num ;
            }
            //System.out.println("ya salio del buclque "+num);
            for (int i = 0; i < num; i++) {

                g = g +1  ;
                if (g%2 == 0){
                    //System.out.println("es par ");
                    ap = ap +g;
                    cp = cp + 1;

                    //System.out.println("par"+ap);

                }
                else {
                   // System.out.println("es impar ");
                    ai =ai + g;
                    ci = ci + 1;
                    //System.out.println("impar"+ai);
                }
            }
            System.out.println("la suma de todos los numeros pares es de " + ap);
            System.out.println("y el total de todos lo numero pares es de "+ cp);
            System.out.println("**********************************************************");

            System.out.println("la suma de todos los numeros impares de "+ai);
            System.out.println("y el total de todos los numeros impares es de " + ci);
            System.out.println("**********************************************************");
            System.out.println("deseas hacer otra suma ?");
            funka.nextLine();
            System.out.println( "(s/n)");
            r = funka.nextLine();
        } while ( r =="s" );
        funka.close();
    }
}
*/