public class ForStatement {

    // Generar numeros pares entre 0 y 100

    public static void main(String[] args) {

        System.out.println("Números pares entre 0 y 100: ");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

}
