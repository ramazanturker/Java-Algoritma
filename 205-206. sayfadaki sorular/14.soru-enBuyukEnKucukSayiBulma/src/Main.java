import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int adet, sayac, sayi, enBuyuk, enKucuk;

        System.out.print("kaç sayı gireceksiniz : ");
        adet = scanner.nextInt();

        System.out.print("1. sayıyı giriniz : ");
        sayi = scanner.nextInt();

        enKucuk = sayi;
        enBuyuk = sayi;
        sayac = 1;

        while (sayac < adet) {
            sayac++;

            System.out.print(sayac + ". sayıyı giriniz : ");
            sayi = scanner.nextInt();

            if (sayi == -1) {
                break;
            }

            if (enBuyuk < sayi) {
                enBuyuk = sayi;
            }
            if (enKucuk > sayi) {
                enKucuk = sayi;
            }
        }

        System.out.println("girilen en büyük sayı : " + enBuyuk);
        System.out.println("girilen en küçük sayı : " + enKucuk);
    }
}