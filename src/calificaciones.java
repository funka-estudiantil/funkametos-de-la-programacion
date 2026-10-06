import java.util.Scanner;

public class calificaciones {

    public static void main() {
        Scanner funka = new Scanner(System.in);
        double Cal1, Cal2, Cal3, Calf;
        final double MINIMO_APORBATORIA = 7;
        final double MINIMO_UNIDAD = 6;

        System.out.println("porfavor ingrese ingrese sus tres calificaciones de este parcial");
        Cal1 = funka.nextDouble();
        System.out.println("porfavor ingrese ingrese sus tres calificaciones de este parcial");
        Cal2 = funka.nextDouble();
        System.out.println("porfavor ingrese ingrese sus tres calificaciones de este parcial");
        Cal3 = funka.nextDouble();
        Calf = (Cal1 + Cal2 + Cal3) / 3;

        if (Cal1 <= MINIMO_UNIDAD || Cal2 <= MINIMO_UNIDAD || Cal3 <= MINIMO_UNIDAD) {
            System.out.println("deberas presentar tu examen de recuperacion");
        }
        if (Calf >= MINIMO_APORBATORIA) {
            System.out.println("tu calificacion de primer parcial es "+Cal1);
            System.out.println("tu calificacion de primer segundo es "+Cal2);
            System.out.println("tu calificacion de primer tercer es "+Cal3);
            System.out.println("tu promedio de este semestre es de "+Calf);
            System.out.println("en hora buenas has aprobado");
        } else {
            System.out.println("tu calificacion de primer parcial es "+Cal1);
            System.out.println("tu calificacion de primer segundo es "+Cal2);
            System.out.println("tu calificacion de primer tercer es "+Cal3);
            System.out.println("tu promedio de este semestre es de "+Calf);
            System.out.println("hechale mas ganas pq has reprobado ");
        }
    }
}
