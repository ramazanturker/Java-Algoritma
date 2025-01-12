import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char karakter;
        int sayi, i, j, k, l, m, n;

        System.out.print("bir karakter giriniz : ");
        karakter = scanner.next().charAt(0);

        System.out.print("bir sayı giriniz : ");
        sayi = scanner.nextInt();

        for (i = 1; i <= sayi - 1; i++) {
            for (j = 1; j <= (sayi - i); j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i) - 1; k++) {
                System.out.print(karakter);
            }
            System.out.println();
        }

        for (l = sayi; l >= 1; l--) {
            for (m = 1; m <= sayi - l; m++) {
                System.out.print(" ");
            }
            for (n = 1; n <= (2 * l) - 1; n++) {
                System.out.print(karakter);
            }
            System.out.println();
        }
    }
}