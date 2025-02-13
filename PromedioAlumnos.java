import java.util.Scanner;

public class PromedioAlumnos {

    public static void main(String[] args) {

        System.out.println("\nPrograma para ingresar notas y mostrar los promedios de los Alumnos.");
        System.out.println("Ingrese la cantidad de Alumnos:");
        Scanner teclado = new Scanner(System.in);
        int cantidad = teclado.nextInt();

        String[] alumnos = new String[cantidad];
        Float[] promedios = new Float[cantidad];

        for (int i = 0; i < cantidad; i++) {

            System.out.println("Ingrese el nombre del alumno #" + (i + 1) +": ");
            alumnos[i] = teclado.next();

            System.out.println("Ingrese la nota del primer semestre: ");
            float nota1 = teclado.nextFloat();

            System.out.println("Ingrese la nota del segundo semestre: ");
            float nota2 = teclado.nextFloat();

            promedios[i] = (nota1 + nota2) / 2;

        }

        System.out.println("\nResumen de Alumnos y Promedios:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Alumno: " + alumnos[i] + " - Promedio: " + promedios[i]);
        }

    }
}
