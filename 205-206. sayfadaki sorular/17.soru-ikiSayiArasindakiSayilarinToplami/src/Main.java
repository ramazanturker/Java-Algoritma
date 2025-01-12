import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sayi1, sayi2, toplam = 0;

        System.out.print("1. sayıyı giriniz : ");
        sayi1 = scanner.nextInt();

        System.out.print("2. sayıyı giriniz : ");
        sayi2 = scanner.nextInt();

        for (int i = sayi1; i <= sayi2; i++) {
            System.out.print(i + " + ");
            toplam += i;
        }

        System.out.print("= " + toplam);
    }
}