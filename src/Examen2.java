import java.lang.constant.Constable;
import java.util.Scanner;

public class Examen2 {
    public static void main(String[] args){
        Scanner funka = new Scanner(System.in);
        final int AGUA = 15 ,JUGO = 22,  GALLETAS = 18 ,  SANDWICH = 45;
        int C , RF=0, p;
        int CU=0 , CD=0; //contadores
        int CEP=0 , CEC=0;
        System.out.println("bienevendido a la maquina expendedra");
        do {
            System.out.println("porfavor selecione algun producto de nuestra maquina expendedora");
            System.out.println("1 = Agua"+AGUA+"$");
            System.out.println("2 = jugo"+JUGO+"$");
            System.out.println("3 = galletas"+GALLETAS+"$");
            System.out.println("4 = sandwich"+SANDWICH+"$");
            System.out.println("*****************************************************************");
            System.out.println("5 = SALIR");
            C = funka.nextInt();
            if ( C > 6 || C <= 0){
                do {
                    System.out.println("opcion no valida porfavor ingrese una opcion que este dentro del menu");
                    C = funka.nextInt();
                    CEP= CEP+1;
                }while(C >6 || C<0);
            }else {
                C=C;
            }
            switch (C){
                case 1:{
                    System.out.println("usted a selecionado que quiere un agua");
                    System.out.println("porfavor ingrese la catiad de productos que quiere");
                    p = funka.nextInt();
                    do {
                        if(p<=0){
                            System.out.println("la cantidad ingresada no es valida porfavor vuelva a intentarlo");
                            p = funka.nextInt();
                            CEC = CEC+1;
                        }
                    }while (p<0);
                    p = p * AGUA;

                    CU = CU+1;
                    CD= CD+p;

                    if (p < 50 ){
                        System.out.println("usted a tenido una compra pequeña");
                    }
                    if (p >50 & p <100 ){
                        System.out.println("usted a teninido una compra mediana ");
                    }
                    if (p>=100){
                        System.out.println("usted a teninido una compra grande");
                    }

                    System.out.println("su total a pagar es de "+ p);

                    p=0;

                    System.out.println("desea hacer otra compra ?");
                    System.out.println("0).- si");
                    System.out.println("1).- no");
                    RF= funka.nextInt();

                    break;

                }
                case 2:{
                    System.out.println("usted a selecionado que quiere un jugo");
                    System.out.println("porfavor ingrese la catiad de productos que quiere");
                    p = funka.nextInt();
                    do {
                        if(p<=0){
                            System.out.println("la cantidad ingresada no es valida porfavor vuelva a intentarlo");
                            p = funka.nextInt();
                            CEC = CEC+1;
                        }
                    }while (p<0);
                    p = p * JUGO;

                    CU = CU+1;
                    CD= CD+p;

                    if (p < 50 ){
                        System.out.println("usted a tenido una compra pequeña");
                    }
                    if (p >50 & p <100 ){
                        System.out.println("usted a teninido una compra mediana ");
                    }
                    if (p>=100){
                        System.out.println("usted a teninido una compra grande");
                    }

                    System.out.println("su total a pagar es de "+ p);

                    p=0;

                    System.out.println("desea hacer otra compra ?");
                    System.out.println("0).- si");
                    System.out.println("1).- no");
                    RF= funka.nextInt();

                    break;
                }
                case 3:{
                    System.out.println("usted a selecionado que quiere un galletas");
                    System.out.println("porfavor ingrese la catiad de productos que quiere");
                    p = funka.nextInt();
                    do {
                        if(p<=0){
                            System.out.println("la cantidad ingresada no es valida porfavor vuelva a intentarlo");
                            p = funka.nextInt();
                            CEC = CEC+1;
                        }
                    }while (p<0);
                    p = p * GALLETAS;

                    CU = CU+1;
                    CD= CD+p;

                    if (p < 50 ){
                        System.out.println("usted a tenido una compra pequeña");
                    }
                    if (p >50 & p <100 ){
                        System.out.println("usted a teninido una compra mediana ");
                    }
                    if (p>=100){
                        System.out.println("usted a teninido una compra grande");
                    }

                    System.out.println("su total a pagar es de "+ p);

                    p=0;

                    System.out.println("desea hacer otra compra ?");
                    System.out.println("0).- si");
                    System.out.println("1).- no");
                    RF= funka.nextInt();

                    break;
                }
                case 4:{
                    System.out.println("usted a selecionado que quiere un sandich");
                    System.out.println("porfavor ingrese la catiad de productos que quiere");
                    p = funka.nextInt();
                    do {
                        if(p<=0){
                            System.out.println("la cantidad ingresada no es valida porfavor vuelva a intentarlo");
                            p = funka.nextInt();
                            CEC = CEC+1;
                        }
                    }while (p<0);
                    p = p * SANDWICH;

                    CU = CU+1;
                    CD= CD+p;

                    if (p < 50 ){
                        System.out.println("usted a tenido una compra pequeña");
                    }
                    if (p <50 & p >100 ){
                        System.out.println("usted a teninido una compra mediana ");
                    }
                    if (p>=100){
                        System.out.println("usted a teninido una compra grande");
                    }

                    System.out.println("su total a pagar es de "+ p);

                    p=0;

                    System.out.println("desea hacer otra compra ?");
                    System.out.println("0).- si");
                    System.out.println("1).- no");
                    RF= funka.nextInt();

                    break;
                }
                case 5:{
                    System.out.println("usted a decidido salir de la maquina expendedora buen dia");
                    System.out.println("el total recaudado es de "+CD );
                    System.out.println("el total de productos vendidos es de "+CU);
                    System.out.println("el usuario a tenido "+CEC+ " erores en el menu de principal");
                    System.out.println("el usuario a tenido"+ CEC + " errores en el menu de selcion");
                    RF=1;
                }


            }
        }while(RF == 0);

        System.out.println("usted a decidido salir de la maquina expendedora buen dia");
        System.out.println("el total recaudado es de "+CD );
        System.out.println("el total de productos vendidos es de "+CU);
        System.out.println("el usuario a tenido "+CEP+ " erores en el menu de principal");
        System.out.println("el usuario a tenido"+ CEC + " errores en el menu de selcion");
        RF=1;


    }
}
