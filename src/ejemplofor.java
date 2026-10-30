import java.util.Scanner;

public class ejemplofor {
    public static void main(){
        Scanner funka = new Scanner(System.in);
        int interaciones;
        System.out.println("ingrese el numero de interaciones");
        interaciones = funka.nextInt();
        for(int i = 1 ; i<=interaciones;i++){
            System.out.println(i);

        }
        System.out.println("continuacion del programa " );
    }
}
