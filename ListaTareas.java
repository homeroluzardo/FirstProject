import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaTareas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Scanner tecladoNuevaTarea = new Scanner(System.in);
        final String TACHADO = "\u001B[9m";
        final String RESET = "\u001B[0m";

        System.out.println("\nPrograma para Gestionar Tareas:");
        List<String> lista = new ArrayList<>();
        lista.add("Crear contenido y grabar video.");
        lista.add("Editar video para YouTube.");
        lista.add("Realizar la miniatura del video.");
        lista.add("Publicar el video.");

        int opcionElegida = 1;

        while (opcionElegida != 0) {

            System.out.println("\nQue deseas hacer?: ");
            System.out.println("1) Agregar tarea. 2) Mostrar tareas. 3) Completar tarea. 4) Borrar tarea. 0) Salir.");

            opcionElegida = teclado.nextInt();

            switch (opcionElegida) {

                case 1: agregarTarea(tecladoNuevaTarea, lista); mostrarTareas(lista); break;
                case 2: mostrarTareas(lista); break;
                case 3: mostrarTareas(lista); completarTarea(teclado, lista, TACHADO, RESET); break;
                case 4: mostrarTareas(lista); borrarTarea(teclado, lista); break;
                case 0: System.out.println("\nAdios!"); break;

            }

        }
    }

    private static void agregarTarea(Scanner tecladoNuevaTarea, List<String> lista) {
        System.out.println("\nIngresa una nueva tarea: ");
        String nuevaTarea = tecladoNuevaTarea.nextLine();
        lista.add(nuevaTarea);
    }

    private static void mostrarTareas(List<String> lista) {
        System.out.println("\nTareas:");
        for (int i = 0; i < lista.size(); i++) {
            String tarea = lista.get(i);
            System.out.println((i + 1) + ") " + tarea);
        }
    }

    private static void completarTarea(Scanner teclado, List<String> lista, String TACHADO, String RESET) {
        System.out.println("\nCual tarea ya completaste?: ");
        int tareaCompletada = teclado.nextInt();
        lista.set(tareaCompletada - 1, TACHADO + lista.get(tareaCompletada - 1) + RESET);
    }

    private static void borrarTarea(Scanner teclado, List<String> lista) {
        System.out.println("\nCual tarea deseas borrar?: ");
        int tareaBorrada = teclado.nextInt();
        lista.remove(tareaBorrada - 1);
    }


}
