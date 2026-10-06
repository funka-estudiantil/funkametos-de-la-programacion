import java.util.InputMismatchException;
import java.util.Scanner;

public class calificacion2 {
    public  static void main() {
        Scanner funka = new Scanner(System.in);
        try {


            double C1, C2, C3, promedio ;

            System.out.println("vamos a ver como te fue este semestre >:D");
            System.out.println("cual fue tu primer calificacion ");
            C1 = funka.nextDouble();
            System.out.println("cual fue tu segunda calificacion ");
            C2 = funka.nextDouble();
            System.out.println("cual fue tu tercera calificacion ");
            C3 = funka.nextDouble();
            promedio = ((C1+C2+C3)/3);

            System.out.println("tu promedio es de ........" + promedio+" :/");

        }catch (InputMismatchException a){
            System.out.println("porfavor ingresa un valor valido ");

        }
    }
}
