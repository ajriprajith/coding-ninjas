package java_code;

import java.util.Scanner;
public class linearsearch {
    public static int search(int[] arr, int x){
        int search = -1;
        for(int i=1; i<arr.length;i++){
            if(x==arr[i]){
                search = i;
            }
        }
        return search;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(),arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        int search_num = scanner.nextInt();
        System.out.println(search(arr, search_num));
        scanner.close();
    }
}
