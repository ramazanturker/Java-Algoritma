import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double hacimAlanOrani, prizmaHacim, prizmaAlan, yukseklik, genislik, derinlik;

        System.out.print("yükseklik giriniz : ");
        yukseklik = scanner.nextDouble();

        System.out.print("genişlik giriniz : ");
        genislik = scanner.nextDouble();

        System.out.print("derinlik giriniz : ");
        derinlik = scanner.nextDouble();

        prizmaHacim = yukseklik * genislik * derinlik;
        System.out.println("dikdörtgenler prizmasının hacmi : " + prizmaHacim);

        prizmaAlan = 2 * ((yukseklik * genislik) + (genislik * derinlik) + (yukseklik * derinlik));
        System.out.println("dikdörtgenler prizmasının alanı : " + prizmaAlan);

        hacimAlanOrani = prizmaAlan / prizmaHacim;
        System.out.println("dikdörtgenler prizmasının hacimim alana oranı : " + hacimAlanOrani);
    }
}