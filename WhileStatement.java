import java.util.Scanner;

public class WhileStatement {
    public static void main(String[] args) {

        // Números del 1 al 10 con While:

        System.out.println("Números del 1 al 10 utilizando while:");
        int contador = 0;
        while (contador < 10) {
            contador++;
            System.out.println(contador);
        }

        // Elija la opción que desee:

        int opcionEscogida = 1;

        while (opcionEscogida != 0) {

            System.out.println(" ");
            System.out.println("Elija la opción que desee:");
            System.out.println("1) Contactar con soporte técnico");
            System.out.println("2) Contactar con compras");
            System.out.println("3) Contactar con marketing");
            System.out.println("4) Contactar con prensa");
            System.out.println("5) Consultar saldo");
            System.out.println("0) Salir");

            Scanner teclado = new Scanner(System.in);
            opcionEscogida = teclado.nextInt();

            if (opcionEscogida == 1) System.out.println("Contactando con soporte técnico ...");
            if (opcionEscogida == 2) System.out.println("Contactando con compras ...");
            if (opcionEscogida == 3) System.out.println("Contactando con marketing ...");
            if (opcionEscogida == 4) System.out.println("Contactando con prensa ...");
            if (opcionEscogida == 5) System.out.println("Su saldo es de: ...");

        }

        System.out.println(" ");
        System.out.println("Programa finalizado. Adios!");

    }
}
