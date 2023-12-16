package java_code;

import java.util.Scanner;
public class paralellogram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(),i = 1;
        while(i<=n){
            int spaces = 1, stars = 1;
            while(spaces<i){
                System.out.print(" ");
                spaces++;
            }
            while(stars<=n){
                System.out.print("*");
                stars++;
            }
            System.out.println();
            i++;
        }
        scanner.close();
    }
}
