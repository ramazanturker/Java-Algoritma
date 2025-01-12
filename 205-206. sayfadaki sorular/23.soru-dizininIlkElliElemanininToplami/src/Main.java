public class Main {
    public static void main(String[] args) {

        double toplam = 0;
        double[] sayilar = new double[50];

        for (double i = 1; i <= sayilar.length; i++) {
            toplam = toplam + (1 / i);
        }

        System.out.println("dizideki sayıların toplamı : " + toplam);
    }
}