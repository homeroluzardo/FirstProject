import java.util.Scanner;

public class Regla_50_30_20 {
    public static void main(String[] args) {

        System.out.println("Ingresa tu salario:");
        Scanner teclado = new Scanner(System.in);
        float salario = teclado.nextFloat();

        float necesidades = salario * 0.50f;
        // Redondear a dos decimales
        float otrasCosas = Math.round((salario * 0.30f) * 100) / 100.0f;
        float ahorros = Math.round((salario * 0.20f) * 100) / 100.0f;

        System.out.println("Deberías distribuir tu salario de $" + salario + " de la siguiente manera: ");
        System.out.println("Necesidades: $" + necesidades);
        System.out.println("Otras cosas: $" + otrasCosas);
        System.out.println("Ahorros: $" + ahorros);

    }
}
