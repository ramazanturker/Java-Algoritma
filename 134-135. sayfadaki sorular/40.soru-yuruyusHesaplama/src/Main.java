import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gunlukOrtalamaYuruyus = 2, toplamYas, toplamYasadigiGun, toplamYuruyusAdimi;
        double dunyaCevre = 40000, toplamDunyaKati;

        System.out.print("kaç yaşındasınız : ");
        toplamYas = scanner.nextInt();

        toplamYasadigiGun = toplamYas * 365;
        toplamYuruyusAdimi = gunlukOrtalamaYuruyus * toplamYasadigiGun;
        toplamDunyaKati = toplamYuruyusAdimi / dunyaCevre;

        System.out.println("günde ortalama 2 km yürüyerek toplamda " + toplamYuruyusAdimi + " km yürüdünüz.");
        System.out.println("günde ortalama 2 km yürüyerek dünyanın çevresinin " + toplamDunyaKati + " katı kadar yürümüş oldunuz!");

        System.out.println();
        System.out.println("***************************************");
        System.out.println();

        int yuruyus, yas, yasadigiGun, toplamAdim;
        double dunyaninCevresi = 40000, dunyaninKati;

        System.out.print("kaç yaşındasınız : ");
        yas = scanner.nextInt();

        System.out.print("günde ortalama kaç km yürüyorsunuz : ");
        yuruyus = scanner.nextInt();

        yasadigiGun = yas * 365;
        toplamAdim = yuruyus * yasadigiGun;
        dunyaninKati = toplamAdim / dunyaninCevresi;

        System.out.println("bugüne kadar toplam " + toplamAdim + " km yürüdünüz.");
        System.out.println("dünyanın çevresinin " + dunyaninKati + " katı eder!");
    }
}