import java.util.Scanner;
public class test13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[10];
        // Read the number of test cases
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int t = 0; t < T; t++) {
            // Read two numbers 'X' and 'Y' for each test case
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            // Calculate and print the GCD of X and Y
            int gcd = findGCD(X, Y);
            arr[t] = gcd;
        }
        for(int t = 0; t < T; t++)
            System.out.println(arr[t]);

        scanner.close();
    }

    // Function to find the GCD using the Euclidean algorithm
    static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
    
}