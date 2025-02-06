import java.util.Scanner;

public class BuscadorGoogleMaps {
    public static void main(String[] args) {
        System.out.println("Ingresa el pais a buscar: ");
        Scanner inputKeyboard = new Scanner(System.in);
        String pais = inputKeyboard.nextLine();
        System.out.println("Haz clic en el enlace: " + "https://www.google.com/maps/search/" + pais);
    }
}
