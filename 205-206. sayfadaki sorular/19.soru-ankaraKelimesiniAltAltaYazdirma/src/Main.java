public class Main {
    public static void main(String[] args) {
        char[] ankara = {'A', 'N', 'K', 'A', 'R', 'A'};

        for (int i = 1; i < ankara.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(ankara[j]);
            }
            System.out.println();
        }
        for (int i = ankara.length; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(ankara[j]);
            }
            System.out.println();
        }
    }
}