import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double matematik, fen, sosyal, turkce, hamPuanSayisal, hamPuanSozel;

        System.out.print("matematik netinizi giriniz : ");
        matematik = scanner.nextDouble();

        System.out.print("fen netinizi giriniz : ");
        fen = scanner.nextDouble();

        System.out.print("sosyal netinizi giriniz : ");
        sosyal = scanner.nextDouble();

        System.out.print("türkçe netinizi giriniz : ");
        turkce = scanner.nextDouble();

        hamPuanSozel = ((sosyal + turkce) * 1.8) + ((matematik + fen) * 0.4);
        hamPuanSayisal = ((matematik + fen) * 1.8) + ((sosyal + turkce) * 0.4);

        System.out.println("ham sözel puanınız yaklaşık : " + hamPuanSozel);
        System.out.println("ham sayısal puanınız yaklaşık : " + hamPuanSayisal);
    }
}