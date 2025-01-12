import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sayi;
        String[] alfabe = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "İ", "J", "K", "L", "M", "N", "O", "Ö", "P", "R", "S", "Ş", "T", "U", "Ü", "V", "Y", "Z"};

        System.out.print("bir sayı giriniz : ");
        sayi = scanner.nextInt();

        for (int i = 1; i <= sayi; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(alfabe[j]);
            }
            System.out.println();
        }
    }
}