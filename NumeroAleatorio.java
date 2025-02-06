import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) {
        int numeroAleatorio = (int) (Math.random() * 11);
        System.out.println("Ingresa un numero entre 0 y 10 para adivinar: ");
        Scanner inputKeyboard = new Scanner(System.in);
        int numeroIngresado = inputKeyboard.nextInt();
        if (numeroIngresado == numeroAleatorio) {
            System.out.println("Acertaste!");
        } else {
            System.out.println("No Acertaste!");
        }
        System.out.println("Numero aleatorio es: " + numeroAleatorio);

        // Números del 1 al 100 con While:

        System.out.println(" ");
        System.out.println("Números del 1 al 100 utilizando while:");

        int contador = 0;
        while (contador < 100) {
            contador++;
            System.out.println(contador);
        }

    }
}
