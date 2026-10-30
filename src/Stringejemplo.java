import java.util.Locale;

public class Stringejemplo {
    public static void  main (String[] args) {
        String texto = "hola mundo";
        System.out.println(texto.length());
        System.out.println(texto.toUpperCase());
        System.out.println(texto.toLowerCase());
        System.out.println(texto.contains("mundo"));
        System.out.println(texto.substring(0, 4));
        System.out.println(texto.charAt(0));
        System.out.println(texto.replace("mundo", "hola"));







        int edad = 18 ;
        String resultado1 = edad >= 18 ? "mayor de edad ": "menor de edad";
        System.out.println(edad >= 18 ? "mayor de edad": "menor de edad ");
        System.out.println(resultado1);
    }
}






