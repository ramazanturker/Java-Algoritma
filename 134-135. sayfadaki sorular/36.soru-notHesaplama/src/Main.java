import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int notOrtalamasi = 1, ogrenci;

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ". öğrenci notu : ");
            ogrenci = scanner.nextInt();

            notOrtalamasi += ogrenci;
        }

        notOrtalamasi = notOrtalamasi / 10;

        System.out.println("dersin not ortalaması : " + notOrtalamasi);
    }
}