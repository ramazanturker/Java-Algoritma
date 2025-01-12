import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char birimA = 'A', birimB = 'B', birimC = 'C';
        double birimEkipA, toplamA = 0, birimEkipB, toplamB = 0, birimEkipC, toplamC = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.print("birim " + birimA + " ekip " + i + " : ");
            birimEkipA = scanner.nextDouble();

            toplamA += birimEkipA;
        }

        for (int j = 1; j <= 4; j++) {
            System.out.print("birim " + birimB + " ekip " + j + " : ");
            birimEkipB = scanner.nextDouble();

            toplamB += birimEkipB;
        }

        for (int k = 1; k <= 4; k++) {
            System.out.print("birim " + birimC + " ekip " + k + " : ");
            birimEkipC = scanner.nextDouble();

            toplamC += birimEkipC;
        }

        if (toplamA > toplamB && toplamA > toplamC) {
            System.out.println("birim " + birimA + " toplam " + toplamA + " milyon'luk satışla birincidir");
        }
        if (toplamB > toplamA && toplamB > toplamC) {
            System.out.println("birim " + birimB + " toplam " + toplamB + " milyon'luk satışla birincidir");
        }
        if (toplamC > toplamA && toplamC > toplamB) {
            System.out.println("birim " + birimC + " toplam " + toplamC + " milyon'luk satışla birincidir");
        }
    }
}