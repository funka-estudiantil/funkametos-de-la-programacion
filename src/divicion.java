import java.util.Scanner;

public class divicion {
    public static void main (String[] args){
        try {


            Scanner funka = new Scanner (System.in);
            int a, b, c;
            System.out.println("dame el valor para a ");
            a = funka.nextInt();
            System.out.println("dame el valor para b");
            b = funka.nextInt();
            c = a / b;
            System.out.println("c =" + c);

        }catch (ArithmeticException ae){
            System.out.println("no se puede divider entre 0");

        }catch (NullPointerException np){
            System.out.println("estas manejando manl un null");
        }
    }
}
