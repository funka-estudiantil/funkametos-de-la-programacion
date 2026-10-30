import java.util.Scanner;

public class ventasChidas {
    public static void main (){
        Scanner funka=new Scanner(System.in);
        int numP;
        float cal;
        System.out.println("bienvenido al sistema de calificaciones de funkacoffe");
        System.out.println("cuantas personas nos vana a evaluar?");
        numP = funka.nextInt();
        for (int i = 1; i <= numP; i++) {
            System.out.println("hola encuestado numero " + 1 );
            System.out.println("porfavor ingrese la calificacion que cree que nos merecemo" +
                    "s en un  rango del 1-10 :D");
            cal = funka.nextFloat();

            if(cal >1 || cal<10){
                do {
                    System.out.println("porfavor ingrese una calificacion valida");
                    cal = funka.nextFloat();
                }while (cal< 1 || cal >10);
            }else {

            }







        }

    }
}
