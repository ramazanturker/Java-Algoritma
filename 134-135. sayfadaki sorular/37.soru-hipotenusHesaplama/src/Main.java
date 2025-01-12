import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double hipotenus, kenar1, kenar2;

        System.out.print("1. kenari giriniz : ");
        kenar1 = scanner.nextDouble();

        System.out.print("2. kenari giriniz : ");
        kenar2 = scanner.nextDouble();

        hipotenus = (kenar1 * kenar1) + (kenar2 * kenar2);

        hipotenus = Math.sqrt(hipotenus);

        System.out.println("hipotenüs : " + hipotenus);
    }
}