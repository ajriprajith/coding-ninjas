import java.util.*;
public class fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), a = 1, b = 1;
        for(int i = 1; i < n-1; i++){
            int fib = a + b; 
            b = a;
            a = fib;
        }
        System.out.println(a);
        scanner.close();
    }
}
