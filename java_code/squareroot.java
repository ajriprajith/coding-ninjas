package java_code;

import java.util.Scanner;
import java.lang.Math;
public class squareroot {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), x = (int)Math.sqrt(n);
        System.out.println(x);
        scanner.close();
    }
}
