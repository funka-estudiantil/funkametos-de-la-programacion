import java.util.Scanner;

public class EstadicticaDeUnaSecuenciaNumerica {
    static void main (){
        Scanner funka = new Scanner(System.in);
        int num ,  g =0 , a4=0 , c4=0 ,a3=0,c3=0,nt=0;

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

        for (int i = 0; i < num; i++) {

            g = g+1;
            if (g%4==0){
                c4 = c4 +1;//contador de numeros divisibles entre 4
                a4 = a4 + g;// acumulador de todos los numeros divisibles entre 4
                nt=nt+1;

            }
            if (g%3==0){
                c3=c3+1;//contador de numeros multiplos de 3
                a3= a3 + g;//acumulador de todos los numero multiplops de 3
                nt=nt+1;
            }

            System.out.println("la suma de todos los numeros dibisibles entre 4 es de "+a4);
            System.out.println("y el total de numeros multiplos de 4 es de "+c4);
            System.out.println("la suma de todos los numeros multiplos  entre 3 es de "+a3);
            System.out.println("y el total de numeros multiplos de 4 es de "+c3);
            System.out.println("y el total de numero dibisibles entre los dos es de "+nt);
        }
    }
}
