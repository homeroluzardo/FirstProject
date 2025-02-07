import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {

        System.out.println("Ingrese su edad:");
        Scanner teclado = new Scanner(System.in);
        int edad = teclado.nextInt();

        if (edad >= 18) {
            System.out.println("Puede acceder al sitio.");
        } else {
            System.out.println("No puede acceder al sitio.");
        }

        // IF Operador Ternario

        System.out.println("Ingrese otra edad:");
        edad = teclado.nextInt();
        System.out.println(edad >= 18 ? "Acceso garantizado." : "Acceso denegado.");

        // Otro IF

        System.out.println("Escoge 1, 2 ó 3:");
        Scanner teclado2 = new Scanner(System.in);
        String test = teclado2.nextLine();
        if (test.equals("1")) {
            System.out.println("Opción 1");
        } else if (test.equals("2")) {
            System.out.println("Opción 2");
        } else if (test.equals("3")) {
            System.out.println("Opción 3");
        } else {
            System.out.println("Ingresa una opción valida");
        }

    }

}
