import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double kupKenar, kupHacim, yaricap, kureHacim, pi = 3.14, kupKureOrani;

        System.out.print("küpün kenar uzunluğu : ");
        kupKenar = scanner.nextDouble();

        yaricap = kupKenar;

        kupHacim = kupKenar * kupKenar * kupKenar;
        kureHacim = (pi * (yaricap * yaricap * yaricap) * 4 / 3);

        kupKureOrani = kureHacim / kupHacim;

        System.out.println("kürenin hacminin küpün hacmine oranı : " + kupKureOrani);

    }
}