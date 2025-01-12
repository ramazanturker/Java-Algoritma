import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char harf;

        System.out.print("bir harf giriniz : ");
        harf = scanner.next().charAt(0);

        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(harf);
        }

        for (int k = 4; k > 0; k--) {
            for (int l = 1; l < k; l++) {
                System.out.print(" ");
            }
            System.out.println(harf);
        }

    }
}