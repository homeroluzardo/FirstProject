import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {

        String[] palabras = {"Piedra", "Papel", "Tijera"};
        int computadora = (int) (Math.random() * palabras.length) + 1;
        System.out.println(computadora);

        System.out.println("Juego Piedra - Papel - Tijera :");
        System.out.println("Escoge una opción: ");
        System.out.println("1. Piedra. ");
        System.out.println("2. Papel. ");
        System.out.println("3. Tijera. ");

        Scanner inputKeyboard = new Scanner(System.in);
        int usuario = inputKeyboard.nextInt();

        if (computadora == usuario) {
            System.out.println("EMPATE! " + "Usuario: " + palabras[usuario - 1] + ", Computadora: " + palabras[computadora - 1]);
        } else if ((usuario == 1 && computadora == 2) || (usuario == 2 && computadora == 3) || (usuario == 3 && computadora == 1)) {
            System.out.println("PERDISTE! " + "Usuario: " + palabras[usuario - 1] + ", Computadora: " + palabras[computadora - 1]);
        } else {
            System.out.println("GANASTE! " + "Usuario: " + palabras[usuario - 1] + ", Computadora: " + palabras[computadora - 1]);
        }

    }
}
