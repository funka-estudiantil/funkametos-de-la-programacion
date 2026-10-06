import java.util.Scanner;

public class retiro {
    public static void main(String[] args){
        Scanner funka = new Scanner(System.in);
                final double LIMITE_DE_RETIRO = 5000;
                double saldo, retiro;
                System.out.println("porfavor ingrese su saldo actual ");
                saldo = funka.nextDouble();

                System.out.println("su saldo es de "+saldo);
                System.out.println("cuanto desea retirar");
                retiro = funka.nextDouble();
                if (retiro <= saldo && retiro<= LIMITE_DE_RETIRO && retiro > 0){
                    saldo = (saldo - retiro);
                            if (saldo < 500){
                                System.out.println("advertencia su saldo es menor a 500");
                            }
                            System.out.println("el retiro se realizado con existo ");
                            System.out.println("usted a retirado "+retiro+"rupias del bienestar ");
                            System.out.println("su nuevo saldo es de " +saldo);

                }
                else{
                    if (retiro > saldo){
                        System.out.println("saldo incuficiente");
                    }
                    if (retiro > LIMITE_DE_RETIRO){
                        System.out.println("no se puede retirar esa cantidad porque exede el numero del retiro ");
                    }
                    if(retiro <= 0){
                        System.out.println("la cantidad a retirar no exsiste");
                    }

                }

    }
}
