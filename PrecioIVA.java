import java.util.Scanner;

public class PrecioIVA {
    public static void main(String[] args) {

        System.out.println("Ingresa el precio del producto:");
        Scanner teclado = new Scanner(System.in);
        float precio = teclado.nextFloat();
        float iva = 0.21f;
        float precioIva = precio * iva;
        float precioFinal = precioIva + precio;

        System.out.println("Precio Producto: $" + precio);
        System.out.println("IVA: $" + precioIva);
        System.out.println("Precio Final: $" + precioFinal);

    }
}
