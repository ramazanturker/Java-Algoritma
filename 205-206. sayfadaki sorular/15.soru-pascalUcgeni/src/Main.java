import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int satir, sayi;

        System.out.print("pascal üçgeninin satır sayısını giriniz : ");
        satir = scanner.nextInt();

        for (int i = 0; i < satir; i++) {

            for (int k = satir; k > i; k--) {
                System.out.print(" ");
            }

            sayi = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(sayi + " ");
                sayi = sayi * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}