import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double aylik, saatlikUcret, gunlukOrtalamaSaat, aylikCalismaGunu;

        System.out.print("saatlik ücretinizi giriniz : ");
        saatlikUcret = scanner.nextDouble();

        System.out.print("günde ortalama kaç saat çalıştığınızı giriniz : ");
        gunlukOrtalamaSaat = scanner.nextDouble();

        System.out.print("ayda kaç gün çalıştığınızı giriniz : ");
        aylikCalismaGunu = scanner.nextDouble();

        aylik = saatlikUcret * gunlukOrtalamaSaat * aylikCalismaGunu;

        System.out.println("aylık kazancınız : " + aylik);
    }
}