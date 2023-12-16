package java_code;

import java.util.Scanner;
public class minelement {
    public static int min(int[] arr){
        int min = arr[0];
        for(int i=1; i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(),arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(min(arr));
        scanner.close();
    }
}
