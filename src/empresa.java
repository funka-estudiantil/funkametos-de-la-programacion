import java.util.Scanner;

public class empresa {
    public static void main (String[] args){
        Scanner funka = new Scanner(System.in);
        String nombre ;
        final int HORAS = 40;
        float horasT ;
        float horaEx;
        float horasx2;
        float salarioF;
        System.out.println("hola :D , bienvenido a el sistema de pago en automatico");
        System.out.println("podrias ingresar tu nombre");
        nombre = funka.nextLine();
        System.out.println("muy bien "+nombre+" podrias ingresar cuantas horas has trabajado ");
        horasT = funka.nextInt();

                if (horasT > HORAS){
                    System.out.println("en hora buena has sido un gran empleado y se reflejara en su sueldo ");
                    horaEx = horasT - HORAS;
                    salarioF = ((horasT-horaEx)*40f)+(horaEx * 80 );
                    System.out.println("tu salario es de "+salarioF +" rupias del bienestar");
                }
                else {
                    System.out.printf("muy bien tu sueldo a sido de ");
                    salarioF = horasT * 40;
                    System.out.printf(""+salarioF);
                }
    }
}
