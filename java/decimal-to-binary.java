import java.util.Scanner;
class decimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt(), mul = 1;
        long bi = 0;
        while( n != 0) {
            long x = n%2;
            bi = bi + x*mul;
            n /= 2;
            mul *= 10;
        }
        System.out.println(bi);
        scanner.close();
    }
}
