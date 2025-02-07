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

    }
}
