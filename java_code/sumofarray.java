package java_code;

import java.util.Scanner;
class Sumofarray{
    public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    int test_cases = scanner.nextInt();
    int sum[] = new int[test_cases];
    for (int i = 0; i < test_cases; i++){
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int j = 0; j < n; j++){
            arr[j] = scanner.nextInt();
            sum[i] += arr[j];
        }
    }
    for (int i = 0; i < test_cases; i++){
        System.out.println(sum[i]);
    }
    scanner.close();
}
}