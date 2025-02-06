import java.util.Scanner;

public class NumeroMayorMenor {
    public static void main(String[] args) {

        int numeroMayor;
        int numeroMenor;

        Scanner inputKeyboard = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        int numero1 = inputKeyboard.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int numero2 = inputKeyboard.nextInt();
        System.out.println("Ingrese el tercer numero:");
        int numero3 = inputKeyboard.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            numeroMayor = numero1;
        } else numeroMayor = Math.max(numero2, numero3);

        if (numero1 < numero2 && numero1 < numero3) {
            numeroMenor = numero1;
        } else numeroMenor = Math.min(numero2, numero3);

        System.out.println("El numero mayor es: " + numeroMayor);
        System.out.println("El numero menor es: " + numeroMenor);

    }
}
