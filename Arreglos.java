import java.util.Arrays;

public class Arreglos {

    public static void main(String[] args) {

        String[] nombres = new String[4];
        nombres[0] = "Homero";
        nombres[1] = "Enrique";
        nombres[2] = "Luzardo";
        nombres[3] = "Pineda";

        // Imprimiendo el arreglo
        System.out.println("\nRecorriendo el arreglo: ");
        System.out.println(Arrays.toString(nombres));
        // Imprimiendo un valor del arreglo
        System.out.println("\nImprimiendo un valor del arreglo: ");
        System.out.println(nombres[2]);
        // Recorriendo el arreglo con un For:
        System.out.println("\nRecorriendo el arreglo con un For: ");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

    }

}
