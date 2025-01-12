import java.util.Scanner;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yasananGun, dogumYili, dogumAyi, dogumGunu;

        System.out.print("doğduğunuz yılı giriniz : ");
        dogumYili = scanner.nextInt();

        System.out.print("doğduğunuz ayı giriniz : ");
        dogumAyi = scanner.nextInt();

        System.out.print("doğduğunuz günü giriniz : ");
        dogumGunu = scanner.nextInt();

        LocalDate dogumBilgileri = LocalDate.of(dogumYili, dogumAyi, dogumGunu);

        LocalDate simdikiTarih = LocalDate.now();

        Period yasamSuresi = Period.between(dogumBilgileri, simdikiTarih);

        System.out.println("bugüne kadar " + yasamSuresi.getYears() + " yıl " + yasamSuresi.getMonths() + " ay " + yasamSuresi.getDays() + " gün yaşadınız");
    }
}