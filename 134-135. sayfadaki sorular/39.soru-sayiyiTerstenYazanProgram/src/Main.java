import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sayi, tersSayi;

        System.out.print("5 basamaklı bir sayı giriniz : ");
        sayi = scanner.nextInt();

        System.out.print("girilen sayının tersi : ");

        while (sayi > 0) {
            tersSayi = sayi % 10;
            System.out.print(tersSayi);
            sayi = sayi / 10;
        }

    }
}