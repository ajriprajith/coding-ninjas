import java.util.Scanner;
import java.lang.Math;
public class binarytodecimal {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(),dec= 0;
        for (int i = 0; n!=0 ; i++) {
            int x = n%10;
            dec = dec +x*((int) Math.pow(2, i));
            n /= 10;
        }
        System.out.println(dec);
        scanner.close();        
    }
}
