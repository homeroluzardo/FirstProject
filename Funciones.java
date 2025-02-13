public class Funciones {

    public static void main(String[] args) {

        areaTriangulo((double)3.0F, (double)5.0F);
        areaTriangulo((double)5.0F, (double)5.0F);

        int resultadoMultiplicar1 = multiplicarDosNros(2, 5);
        System.out.println("Multiplicación 1: " + resultadoMultiplicar1);
        int resultadoMultiplicar2 = multiplicarDosNros(5, 15);
        System.out.println("Multiplicación 2: " + resultadoMultiplicar2);
        System.out.println("Suma de los resultados de las dos multiplicaciones: " + (resultadoMultiplicar1 + resultadoMultiplicar2));

        tablaMultiplicar(5);
        tablaMultiplicar(9);

        String correo1 = "homeroeluzardo@gmail.com";
        String correo2 = "homeroeluzardogmail.com";
        String correo3 = "homeroeluzardo@gmailcom";
        String correo4 = "homeroeluzardo@gm ail.com";
        System.out.println(" ");
        validarCorreo(correo1);
        validarCorreo(correo2);
        validarCorreo(correo3);
        validarCorreo(correo4);
    }

    public static void areaTriangulo(double base, double altura) {
        double area = base * altura / (double)2.0F;
        System.out.println("Area Triangulo (Base: " + base + ", Altura: " + altura + ") = " + area);
    }

    public static int multiplicarDosNros(int nro1, int nro2) {
        return nro1 * nro2;
    }

    public static void tablaMultiplicar(int numero) {
        System.out.println("\nTabla de Multiplicar del número " + numero + ": ");

        for(int i = 1; i <= 10; ++i) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }

    }

    private static void validarCorreo(String correo) {
        boolean tieneArroba = correo.contains("@");
        boolean tienePunto = correo.contains(".");
        boolean tieneEspacio = correo.contains(" ");
        System.out.println(tieneArroba && tienePunto && !tieneEspacio ? "El correo: " + correo + " es valido." : "El correo: " + correo + " NO es valido.");
    }
}