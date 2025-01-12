import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sayi, negatifSayac = 0, pozitifSayac = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ". sayı : ");
            sayi = scanner.nextInt();

            if (sayi < 0) {
                negatifSayac++;
            }
            if (sayi > 0) {
                pozitifSayac++;
            }
        }

        System.out.println(negatifSayac + " adet negatif sayı mevcuttur!");
        System.out.println(pozitifSayac + " adet pozitif sayı mevcuttur!");
    }
}