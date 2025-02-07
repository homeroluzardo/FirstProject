import java.util.Scanner;

public class DoWhileStatement {
    public static void main(String[] args) {

        int intentos = 3;
        int contadorIntentos = 1;
        String password = "homero";
        Scanner teclado = new Scanner(System.in);
        String passwordUser;

        do {
            System.out.println("Ingrese su password:");
            passwordUser = teclado.nextLine();
            contadorIntentos++;

            if (passwordUser.equals(password)) {
                System.out.println("Inicio sesión correctamente!");
                break;
            } else {
                System.out.println("Password incorrecto. " + contadorIntentos + "/" + intentos + " intentos.");
            }

        } while (contadorIntentos <= intentos);

        if (!passwordUser.equals(password)) {
            System.out.println("Password incorrecto. Cuenta bloqueada por 30 minutos.");
        }

    }
}
