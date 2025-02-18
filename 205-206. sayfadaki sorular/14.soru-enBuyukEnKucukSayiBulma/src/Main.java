import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sayi = 1;
        
        List<Integer> sayilar = new ArrayList<Integer>();
        
        for (int i = 1; sayi > -1; i++) {
            
            System.out.print(i + ". sayı : ");
            sayi = scanner.nextInt();
                
            if (sayi == -1) {
                break;
            } else {
                sayilar.add(sayi);
            }
        }
        
        int min = sayilar.get(0);
        int max = sayilar.get(0);
        
        int n = sayilar.size();
        
        for (int j = 1; j < n; j++) {
            if (sayilar.get(j) < min) {
                min = sayilar.get(j);
            }
        }
        
        for (int k = 1; k < n; k++) {
            if (sayilar.get(k) > max) {
                max = sayilar.get(k);
            }
        }
        
        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);
        
    }
}
