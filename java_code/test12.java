package java_code;

import java.util.Scanner;
public class test12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[50];

        for(int i = 0; i <n; i++) 
            arr[i] = scanner.nextInt();

        for(int i = 0; i < n; i++){
            for(int x = 0; x < arr[i]; x++){
            for(int k = 0; k < x; k++)
                    System.out.print(" ");
            for(int j = arr[i]-x; j > 0; j--){
                    System.out.print("*");
            }
            System.out.println();
        }
    } 
        
        scanner.close();
    }    
}
