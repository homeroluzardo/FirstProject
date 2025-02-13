import java.util.Scanner;

public class CalcIntCompuesto {

    public static void main(String[] args) {

        // Calculadora de Interés Compuesto
        System.out.println("Calculadora de Interés Compuesto: ");

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el capital inicial: ");
        float capitalInicial = teclado.nextFloat();
        System.out.println("Ingrese cuanto planea ahorrar anualmente: ");
        float adicionAnual = teclado.nextFloat();
        System.out.println("Ingrese la tasa de interés anual: ");
        float tasaInteresAnual = teclado.nextFloat();
        System.out.println("Ingrese la cantidad de años: ");
        int periodoAnos = teclado.nextInt();

        float montoFinal = capitalInicial;

        for (int i = 0; i < periodoAnos; i++) {
            float crecimientoAnual = montoFinal * (tasaInteresAnual / 100);
            montoFinal += (adicionAnual + crecimientoAnual);
        }

        System.out.println(montoFinal);

    }

}
