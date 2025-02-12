import java.util.Scanner;

public class GeneradorPassword {

    public static void main(String[] args) {

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[]{}|;:'\",.<>/?`~";
        System.out.println("Generar una Contraseña con los siguientes caracteres: " + caracteres);
        StringBuilder passwordGenerado = new StringBuilder();

        System.out.println("Introduce la longitud de la Contraseña a generar: ");
        Scanner teclado = new Scanner(System.in);
        int longitudPassword = teclado.nextInt();

        for (int i = 0; i < longitudPassword; i++) {
            int numeroAleatorio = (int) (Math.random() * 94);
            passwordGenerado.append(caracteres.charAt(numeroAleatorio));
        }

        System.out.println("La contraseña generada es: " + passwordGenerado);

    }

}
