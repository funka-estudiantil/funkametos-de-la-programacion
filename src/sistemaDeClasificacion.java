import java.util.Scanner;

public class sistemaDeClasificacion {
    public static void main(){
        Scanner funka = new Scanner(System.in);
        String nombre;
        double peso;
        final int PESO_MAXIMO = 30;
        final int CARGO_LIGERO = 150;
        final int CARGO_MEDIO = 300;
        final int CARAGO_PESADO = 500;

        //funka estuvo aqui :3
        System.out.println("Bienvenido a un el sistema de clacificacion de de equipaje");
        System.out.println("porfavor ingrese su nombre ");
        nombre =funka.nextLine();
        System.out.println("cuanto pesa su equipaje en kilogramos ");
        peso = funka.nextDouble();
        if (peso <= 15){
            System.out.println(nombre + " su equipaje a sido catalogado corectamente y no tendra cargo adicional");
        }
        if(peso > 15 && peso<=20 ){
                System.out.println(nombre + " su equipaje a sido catalogado corectamente y si total a pagar es de "+CARGO_LIGERO+"$");
        }
        if (peso > 20 && peso <= 30){
            System.out.println(nombre + " su equipaje a sido catalogado corectamente y si total a pagar es de "+CARGO_MEDIO+"$");
        }
        if (peso > PESO_MAXIMO ){
            System.out.println("ADVERTENCIA SU EQUIPAJE EXEDE EL LIMITE DE PESO");
            System.out.println(nombre + " su equipaje a sido catalogado corectamente y si total a pagar es de "+CARAGO_PESADO+"$");
        }
    }
}




