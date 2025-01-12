import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double yaricap, kureHacim, pi = 3.14;

        System.out.print("yarıçapı giriniz : ");
        yaricap = scanner.nextDouble();

        kureHacim = (pi * (yaricap * yaricap * yaricap) * 4 / 3);

        System.out.print("kürenin hacmi : " + kureHacim);
    }
}