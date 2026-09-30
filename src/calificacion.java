import java.util.Scanner;

public class calificacion {
    public static void main (String[] args) {
        Scanner funka = new Scanner(System.in);
        String nombre ;
        int calificacion = 0;
        final int CAL_APROBATORIA = 70 ;

        System.out.println("porfavor escribe tu nombe :D");
        nombre = funka.nextLine();
        System.out.println("porfavor escribe tu calificacion final  :D");
        calificacion = funka.nextInt();


        if (calificacion <=100 && calificacion >=90){
            System.out.println(nombre+" execelente:D");
        }
        else if (calificacion <=89 && calificacion >=80) {
            System.out.println(nombre+" muy bien ");
        }
        else if (calificacion <=79 && calificacion >=70) {
            System.out.println(nombre+"  bien ");
        }
        else if (calificacion <=69 && calificacion >=60) {
            System.out.println(nombre+" sacaste lo suficiente ");
        }
        else if (calificacion <=59 && calificacion >=0) {
            System.out.println(nombre+" reprobaste  ");
        }



    }
}
