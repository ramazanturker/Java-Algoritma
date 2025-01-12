public class Main {
    public static void main(String[] args) {
        double toplam = 0;
        double[] sayilar = new double[5000];

        for (double i = 1; i <= sayilar.length; i++) {
            toplam = toplam + (1 / (i * (i + 1)));
        }

        System.out.println("dizideki sayıların toplamı : " + toplam);
    }
}