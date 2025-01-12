import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float uyku, yas, gunlukUyku, toplamYasadigiGun, toplamYasadigiSaat, toplamUyku, toplamUykuSaati, yuzdelikUyku;

        System.out.print("günde ortalama kaç saat uyuyorsunuz : ");
        uyku = scanner.nextFloat();

        System.out.print("kaç yaşınızdasınız : ");
        yas = scanner.nextFloat();

        toplamYasadigiGun = yas * 365;
        toplamYasadigiSaat = toplamYasadigiGun * 24;
        gunlukUyku = 24 - uyku;
        toplamUyku = gunlukUyku * toplamYasadigiGun;
        toplamUykuSaati = toplamYasadigiSaat - toplamUyku;
        yuzdelikUyku = toplamUykuSaati * 100 / toplamYasadigiSaat;

        System.out.println("bugüne kadar : " + toplamUykuSaati + " saat uyudunuz");
        System.out.println("ömrünüzün yaklaşık %" + yuzdelikUyku + " uykuda geçti");
    }
}