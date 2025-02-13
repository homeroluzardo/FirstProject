import java.util.Scanner;

public class ImgYouTube {

    public static void main(String[] args) {

        System.out.println("\nPrograma para extraer la miniatura de un video de YouTube.");
        System.out.println("Ingrese o peque la URL del video:");

        Scanner teclado = new Scanner(System.in);
        String urlVideo = teclado.nextLine();

        String[] urlSplit = urlVideo.split("v=");
        String idVideo = urlSplit[1];
        String[] splitInfoExtra = idVideo.split("&");
        idVideo = splitInfoExtra[0];
        String urlImage = "https://i3.ytimg.com/vi/" + idVideo + "/maxresdefault.jpg";
        System.out.println("Haz clic en el siguiente enlace para ver la imagen: " + urlImage);

    }

}
