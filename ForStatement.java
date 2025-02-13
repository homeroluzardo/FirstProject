public class ForStatement {

    public static void main(String[] args) {

        // Generar números pares entre 0 y 100
        System.out.println("Números pares entre 0 y 100: ");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Generar números del 1 al 100 divisibles entre 4 y 7
        System.out.println(" ");
        System.out.println("Números del 1 al 100 divisibles entre 4 y 7: ");
        for (int i = 1; i <= 100; i++) {
            if ((i % 4 == 0) && (i % 7 == 0)) {
                System.out.println(i);
            }

        }

    }

}
