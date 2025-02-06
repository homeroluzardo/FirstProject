import java.util.Scanner;

public class CalculadorIMC {
    public static void main(String[] args) {

        Scanner keyboardUser = new Scanner(System.in);
        System.out.println("Ingresa tu peso:");
        double peso = keyboardUser.nextDouble();
        System.out.println("Ingresa tu altura:");
        double altura = keyboardUser.nextDouble();
        double masaCorporal = peso / (altura * altura);
        System.out.println("Tu Indice de Masa Corporal es de: " + masaCorporal);

        if (masaCorporal < 18.5) System.out.println("Estas en un peso menor al normal.");
        if (masaCorporal >= 18.5 && masaCorporal <= 24.9) System.out.println("Estas en un peso normal.");
        if (masaCorporal >= 25 && masaCorporal <= 29.9) System.out.println("Estas en sobrepeso.");
        if (masaCorporal > 30) System.out.println("Estas en estado obeso.");

    }
}