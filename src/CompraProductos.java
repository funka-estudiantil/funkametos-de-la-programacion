import java.util.Scanner;

public class CompraProductos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Constantes
        final double LIMITE_DESCUENTO = 1000;
        final double PORCENTAJE_DESCUENTO = 0.10;
        final double COSTO_ENVIO = 80;
        final double LIMITE_ENVIO_GRATIS = 1500;

        // Variables
        double precioProducto;
        int cantidad;
        double subtotal;
        double descuento;
        double totalDescuento;
        double envio;
        double totalFinal;

        // Datos
        System.out.print("Precio del producto: $");
        precioProducto = sc.nextDouble();

        System.out.print("Cantidad: ");
        cantidad = sc.nextInt();

        // Calcular subtotal
        subtotal = precioProducto * cantidad;

        // Calcular descuento
        if (subtotal >= LIMITE_DESCUENTO) {
            descuento = subtotal * PORCENTAJE_DESCUENTO;
        } else {
            descuento = 0;
        }

        // Total después del descuento
        totalDescuento = subtotal - descuento;

        // Calcular envío
        if (totalDescuento >= LIMITE_ENVIO_GRATIS) {
            envio = 0;
        } else {
            envio = COSTO_ENVIO;
        }

        // Total final
        totalFinal = totalDescuento + envio;

        // Mostrar resultados
        System.out.println();
        System.out.println("=== RESULTADO ===");
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total con descuento: $" + totalDescuento);
        System.out.println("Envío: $" + envio);
        System.out.println("Total final: $" + totalFinal);

        sc.close();
    }
}